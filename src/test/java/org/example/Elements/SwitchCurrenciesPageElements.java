package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwitchCurrenciesPageElements {

    public WebElement currenciesButton()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public static List<WebElement> productPrices ()
    {
        List <WebElement> productPrices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productPrices;
    }


}
