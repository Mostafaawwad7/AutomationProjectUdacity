package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FilterWithColorPageElements {
    public WebElement apparelCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/apparel\"]"));
    }

    public WebElement shoesSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] ul[class=\"sublist first-level\"] a[href=\"/shoes\"]"));
    }

    public WebElement redColour()
    {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }
}
