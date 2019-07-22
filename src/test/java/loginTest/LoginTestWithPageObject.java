package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.clickOnButtonVhod();
        loginPage.clickOnButtonLoginByMail();
        loginPage.enterTextInToInputLogin("Unicod.mk@gmail.com");
        loginPage.enterTextInToInputPass("mx5vug");
        loginPage.clickOnButtonSubmit();

        checkExpectedResult("Avatar is not present", true, homePage.isAvatarPresent());


    }


}
