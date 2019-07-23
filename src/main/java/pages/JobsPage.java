package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsPage extends ParentPage {

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div[1]/ul/li[4]/a")
    protected WebElement ratings;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/h1/select")
    protected WebElement cityNameDD;




    public JobsPage(WebDriver webDriver) {
        super(webDriver, "https://jobs.", "");
    }


    public void clickOnRatings() {
        actionsWithOurElements.clickOnElement(ratings);
    }

    public void selectCityNameFromDropDown(String cityName) {
        actionsWithOurElements.selectTextInDD(cityNameDD, cityName);
    }
}
