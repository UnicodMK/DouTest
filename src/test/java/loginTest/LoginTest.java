package loginTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver webDriver;

    @Before
    public void setUp(){
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void validLogin(){
        webDriver.get("https://dou.ua/");

        webDriver.findElement(By.id("login-link")).click();
        webDriver.findElement(By.xpath("//*[@id=\"_loginByMail\"]")).click();


        webDriver.findElement(By.name("username")).clear();
        webDriver.findElement(By.name("username")).sendKeys("Unicod.mk@gmail.com");

        webDriver.findElement(By.className("txtPassword")).clear();
        webDriver.findElement(By.className("txtPassword")).sendKeys("mx5vug");

        webDriver.findElement(By.xpath("//*[@id=\"_loginDialog\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/button")).click();

        HomePage homePage = new HomePage(webDriver);

        Assert.assertTrue("Avatar is not present" , homePage.isAvatarPresent());

        webDriver.quit();



    }

    @After
    public void tearDown(){
        webDriver.quit();
    }


}
