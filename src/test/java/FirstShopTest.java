import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FirstShopTest {

    private WebDriver driver;

    private final String HOME_PAGE = "http://automationpractice.com";
    private final By MAIN_MENU_ITEMS = By.xpath(".//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a");
    private final By FILTER_CHECK_BOX = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul']/li/label");
    private final By COLOR_FILTER = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul color-group']/li/label");
    private final By LOADER = By.xpath(".//ul[@class = 'product_list grid row']/p");
    private final By LIST_VIEW_ICON = By.className("icon-th-list");
   
    private final Logger LOGGER = LogManager.getLogger(FirstShopTest.class);


    @Test
    public void dressesTest() {
        LOGGER.info("Setting Chrome driver global property");
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

        LOGGER.info("Openning browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Openning home page");
        driver.get(HOME_PAGE);
        
        selectMenuItem("WOMEN");

        // Calling method which will select check-box in filter
        selectFilter("Dresses", FILTER_CHECK_BOX);
        waitLoad();

        selectFilter("Orange", COLOR_FILTER);
        waitLoad();

        LOGGER.info("Click to view icon");
        driver.findElement(LIST_VIEW_ICON).click();
    }

    private void selectMenuItem(String menuItem) {
        LOGGER.info("Selecting" +
                "menuItem");
        List<WebElement> menuItems = driver.findElements(MAIN_MENU_ITEMS);

        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getText().equals(menuItem)) {
                menuItems.get(i).click();
                break;
            }
        }
    }

    private void selectFilter(String filterName, By locator) {

        LOGGER.info("Selecting from filter" +"filterName");
        List<WebElement> filterItems = driver.findElements(locator);
        
        for (WebElement filterItem : filterItems) {
            if (filterItem.getText().contains(filterName)) {
                filterItem.click();
                break;
            }
        }
    }

    private void waitLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
    }
}
