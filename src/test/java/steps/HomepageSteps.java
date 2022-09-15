package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;
import webdriverpool.Initializer;

public class HomepageSteps {

    HomePage homePage = new HomePage(Initializer.driver);

    @Given("User go to elevenia homepage")
    public void userGoToEleveniaHomepage() {
        homePage.openPage();
    }

    @Given("User search {string}")
    public void userSearch(String keyword) {
        homePage.search(keyword);
    }

    @Given("User choose {string} on Sort by")
    public void userChooseOnSortBy(String sortBy) {
        homePage.clickOptionSortBy(sortBy);
    }

    @Given("User choose the first product on product list")
    public void userChooseTheFirstProductOnProductList() {
        homePage.clickFirstItemList();
    }

}
