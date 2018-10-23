import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class trainingNr2 {

    private final By ARTICLE_DTITLE =  By.xpath(".//a[@class = 'top2012-title']");
    private final By ARTICLE_MTITLE =  By.xpath(".//a[@class = 'md-mosaic-img md-scrollpos']");

    @Test
    public void DelfiTest() {
        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://delfi.lv");

        WebElement article = driver.findElement(ARTICLE_DTITLE);
        List<String> pageOneValues = new ArrayList<String>();
        pageOneValues.add(article.getText());

        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        driver.get("http://m.delfi.lv");

        WebElement mArticle = driver.findElement(ARTICLE_MTITLE);
        Assertions.assertEquals(pageOneValues.get(0), mArticle.getText());


    }
}
