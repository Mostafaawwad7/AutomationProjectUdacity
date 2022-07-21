package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPageElements {
    public WebElement productName()
    {
        return Hooks.driver.findElement(By.cssSelector("div [class=\"picture\"]  a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public WebElement addToCartButton()
    {
        return Hooks.driver.findElement(By.id("add-to-cart-button-4"));
    }

    public WebElement addSuccessMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement closeMsgButton()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

    public WebElement cartLabel()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
    }

    public WebElement toCartButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 cart-button\"]"));
    }

    public WebElement productNameFromCart()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"product-name\"]"));
    }
}
