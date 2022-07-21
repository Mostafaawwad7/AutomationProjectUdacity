package org.example.StepDefinition;

import org.example.Elements.FilterWithColorPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//***Note**** in this case you should select specific category like Apparel > Shoes*
public class SC7_FilterWithColor {
    FilterWithColorPageElements filter = new FilterWithColorPageElements();



    @Given("user hover Apparel category")
    public void hoverCategory() throws InterruptedException
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(filter.apparelCategory()).perform();
        Thread.sleep(1000);



    }

    @And("user click on shoes subCategory")
    public void chooseSubCategory()
    {
        filter.shoesSubCategory().click();
    }

    @Then("user should be navigated to the shoes subCategory URL")
    public void confirmCategoryURL()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes");

    }

    @And("user could filter by colour")
    public void chooseColour()
    {
        filter.redColour().click();
    }

}
