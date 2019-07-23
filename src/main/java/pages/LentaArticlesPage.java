package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LentaArticlesPage extends ParentPage {

    @FindBy(xpath = "//*[@id=\"top50-jan-2019-table\"]/table/tbody/tr[1]/td[2]/div[1]/a")
    protected WebElement firstCompany;

    public LentaArticlesPage(WebDriver webDriver) {
        super(webDriver, "https://", "/lenta/articles/top-50-jan-2019/?from=special");
    }
    public void choiseFirstCompsny() {
        actionsWithOurElements.clickOnElement(firstCompany);
    }
}

