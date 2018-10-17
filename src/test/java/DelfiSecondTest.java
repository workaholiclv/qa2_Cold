import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class DelfiSecondTest {

    private final By ARTICLE_TITLE =  By.xpath(".//a[@class = 'top2012-title']");

    /**
     * This test will test five articles title presents on page
     */
    @Test
    public void testFiveArticles() {

        // Set up given titles to check

        List<String> givenArticles = new ArrayList<String>();
        givenArticles.add ("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add ("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add ("JKP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add ("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add ("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");

        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://delfi.lv");

        // Find five elements and keep in the list
        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);

        //Check
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(givenArticles.get(i), articles.get(i).getText(),"Title Nr." + (i+1) + "is no correct!");
        }

    }
}
