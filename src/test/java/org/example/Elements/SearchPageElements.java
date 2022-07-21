package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPageElements {
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

}
