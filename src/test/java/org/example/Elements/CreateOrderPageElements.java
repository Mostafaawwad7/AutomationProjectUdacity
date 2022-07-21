package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateOrderPageElements {

    public WebElement agreeTermsButton()
    {
        return  Hooks.driver.findElement(By.id("termsofservice"));
    }

    public WebElement checkOutButton()
    {
        return Hooks.driver.findElement(By.id("checkout"));
    }

    public WebElement checkOutAsGuestButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 checkout-as-guest-button\"]")) ;
    }

    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_FirstName"));
    }

    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_LastName"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Email"));
    }

    public WebElement company()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Company"));
    }

    public WebElement country()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
    }

    public WebElement city()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }

    public WebElement address_1()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    public WebElement address_2()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address2"));
    }

    public WebElement zipCode()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    public WebElement phoneNumber()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public WebElement confirmBillingAddressButton()
    {
        return  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 new-address-next-step-button\"]")) ;
    }

    public WebElement confirmShippingMethodButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
    }

    public WebElement confirmPaymentMethodButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
    }

    public WebElement confirmPaymentInfoButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
    }

    public WebElement confirmOrderButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));
    }

    public WebElement successfulOrderMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"section order-completed\"] div[class=\"title\"]"));
    }

    public WebElement continueShoppingButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 order-completed-continue-button\"]"));
    }
}

