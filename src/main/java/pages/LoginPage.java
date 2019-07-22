package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver,"https://","/");
    }

    @FindBy(id = "login-link")
    private WebElement buttonVhod;

    @FindBy(xpath ="//*[@id=\"_loginByMail\"]")
    private WebElement buttonLoginByMail;

    @FindBy(name = "username")
    private TextInput inputLogin;

    @FindBy(className = "txtPassword")
    private TextInput inputPassword;

    @FindBy(xpath = "//*[@id=\"_loginDialog\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/button")
    private WebElement buttonSubmit;




    public void openPage(){
        try {
            webDriver.get("https://dou.ua/");
            logger.info("LoginPage was open");
        }catch (Exception e){
            logger.error("Can not open LoginPage");
            Assert.fail("Can not open LoginPage");

        }
    }
    public void clickOnButtonVhod() {
        try {
           //WebElement buttonVhod = webDriver.findElement(By.id("login-link"));
            buttonVhod.click();
            logger.info("Button Vhod was cliced");
        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void clickOnButtonLoginByMail() {
        try {
           // WebElement buttonLoginByMail = webDriver.findElement(By.xpath("//*[@id=\"_loginByMail\"]"));
            buttonLoginByMail.click();
            logger.info("Button LoginByMail was cliced");
        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }






    public void enterTextInToInputLogin(String login) {
      /*  try {
          //  WebElement inputLogin = webDriver.findElement(By.name("username"));
            inputLogin.clear();
            inputLogin.sendKeys(login);
            logger.info(login + "was inputted into input Login");

        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }*/
      actionsWithOurElements.enterTextIntoInput(inputLogin, login);
    }

    public void enterTextInToInputPass(String password) {
      /*  try {
            //WebElement inputPassword = webDriver.findElement(By.className("txtPassword"));
            inputPassword.clear();
            inputPassword.sendKeys("mx5vug");
            logger.info(password + "was inputted into input Password");
        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }*/
      actionsWithOurElements.enterTextIntoInput(inputPassword, password);
    }


    public void clickOnButtonSubmit() {
        try {
            // WebElement buttonSubmit = webDriver.findElement(By.xpath("//*[@id=\"_loginDialog\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/button"));
             buttonSubmit.click();
             logger.info("Button Submit was clicked");

        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }


    public void loginWithCred(String login, String password) {
        openPage();
        clickOnButtonVhod();
        clickOnButtonLoginByMail();
        enterTextInToInputLogin(login);
        enterTextInToInputPass(password);
        clickOnButtonSubmit();
    }

    public void validLogin() {
        loginWithCred("Unicod.mk@gmail.com", "mx5vug");
    }
}
