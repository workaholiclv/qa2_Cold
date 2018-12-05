//import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//
//public class PracticeFive {
//    //create article locator
//    //create comment locator
//    private final By ETHALON_TITLE = By.xpath(".//a[@class = 'top2012-title']");
//    private final By ETHALON_COMMENT_COUNT = By.xpath(".//a[@class = 'comment-count']");
//    private final By ETHALON_TITLE_COMMENT = By.xpath(".//h3[@class = 'top2012-title']");
//
//    //create article page title locator
//    //create article page comments locator
//    private final By THIRD_ARTICLE_TITLE = By.xpath(".//h1[@class = 'article-title']");
//    private final By THIRD_ARTICLE_TITLE_COMMENTS = By.xpath(".//div[@class= 'article-title']/a[1]");
//
//    //create comment pages title locator
//    //create registered users comment count locator
//    //create anonymous users comment count locator
//    private final By COMMENTS_ARTICLE_TITLE = By.xpath(".//h1[@class = 'comments-about-title-h1']");
//    private final By REG_COMMENTS_ARTICLE_TITLE = By.xpath(".//a[contains(@class, 'comment-thread-switcher-list-a-reg')]/span");
//    private final By ANON_COMMENTS_ARTICLE_TITLE = By.xpath(".//a[contains(@class, 'comment-thread-switcher-list-a-anon')]/span");
//
//    //private final By REG_COMMENTS_ARTICLE_TITLE = By.xpath("//div[@id='comments-listing']/div/a[1]/span");
//    //private final By ANON_COMMENTS_ARTICLE_TITLE = By.xpath("//div[@id='comments-listing']/div/a[2]/span");
//
//
//@org.junit.jupiter.api.Test
//    public void practice() {
//        //open browser
//        //open delfi
//        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://delfi.lv");
//        //find main page article elements
//        List < WebElement > articles = driver.findElements(ETHALON_TITLE_COMMENT);
//        //find main page 3rd element
//        WebElement thirdElement = articles.get(2);
//        // get 3rd element article title
//        String thirdArticle = thirdElement.findElement(ETHALON_TITLE).getText();
//        //find 3rd element comment count
//        String thirdElCommentCount = thirdElement.findElement(ETHALON_COMMENT_COUNT).getText();
//        //cut comment brackets
//        thirdElCommentCount = thirdElCommentCount.substring(1, thirdElCommentCount.length() - 1);
//        //convert comment count string to int
//        int articleCommentCount = Integer.valueOf(thirdElCommentCount);
//        //go to the 3rd article page
//        thirdElement.findElement(ETHALON_TITLE).click();
//        //create article page title locator
//        //create article page comments locator
//        //get article title
//        String articleTitleOnPage = driver.findElement(THIRD_ARTICLE_TITLE).getText();
//        //find comment count
//        String articleTitleOnPageComment = driver.findElement(THIRD_ARTICLE_TITLE_COMMENTS).getText();
//        //cut comment brackets
//        String articleTitleOnPageComCount = articleTitleOnPageComment.substring(1, articleTitleOnPageComment.length() - 1);
//        //convert comment count string to int
//        int articleTitleOnPageComCountInt = Integer.valueOf(articleTitleOnPageComCount);
//        //check article titles with 1st page
//        Assertions.assertTrue("Main page article title is not equal to separate page article title!", articleTitleOnPage.contains(thirdArticle));
//        //Assertions.assertEquals(articleTitleOnPage, thirdArticle, "Main page article title is not equal to separate page article title!");
//        //check comment counts
//        Assertions.assertEquals(articleTitleOnPageComCountInt, articleCommentCount, "Main page article title comments count is not equal to separate page article title comments count!");
//        //go to the comment page
//        driver.findElement(THIRD_ARTICLE_TITLE_COMMENTS).click();
//        //create comment pages title locator
//        //create registered users comment count locator
//        //create anonymous users comment count locator
//        //get comment pages title text
//        String commentPageArticle = driver.findElement(COMMENTS_ARTICLE_TITLE).getText();
//        //check comment page title with main page title (e-talon :))
//        Assertions.assertTrue("Main page article title is not equal to comment page article title!", commentPageArticle.contains(thirdArticle));
//        //Assertions.assertEquals(commentPageTitle, thirdArticle, "Main page article title is not equal to comment page article title!");
//        //find comment page registered users comment count
//        String commentPageRegUsersComments = driver.findElement(REG_COMMENTS_ARTICLE_TITLE).getText();
//        //cut comment brackets
//        String countOfRegUsersCommentonPage = commentPageRegUsersComments.substring(1, commentPageRegUsersComments.length() - 1);
//        //convert comment count string to int
//        int countOfRegUsersCommentonPageInt = Integer.valueOf(countOfRegUsersCommentonPage);
//        //find comment page anonymous users comment count
//        String commentPageAnonUsersComments = driver.findElement(ANON_COMMENTS_ARTICLE_TITLE).getText();
//        //cut comment brackets
//        String countOfAnonUsersCommentonPage = commentPageAnonUsersComments.substring(1, commentPageAnonUsersComments.length() - 1);
//        //convert comment count string to int
//        int countOfAnonUsersCommentonPageInt = Integer.valueOf(countOfAnonUsersCommentonPage);
//        //sum anonymous and registered comments
//        int sumOfAnonAndRegUsersComments = countOfRegUsersCommentonPageInt + countOfAnonUsersCommentonPageInt;
//        //check sum of anonymous and registered comments count with main pages comments count
//        Assertions.assertEquals(sumOfAnonAndRegUsersComments, articleCommentCount, "Main page article comment count is not equal to registered and anonymous comment count from comment page!");
//    }
//}
