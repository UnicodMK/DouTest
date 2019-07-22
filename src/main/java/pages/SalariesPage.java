package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalariesPage extends ParentPage{

    public SalariesPage(WebDriver webDriver) {
        super(webDriver,"https://jobs." ,"/salaries/");
    }





    @FindBy(xpath = "//*[@id=\"ajax-vacancies\"]/h4/a")
    private WebElement menuVacancies;

    @FindBy(name = "period")
    private WebElement periodDD;

    @FindBy(name = "city")
    private WebElement cityDD;

    @FindBy(name = "title")
    private WebElement titleDD;

    @FindBy(name = "language")
    private WebElement languageDD;



    public void clickOnMenuVacancies() {
        actionsWithOurElements.clickOnElement(menuVacancies);
    }

    public void selectPeriodTypeFromDropDown( String periodType) {
         actionsWithOurElements.selectTextInDD(periodDD, periodType);

    }

    public void selectCityTypeFromDropDown(String cityType) {
        actionsWithOurElements.selectTextInDD(cityDD, cityType);
    }

    public void selectTypeTitle(String typeTitle) {
        actionsWithOurElements.selectTextInDD(titleDD, typeTitle);
    }

    public void selectLanguageType(String languageType) {
        actionsWithOurElements.selectTextInDD(languageDD, languageType);
    }
}



