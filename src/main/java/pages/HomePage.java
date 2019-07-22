package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{

    @FindBy(xpath ="/html/body/div[1]/header/ul/li[5]/a" )
    private WebElement menuSalaries;

    @FindBy(xpath = "/html/body/div/header/div/a[2]/img")
    private WebElement avatar;




    public HomePage(WebDriver webDriver) {
        super(webDriver,"https://", "/");
    }

    public boolean isAvatarPresent() {
       return actionsWithOurElements.isElementDisplayed(avatar);

    }

    public void checkIsAvatarDisplayed(){
        Assert.assertTrue("Avatar is not present", isAvatarPresent());
    }

    public void clickOnSalaries() {

        actionsWithOurElements.clickOnElement(menuSalaries);
    }


}
