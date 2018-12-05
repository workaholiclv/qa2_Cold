package barbora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openPage (String url){
        driver.get(url);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }
    public WebElement getElement (By locator){
        return driver.findElement(locator);
    }
}