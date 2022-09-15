package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.HomepageConstants.*;

public class HomePage {

    ChromeDriver driver;

    public HomePage(ChromeDriver driver) { this.driver = driver; }

    public void openPage() {
        driver.get(URL_HOMEPAGE);
        WebElement buttonClosePromo = driver.findElementByClassName(BUTTON_CLOSE_PROMO_POPUP);
        if(buttonClosePromo.isDisplayed()) {
            buttonClosePromo.click();
        }
    }

    public void search(String keyword) {
        WebElement search = driver.findElementByClassName(FIELD_SEARCH);
        search.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOptionSortBy(String sortBy) {
        WebElement optionSortBy = driver.findElementByXPath(String.format(OPTION_SORT_BY,sortBy));
        optionSortBy.click();
    }

    public void clickFirstItemList() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement firstItemTitle = driver.findElementByXPath(LABEL_FIRST_ITEM);
        wait.until(ExpectedConditions.visibilityOf(firstItemTitle));
        WebElement firstItemList = driver.findElementsByXPath(LIST_ITEM).get(0);
        firstItemList.click();
    }

}
