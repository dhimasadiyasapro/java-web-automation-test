package steps;

import io.cucumber.java.en.Given;
import pages.ItemDetailPage;
import webdriverpool.Initializer;

public class ItemDetailSteps {

    ItemDetailPage itemDetailPage = new ItemDetailPage(Initializer.driver);

    @Given("User update product quantity to {string}")
    public void userUpdateProductQuantityTo(String quantity) {
        itemDetailPage.updateItemQuantity(quantity);
    }

    @Given("User click button Tambahkan ke Cart")
    public void userClickButtonTambahkanKeCart() {
        itemDetailPage.clickButtonTambahKeCart();
    }

    @Given("User choose {string} on lihat keranjang popup")
    public void userChooseOnLihatKeranjangPopup(String buttonName) {
        itemDetailPage.clickButtonOnPopup(buttonName);
    }

}
