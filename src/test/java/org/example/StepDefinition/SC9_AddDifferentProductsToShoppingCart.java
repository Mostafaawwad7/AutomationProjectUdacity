package org.example.StepDefinition;

import org.example.Elements.CartPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SC9_AddDifferentProductsToShoppingCart {
    Actions action = new Actions(Hooks.driver);
    CartPageElements cart = new CartPageElements();
    @Given("User choose the product")
    public void choosingProduct()
    {
        cart.productName().click();
    }
    @When("User click add to cart button")
    public void clickAddToCart()
    {
        cart.addToCartButton().click();
    }
    @And("Confirming that the product is added to cart")
    public void confirmAddingToCart()
    {
      String successMsg = cart.addSuccessMsg().getText();
        Assert.assertTrue(successMsg.contains("The product has been added to your shopping cart"));
        cart.closeMsgButton().click();
    }

    @And("Go to cart")
    public void goToCart() throws InterruptedException
    {

        action.moveToElement(cart.cartLabel()).perform();
        Thread.sleep(2000);
        cart.toCartButton().click();
    }

    @Then("Check Cart")
     public void checkCart()
    {
        String productName = cart.productNameFromCart().getText();
        Assert.assertTrue(productName.contains("Apple MacBook Pro 13-inch"));
    }


}