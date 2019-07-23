package calendarTest;


import org.junit.Test;
import parentTest.ParentTest;

public class CalendarTestEvent extends ParentTest{

    @Test
    public void CalendarEvent(){
        loginPage.validLogin();
        homePage.checkCurrentUrl();
        homePage.checkIsAvatarDisplayed();

        homePage.clickOnCalendarPage();

        calendarPage.checkCurrentUrl();
        calendarPage.selectCityNameFromDropDown("Рига");
        calendarPage.selectThemeEventFromDropDown("конференция");

    }


}
