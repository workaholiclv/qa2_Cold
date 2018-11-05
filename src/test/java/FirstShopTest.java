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

    // Taking WebDriver to class level so it will be visible in all of the methods of this class
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
        LOGGER.info("Setting Gecko global property");
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

        LOGGER.info("openPage browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Openning home page");
        driver.get(HOME_PAGE);

// Selecting menu item "WOMEN". Code wich could be reusable in other places we can write in separate method which we can call by parameters
        selectMenuItem("WOMEN");

        // Calling method which will select check-box in filter
        selectFilter("Dresses", FILTER_CHECK_BOX);
        waitLoad();

        selectFilter("Orange", COLOR_FILTER);
        waitLoad();

        LOGGER.info("Click to view icon");
        driver.findElement(LIST_VIEW_ICON).click();
    }

    // This method could be used to choose any item from main menu, we only need to pass it as parameter

    private void selectMenuItem(String menuItem) {
        LOGGER.info("Selecting" +
                "menuItem");
        List<WebElement> menuItems = driver.findElements(MAIN_MENU_ITEMS);

        // This cicle is receiving 3 parameters: from which element entering to which and with what step (i++)
        // If we don't know element count in list, then we need to use function ".size" which will return element count
        for (int i = 0; i < menuItems.size(); i++) {
            //.equals - в случае работы со строками - проверяет на полное совпадение строк
            if (menuItems.get(i).getText().equals(menuItem)) {
                menuItems.get(i).click();
                break;
            }
        }
    }

    private void selectFilter(String filterName, By locator) {

        LOGGER.info("Selecting from filter" +"filterName");
        List<WebElement> filterItems = driver.findElements(locator);

        // Сicle for analogue - this entry should be used if bypass all list elements
        // 1. Specify which objects we work with - WebElement (the list consists of elements which we bypass)
        // 2. Specify the name - through this name we work with each element of the list
        // 3. After the colon, we indicate which list we are bypasing
        for (WebElement filterItem : filterItems) {
            //Function ".contains" - in case of working with string is checking for partial conjunction of string
            if (filterItem.getText().contains(filterName)) {
                filterItem.click();
                break;
            }
        }
    }

    // Waiting - adding browser window in which we are waiting for result, timeout - how long we'll wait, then adding condition which we expect.
    // Selenium will be constantly checking whether condition is met, if yes, then we don't have to wait and can move forward, saving our time.

    private void waitLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
    }
}
