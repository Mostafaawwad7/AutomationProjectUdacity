package org.example.StepDefinition;

import org.example.Elements.WishListPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class SC10_AddDifferentProductsToWishlist {


    WishListPageElements wishlist = new WishListPageElements();
    @Given("User choose any of the products")
    public void choosingProductToAdd()
    {
        wishlist.randomProduct().click();
    }
    @When("User click add to wishlist button")
    public void clickAddToWishList()
    {
        wishlist.AddToWishListButton().click();
    }
    @And("Confirming that the product is added to Wishlist")
    public void confirmAddingToWishList()
    {
        String success_Msg = wishlist.addedToWishListSuccesMsg().getText();
        Assert.assertTrue(success_Msg.contains("The product has been added to your wishlist"));

    }

    @And("Go to Wishlist")
    public void goToWishlist()
    {

       wishlist.wishListLink().click();

    }

    @Then("Check Wishlist")
    public void checkWishList()
    {
        String productName = wishlist.productNameInWishList().getText();
        Assert.assertTrue(productName.contains("HTC One M8 Android L 5.0 Lollipop"));
    }

}
