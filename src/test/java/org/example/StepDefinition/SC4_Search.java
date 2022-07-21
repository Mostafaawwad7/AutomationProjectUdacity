package org.example.StepDefinition;

import org.example.Elements.SearchPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SC4_Search {
    SearchPageElements search = new SearchPageElements();
    @Given("user click on search field and search for product")
    public void searchProduct()
    {
        search.searchField().sendKeys("Lenovo");
    }
    @And("user click on search button")
    public void clickSearch()
    {
        search.searchButton().click();
    }
    @Then("user should be navigated to the right URL")
    public void confirmSearch()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=Lenovo");
    }
}
