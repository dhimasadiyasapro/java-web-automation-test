package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ShoppingCartPage;
import webdriverpool.Initializer;

public class ShoppingCartSteps {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(Initializer.driver);

    @Given("User click button Ubah Kurir")
    public void userClickButtonUbahKurir() {
        shoppingCartPage.clickButtonUbahKurir();
    }

    @Given("User click button Batal on Ubah Kurir popup")
    public void userClickButtonBatalOnUbahKurirPopup() {
        shoppingCartPage.clickButtonBatalPopup();
    }

    @When("User click button Hapus on item shopping cart")
    public void userClickButtonHapusOnItemShoppingCart() {
        shoppingCartPage.clickButtonHapusOnItem();
    }

    @When("User click button OK on hapus produk popup")
    public void userClickButtonOKOnHapusProdukPopup() {
        shoppingCartPage.clickButtonOkHapusItem();
    }

    @Then("User do not see deleted produk on shopping cart")
    public void userDoNotSeeDeletedProdukOnShoppingCart() {
        Assert.assertTrue(shoppingCartPage.emptyShoppingCart());
    }
}
