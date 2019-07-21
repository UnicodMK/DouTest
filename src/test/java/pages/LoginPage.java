package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage(){
        try {
            webDriver.get("https://dou.ua/");
            System.out.println("LoginPage was open");
        }catch (Exception e){
            System.out.println("Can not open LoginPage");
            Assert.fail("Can not open LoginPage");

        }
    }
}
