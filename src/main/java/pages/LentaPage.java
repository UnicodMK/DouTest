package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LentaPage extends ParentPage {

    @FindBy(xpath = "/html/body/div/div[5]/div/div[2]/div/div/div[3]/div[1]/ul/li[11]/div/a")
    protected WebElement top50Company;



    public LentaPage(WebDriver webDriver) {
        super(webDriver, "https://", "/lenta/");
    }



    public void clickOnTop50Company() {
        actionsWithOurElements.clickOnElement(top50Company);
    }
}
