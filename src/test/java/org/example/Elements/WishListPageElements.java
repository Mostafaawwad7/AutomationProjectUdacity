package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishListPageElements {

    public WebElement randomProduct()
    {
        return Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }

    public WebElement AddToWishListButton()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-18"));
    }

    public WebElement addedToWishListSuccesMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement wishListLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("p[class=\"content\"] a[href=\"/wishlist\"]"));
    }

    public WebElement productNameInWishList()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"product-name\"]"));
    }
}

