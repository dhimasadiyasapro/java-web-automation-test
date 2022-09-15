package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.ItemDetailConstants.*;

public class ItemDetailPage {

    ChromeDriver driver;

    public ItemDetailPage(ChromeDriver driver) { this.driver = driver; }

    public void updateItemQuantity(String quantity) {
        WebElement customQuantity = driver.findElementById(FIELD_ITEM_QUANTITY);
        customQuantity.clear();
        customQuantity.sendKeys(quantity);
    }

    public void clickButtonTambahKeCart() {
        WebElement buttonTambahKeCart = driver.findElementByXPath(BUTTON_TAMBAH_KE_CART);
        buttonTambahKeCart.click();
    }

    public void clickButtonOnPopup(String buttonName) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement buttonPopup = driver.findElementByXPath(String.format(BUTTON_POPUP, buttonName));
        wait.until(ExpectedConditions.visibilityOf(buttonPopup));
        buttonPopup.click();
    }
}
