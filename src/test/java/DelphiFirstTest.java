import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelphiFirstTest {

    private final By ARTICLE_TITLE =  By.xpath(".//a[@class = 'top2012-title']");

    /**
     * This test will test first article title presents on page
     */
    @Test
    public void delphiFirstTitleTet() {
        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://delfi.lv");

        String articleToCheck ="'OlyBet' basketbola līga: LU - 'Kalev/Cramo'. Video tiešraide";
        WebElement article = driver.findElement(ARTICLE_TITLE);
        String articleText = article.getText();

        Assertions.assertEquals(articleToCheck, articleText,"Fatal error");
    }
}
