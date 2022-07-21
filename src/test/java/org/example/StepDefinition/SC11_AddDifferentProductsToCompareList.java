package org.example.StepDefinition;

import org.example.Elements.CompareListPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SC11_AddDifferentProductsToCompareList {
    CompareListPageElements compare = new CompareListPageElements();

    @Given("User choose any of the products to add to compare list")
    public void choosingProduct()
    {
    compare.productLink().click();
    }
    @When("User click add to compare button")
    public void clickAddToCompareList()
    {
    compare.AddToCompareListButton().click();
    }
    @And("Confirming that the product is added to Compare list")
    public void confirmAddingToCompareList()
    {
        String success_Msg = compare.AddingToCompareListSuccessMsg().getText();
        Assert.assertTrue(success_Msg.contains("The product has been added to your product comparison"));

    }

    @And("Go to compare list")
    public void goToComparelist()
    {

       compare.compareListLink().click();

    }

    @Then("Check Comparelist")
    public void checkCompareList()
    {
        String productName = compare.productNameInCompareList().getText();
        Assert.assertTrue(productName.contains("$25 Virtual Gift Card"));
    }

}
