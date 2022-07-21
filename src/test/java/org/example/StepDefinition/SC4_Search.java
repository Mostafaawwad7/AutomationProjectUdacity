package org.example.StepDefinition;

import org.example.Elements.SearchPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SC4_Search {
    SearchPageElements search = new SearchPageElements();
    @Given("user click on search field and search for product")
    public void searchProduct()
    {
        search.searchField().sendKeys("LE_IC_600");
    }

    @And("user click on search button")
    public void clickSearch()
    {
        search.searchButton().click();
    }

    //Updated after review "You should make sure that the size of Search results size is greater than 1
    //Also, It is required to make "Search with SKU"
    @Then("user should be navigated to the right URL")
    public void confirmSearch()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=LE_IC_600");
        //1.Get all search results
        List <WebElement> searchResults = Hooks.driver.findElements(By.cssSelector("div [class=\"item-grid\"]"));
        //2.Confirm that there is a search results
        Assert.assertTrue(searchResults.size()>0);
    }
}
