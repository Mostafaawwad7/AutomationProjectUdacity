package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompareListPageElements {
    public WebElement productLink()
    {
        return     Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a[href=\"/25-virtual-gift-card\"]"));
    }

    public WebElement AddToCompareListButton()
    {
        return       Hooks.driver.findElement(By.cssSelector("div[class=\"compare-products\"] button[class=\"button-2 add-to-compare-list-button\"]"));
    }

    public WebElement AddingToCompareListSuccessMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement compareListLink()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"] a[href=\"/compareproducts\"]"));
    }

    public WebElement productNameInCompareList()
    {
        return Hooks.driver.findElement(By.cssSelector("tr[class=\"product-name\"] a[href=\"/25-virtual-gift-card\"]"));
    }
}
