import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// Homework Nr.2.

// Creating main class
public class DelfiFiveTitlesComparisonDesktpVSMobile {

 // Xpath definition for delfi.lv desktop version and mobile version
 private final By WEB_ARTICLES = By.xpath(".//a[@class='top2012-title']");
 private final By MOB_ARTICLES = By.xpath(".//a[@class='md-scrollpos']");

 // Test component from Junit
 @Test
 public void delfiFiveTitlesCheck() {
  // Location of the driver for browser on your local machine
  System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
  // Driver variable
  WebDriver driver = new ChromeDriver();
  // Adding full screen option to open browser in full screen mode
  driver.manage().window().fullscreen();

  // Open in browser this website
  driver.get("http://delfi.lv/");

  // Creating list with 5 articles from xPath of delfi.lv desktop version (variable: WEB_ARTICLES)
  List < WebElement > webVerArticleList = driver.findElements(WEB_ARTICLES);
  List < String > webVerArticles = new ArrayList < String > ();
  int i;
  for (i = 0; i < 5; i++) {
   webVerArticles.add(webVerArticleList.get(i).getText());
  }

  // Open in browser this website
  driver.get("http://m.delfi.lv/");

  // Creating list with 5 articles from xPath of m.delfi.lv mobile version (variable: MOB_ARTICLES)
  List < WebElement > mobVerArticleList = driver.findElements(MOB_ARTICLES);
  List < String > mobVerArticles = new ArrayList < String > ();
  for (i = 0; i < 5; i++) {
   mobVerArticles.add(mobVerArticleList.get(i).getText());
  }

  // Compare delfi.lv (web version) article titles with m.delfi.lv (mobile version) articles titles
  Assertions.assertArrayEquals(new List[] {
   webVerArticles
  }, new List[] {
   mobVerArticles
  }, "Article titles are not equals in delfi.lv and m.delfi.lv !");
  driver.close();
 }
}
