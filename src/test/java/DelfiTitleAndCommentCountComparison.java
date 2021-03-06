import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DelfiTitleAndCommentCountComparison {
    //create article locator
    //create comment locator
    private final By ETHALON_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By ETHALON_COMMENT_COUNT = By.xpath(".//a[@class = 'comment-count']");
    private final By ETHALON_TITLE_COMMENT = By.xpath(".//h3[@class = 'top2012-title']");
   
    //create article page title locator
    //create article page comments locator
    private final By THIRD_ARTICLE_TITLE = By.xpath(".//h1[@class = 'article-title']");
    private final By THIRD_ARTICLE_TITLE_COMMENTS = By.xpath(".//div[@class= 'article-title']");
    
    //create comment pages title locator
    //create registered users comment count locator
    //create anonymous users comment count locator
    private final By COMMENTS_ARTICLE_TITLE = By.xpath(".//h1[@class = 'comments-about-title-h1']");
    private final By REG_COMMENTS_ARTICLE_TITLE = By.xpath(".//a[@class= 'comment-thread-switcher-list-a-reg");
    private final By ANON_COMMENTS_ARTICLE_TITLE = By.xpath(".//a[@class= 'comment-thread-switcher-list-a-anon']");

    @Test
    public void practice() {
        //open browser
        //open delfi
        System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://delfi.lv");
        //find main page article elements
        List<WebElement> articles = driver.findElements(ETHALON_TITLE_COMMENT);
        //find main page 3rd element
        WebElement thirdElement = articles.get(2);
        // get 3rd element article title
        String thirdArticle = thirdElement.findElement(ETHALON_TITLE).getText();
        //find 3rd element comment count
        String thirdElCommentCount = thirdElement.findElement(ETHALON_COMMENT_COUNT).getText();
        //cut comment brackets
        thirdElCommentCount = thirdElCommentCount.substring(1, thirdElCommentCount.length()-1);
        //convert comment count string to int
        int articleCommentCount = Integer.valueOf(thirdElCommentCount);
        //go to the 3rd article page
        thirdElement.findElement(ETHALON_TITLE).click();
        //create article page title locator
        //create article page comments locator
        //get article title
        //find comment countTHIRD_ARTICLE_TITLE
        //cut comment brackets
        //convert comment count string to int
        //check article titles with 1st page
        //check comment counts
        //go to the comment page
        //create comment pages title locator
        //create registered users comment count locator
        //create anonymous users comment count locator
        //get comment pages title text
        //check comment page title with main page title (e-talon :))
        //find comment page registered users comment count
        //cut comment brackets
        //convert comment count string to int
        //find comment page anonymous users comment count
        //cut comment brackets
        //convert comment count string to int
        //sum anonymous and registered comments
        //check sum of anonymous and registered comments count with main pages comments count


    }
}
