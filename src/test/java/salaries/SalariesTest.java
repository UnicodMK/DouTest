package salaries;

import org.junit.Test;
import parentTest.ParentTest;

public class SalariesTest extends ParentTest {

    @Test
    public void addNewSalaries(){

        loginPage.validLogin();
        homePage.isAvatarPresent();
        homePage.clickOnSalaries();


        salariesPage.selectPeriodTypeFromDropDown("декабрь 2018");
        salariesPage.selectCityTypeFromDropDoun("Львов");
        salariesPage.selectTypeTitle("Technical Lead");
        salariesPage.selectLanguageType("Kotlin");
        salariesPage.clickOnMenuVacancies();

    }
}
