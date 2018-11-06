import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Class work Nr.2.

//Creating main class
public class DelfiOneTitleCheck {
    // Xpath definition for delfi.lv web version
    private final By ARTICLE_TITLE =  By.xpath(".//a[@class = 'top2012-title']");
    private final Logger LOGGER = LogManager.getLogger(DelfiOneTitleCheck.class);
    //This test will test first article title presents on page

    @Test
    public void delphiFirstTitleTest() {
        LOGGER.info("We are starting our test!");
        // Location of the driver for browser on your local machine
        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        // Driver variable
        WebDriver driver = new ChromeDriver();
        // Adding full screen option to open browser in full screen mode
        driver.manage().window().fullscreen();
        // Open website in browser
        LOGGER.info("We are opening delfi.lv website.");
        driver.get("http://delfi.lv");

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ARTICLE_TITLE));

        //Variable of article to check
        String articleToCheck ="'OlyBet' basketbola līga: LU - 'Kalev/Cramo'. Video tiešraide";
        //Getting titles from xPath - ARTICLE_TITLE
        LOGGER.info("We are finding ARTICLE_TITLE");
        WebElement article = driver.findElement(ARTICLE_TITLE);
        //Variable with article title from xPath - ARTICLE_TITLE
        LOGGER.info("We are getting article title text");
        String articleText = article.getText();

        //Comparing given article title from variable "articleToCheck" with variable data "articleText" which we get from xPath "ARTICLE_TITLE"
        LOGGER.info("We are comparing given article title from variable \"articleToCheck\" with variable data \"articleText\" ");
        Assertions.assertEquals(articleToCheck, articleText,"Fatal error");
    }
}