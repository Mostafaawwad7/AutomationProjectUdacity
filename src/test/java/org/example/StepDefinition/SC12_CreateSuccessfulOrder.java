package org.example.StepDefinition;

import org.example.Elements.CreateOrderPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SC12_CreateSuccessfulOrder {
    CreateOrderPageElements order = new CreateOrderPageElements();
    @Given("agree terms and conditions")
    public void agreeTerms()
    {
        order.agreeTermsButton().click();
    }
    @When("use click checkout")
    public void checkOutButtonClick()
    {
    order.checkOutButton().click();
    }
    @And("user Checkout as guest")
    public void checkOutAsGuestButton()
    {
        order.checkOutAsGuestButton().click();
    }
    @And("user Enter billing address")
    public void enterBillingAddress()
    {
        order.firstName().sendKeys("Mostafa");
        order.lastName().sendKeys("Awwad");
        order.email().sendKeys("mostafaawad311@gmail.com");
        order.company().sendKeys("Udacity");
        WebElement country = order.country();
        Select selectCountry = new Select(country);
        selectCountry.selectByValue("123");
        order.city().sendKeys("Giza");
        order.address_1().sendKeys("Hadayek Al Ahram");
        order.address_2().sendKeys("Khofo Gate");
        order.zipCode().sendKeys("12555");
        order.phoneNumber().sendKeys("01097633201");
        order.confirmBillingAddressButton().click();



    }
    @And("user Enter shipping method")
    public void enterShippingMethod()
    {
        order.confirmShippingMethodButton().click();
    }
    @And("user Enter payment method")
    public void enterPaymentMethod()
    {
        order.confirmPaymentMethodButton().click();
    }
    @And("user Enter paymentInfo")
    public void enterPaymentInfo()
    {
        order.confirmPaymentInfoButton().click();
    }
    @And("User confirm order")
    public void confirmOrder()
    {
        order.confirmOrderButton().click();
    }
    @Then("Confirm that order is done successfully")
    public void orderConfirmation()
    {
       String thanksMsg =  order.successfulOrderMsg().getText();
        Assert.assertTrue(thanksMsg.contains("Your order has been successfully processed!"));
        order.continueShoppingButton().click();

    }





}
