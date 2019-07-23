package jobsTest;

import org.junit.Test;
import parentTest.ParentTest;

public class JobTest extends ParentTest {
    @Test

    public void trendtJods(){
        loginPage.validLogin();
        homePage.checkCurrentUrl();
        homePage.checkIsAvatarDisplayed();

        homePage.clickOnJobs();

        jobsPage.clickOnRatings();
        jobsPage.selectCityNameFromDropDown("Одессы");

    }

}
