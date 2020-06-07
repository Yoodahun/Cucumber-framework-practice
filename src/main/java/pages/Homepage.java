package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    private WebDriver driver;

    By search = By.xpath("//input[@type='search']");

    public Homepage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getSearch() {
        return driver.findElement(search);
    }
}
