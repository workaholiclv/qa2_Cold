import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// Training Nr.1.

public class ArticleTitleCheck {

    private final String HOME_PAGE = "http://delfi.lv";
    private final By ARTICLES = By.xpath(".//a[@class = 'top2012-title']");
    private String TITLE_ONE = ("Lidlauka 'Spilve' juridisko 'kalambūru' Rīgas dome atrisinās ar buldozeru");
    private String TITLE_TWO = ("Futbola 'toto' skandāla četri gadi: ilgstoša izmeklēšana un tiesas pats sākums");
    private String TITLE_THREE = ("Tramps: ASV izstāšanos no kodollīguma motivējusi arī Ķīnas arsenāla stiprināšana");
    private String TITLE_FOUR = ("Cīņu par VID ģenerāldirektora amatu turpina trīs pretendenti");
    private String TITLE_FIVE = ("Foto: Lidojums ar 'Boeing' angārā jeb ieskats 'airBalticTraining'");

    @Test
    public void delfiTitleCheck() {

        System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        List<String> articleTitles = new ArrayList<String>();
        articleTitles.add(TITLE_ONE);
        articleTitles.add(TITLE_TWO);
        articleTitles.add(TITLE_THREE);
        articleTitles.add(TITLE_FOUR);
        articleTitles.add(TITLE_FIVE);

        List<WebElement> articles = driver.findElements(ARTICLES);

        for (int i = 0; i < 5; i++) {
            articles.get(i);

            Assertions.assertEquals(articleTitles.get(i), articles.get(i).getText(), "Articles not equals");
        }
    }
}
