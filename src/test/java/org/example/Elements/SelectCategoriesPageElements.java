package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectCategoriesPageElements {
    public WebElement computersCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }

    public WebElement desktopsSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] ul[class=\"sublist first-level\"] a[href=\"/desktops\"]"));
    }
}
