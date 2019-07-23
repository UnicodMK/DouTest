package lentaTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LentaPageTest50 extends ParentTest {

    @Test
    public void TopCompany(){

        loginPage.validLogin();
        homePage.checkCurrentUrl();
        homePage.checkIsAvatarDisplayed();

        homePage.clickOnLenta();

        lentaPage.checkCurrentUrl();
        lentaPage.clickOnTop50Company();

        lentaArticlesPage.choiseFirstCompsny();



    }
}
