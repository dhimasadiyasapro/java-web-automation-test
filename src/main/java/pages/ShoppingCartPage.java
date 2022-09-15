package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.ShoppingCartConstants.*;

public class ShoppingCartPage {

    ChromeDriver driver;

    public ShoppingCartPage(ChromeDriver driver) { this.driver = driver; }

    public void clickButtonUbahKurir() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement buttonUbahKurir = driver.findElementByXPath(BUTTON_UBAH_KURIR);
        wait.until(ExpectedConditions.visibilityOf(buttonUbahKurir));
        buttonUbahKurir.click();
    }

    public void clickButtonBatalPopup() {
        driver.switchTo().frame("ifrLayer");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable
                (driver.findElementByXPath(BUTTON_BATAL_POPUP)));
        WebElement buttonBatalPopup = driver.findElementByXPath(BUTTON_BATAL_POPUP);
        buttonBatalPopup.click();
        driver.switchTo().parentFrame();
    }

    public void clickButtonHapusOnItem() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable
                (driver.findElementByXPath(BUTTON_HAPUS_ON_ITEM)));
        WebElement buttonHapusOnItem = driver.
                findElementByXPath(BUTTON_HAPUS_ON_ITEM);
        buttonHapusOnItem.click();
    }

    public void clickButtonOkHapusItem() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable
                (driver.findElementByXPath(BUTTON_OK_HAPUS_ON_ITEM)));
        WebElement buttonOkHapusItem = driver.
                findElementByXPath(BUTTON_OK_HAPUS_ON_ITEM);
        buttonOkHapusItem.click();
    }

    public Boolean emptyShoppingCart() {
        return driver.findElementByXPath(LABEL_EMPTY_CART).isDisplayed();
    }
}
