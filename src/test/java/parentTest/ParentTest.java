package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;


    protected LoginPage loginPage;
    protected HomePage homePage;
    protected SalariesPage salariesPage;
    protected LentaPage lentaPage;
    protected LentaArticlesPage lentaArticlesPage;
    protected CalendarPage calendarPage;
    protected JobsPage jobsPage;



    @Before
    public void setUp(){
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        salariesPage = new SalariesPage(webDriver);
        lentaPage = new LentaPage(webDriver);
        lentaArticlesPage = new LentaArticlesPage(webDriver);
        calendarPage = new CalendarPage(webDriver);
        jobsPage = new JobsPage(webDriver);





    }


     @After
    public void tearDown(){
        webDriver.quit();
    }

    public void checkExpectedResult(String massage, boolean expctedResult, boolean actualResult){
        Assert.assertEquals(massage, expctedResult, actualResult);
    }
}
