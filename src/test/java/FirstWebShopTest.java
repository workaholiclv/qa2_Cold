
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

//Homework Nr.3.

//Creating main class
public class FirstWebShopTest {

    // Variables with web shop address and menu xPathes
    private final String HomePage = "http://automationpractice.com/index.php";
    private final By MainMenuItems = By.xpath(".//ui(@class = 'sf-menu clearfix menu-content sf-js-enable sf-arrows')/li/a");
    private final By FilterCheckBox = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul']/li/label");
    private final By ColorFilter = By.xpath(".//ui[@class = 'col-lg-12 layered_filter_ul color-group']/li/label");
    private final By Loader = By.xpath(".//ul[@class = 'product_list qrid row']/p");
    private final By ListView = By.xpath("");

    // Adding Junit component test
    @Test
    public void testTheDresses() {

// Location of the driver for browser on your local machine
        System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
// Driver variable
        WebDriver driver = new ChromeDriver();
// Adding full screen option to open browser in full screen mode
        driver.manage().window().fullscreen();
// Open website in browser
        driver.get(HomePage);

// Selecting MenuItem --> "Women"
        selectMenuItem("WOMEN");

// Filtering check box and selecting --> "Dresses"
        selectFilter("Dresses", FilterCheckBox);
        waitLoad();

    }

    // This method will help us to select menu item from MainMenuItems
    private void selectMenuItem(String menuItem) {
        List<WebElement> menuItems = driver.findElements(MainMenuItems);

        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getText().equals(menuItem)) {
                menuItems.get(i).click();
                break;
            }
        }
    }

    // This method will help us to select check box item from FilterCheckBox
    private void selectFilter(String filterName) {
        List<WebElement> filterItems = driver.findElements(FilterCheckBox);

        for (int i = 0; i < filterItems.size(); i++) {
            if (filterItems.get(i).getText().contains(filterName)) {
                filterItems.get(i).click();
                break;
            }
        }
    }

    /* Waiting - adding browser window in which we are waiting for result, timeout - how long we'll wait, then adding condition which we expect. Selenium will be constantly checking whether condition is met, if yes, then we don't have to wait and moving forward, saving our time  */
    private void waitLoad() {
        new WebDriverWait(driver, new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(Loader));
    }
}
