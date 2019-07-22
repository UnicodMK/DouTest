package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{

    @FindBy(xpath ="/html/body/div[1]/header/ul/li[5]/a" )
    private WebElement menuSalaries;




    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent(){
        try {

            return webDriver.findElement(By.xpath("/html/body/div/header/div/a[2]/img")).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void clickOnSalaries() {

        actionsWithOurElements.clickOnElement(menuSalaries);
    }


}
