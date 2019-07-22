package pages;

import libs.ActionsWithOurElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.regex.Pattern;

abstract public class ParentPage {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithOurElements actionsWithOurElements;
    public static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    final String BASE_URL = "dou.ua";
    String expectedUrl;

    public ParentPage(WebDriver webDriver, String partUrl,String partUrl1 ) {
        this.webDriver = webDriver;
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(webDriver)), this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        expectedUrl = partUrl+ BASE_URL +partUrl1;
    }

    public void checkCurrentUrl(){
        try {
            logger.info(expectedUrl);
            logger.info((webDriver.getCurrentUrl()));
            Assert.assertEquals("URL is not expected", Pattern.matches(expectedUrl,webDriver.getCurrentUrl()),
                    true);
        }catch (Exception e){
            logger.error("Can not get url" + e);
            Assert.fail("Can not get url");
        }
    }

}
