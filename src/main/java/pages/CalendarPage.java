package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends ParentPage {
    @FindBy(xpath = "/html/body/div/div[5]/div/div[2]/div/div/div[1]/div[1]/h1/select[1]")
    protected WebElement cityDD;

    @FindBy(xpath = "/html/body/div/div[5]/div/div[2]/div/div/div[1]/div[1]/h1/select[2]")
    protected WebElement themeDD;

    public CalendarPage(WebDriver webDriver) {
        super(webDriver, "https://", "/calendar/");
    }

    public void selectCityNameFromDropDown(String cityName) {
        actionsWithOurElements.selectTextInDD(cityDD, cityName);
    }

    public void selectThemeEventFromDropDown(String themeEvent) {
        actionsWithOurElements.selectTextInDD(themeDD, themeEvent);
    }
}
