import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Class work Nr.2.

//Creating main class
public class DelfiOneTitleCheck {
    // Xpath definition for delfi.lv web version 
    private final By ARTICLE_TITLE =  By.xpath(".//a[@class = 'top2012-title']");

    
 //This test will test first article title presents on page

    @Test
    public void delphiFirstTitleTet() {
        // Location of the driver for browser on your local machine
        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        // Driver variable 
        WebDriver driver = new ChromeDriver();
        // Adding full screen option to open browser in full screen mode
        driver.manage().window().fullscreen();
        // Open website in browser
        driver.get("http://delfi.lv");

        //Variable of article to check
        String articleToCheck ="'OlyBet' basketbola līga: LU - 'Kalev/Cramo'. Video tiešraide";
        //Getting titles from xPath - ARTICLE_TITLE
        WebElement article = driver.findElement(ARTICLE_TITLE);
        //Variable with article title from xPath - ARTICLE_TITLE
        String articleText = article.getText();
        
        //Comparing given article title from variable "articleToCheck" with variable data "articleText" which we get from xPath "ARTICLE_TITLE"
        Assertions.assertEquals(articleToCheck, articleText,"Fatal error");
    }
}
