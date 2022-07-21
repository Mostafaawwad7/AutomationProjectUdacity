package org.example.StepDefinition;
import org.example.Elements.SelectCategoriesPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

//***Note**** Select random category then hover and open sub-Category if found*

public class SC6_SelectDifferentCategories {
    SelectCategoriesPageElements category = new SelectCategoriesPageElements();

    @Given("user hover category")
    public void hoverCategory() throws InterruptedException
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(category.computersCategory()).perform();
        Thread.sleep(1000);


    }

    @And("user click on subCategory")
    public void chooseSubCategory()
    {
        category.desktopsSubCategory().click();
    }

    @Then("user should be navigated to the subCategory URL")
    public void confirmCategory()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");

    }
}
