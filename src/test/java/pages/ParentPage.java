package pages;

import org.openqa.selenium.WebDriver;

abstract public class ParentPage {
    WebDriver webDriver;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

}
