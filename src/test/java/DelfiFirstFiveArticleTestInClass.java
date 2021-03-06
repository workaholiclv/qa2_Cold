import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// Class work Nr.3.

//Creating main class
public class DelfiFirstFiveArticleTestInClass {

    // Xpath definition for delfi.lv web version
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");

    //Adding Junit test component
    @Test
    public void testFiveArticles() {

        //Set up given titles to check, adding all of the titles to array list
        List<String> givenArticles = new ArrayList<String>();
        givenArticles.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add("KP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");

        // Location of the driver for browser on your local machine
        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        // Driver variable
        WebDriver driver = new ChromeDriver();
        // Adding full screen option to open browser in full screen mode
        driver.manage().window().fullscreen();
        // Open website in browser
        driver.get("http://delfi.lv");

        //Find 5 elements
        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);

        //Comparing 5. article titles from variable "givenArticles" with variable "articles" - data received from xPath
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(givenArticles.get(i), articles.get(i).getText(), "Title Nr. " + (i+1) + " is not correct!");
        }
    }
}
