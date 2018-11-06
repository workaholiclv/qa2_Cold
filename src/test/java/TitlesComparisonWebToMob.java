import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// Homework Nr.2.

public class TitlesComparisonWebToMob {

    private final By HOME_PAGE_W = By.xpath("http://delfi.lv/");
    private final By HOME_PAGE_M = By.xpath("http://m.delfi.lv/");
    private final By WEB_ARTICLES = By.xpath(".//a[@class='top2012-title']");
    private final By MOB_ARTICLES = By.xpath(".//a[@class='md-scrollpos']");

    @Test
    public void delfiFiveTitlesCheck() {
        System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get(HOME_PAGE_W);

        List<WebElement> webVerArticleList = driver.findElements(WEB_ARTICLES);
        List<String> webVerArticles = new ArrayList<String>();
        int i;
        for (i = 0; i < 5; i++) {
            webVerArticles.add(webVerArticleList.get(i).getText());
        }

        driver.get(HOME_PAGE_M);
        List<WebElement> mobVerArticleList = driver.findElements(MOB_ARTICLES);
        List<String> mobVerArticles = new ArrayList<String>();
        for (i = 0; i < 5; i++) {
            mobVerArticles.add(mobVerArticleList.get(i).getText());
        }

        Assertions.assertArrayEquals(new List[]{
                webVerArticles
        }, new List[]{
                mobVerArticles
        }, "Article titles are not equals in delfi.lv and m.delfi.lv !");
        driver.close();
    }
}
