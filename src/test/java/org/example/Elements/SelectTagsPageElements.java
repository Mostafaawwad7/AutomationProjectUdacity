package org.example.Elements;

import org.example.StepDefinition.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;


public class SelectTagsPageElements {
    public List<WebElement> allTags()
    {
        List <WebElement> allTags = Hooks.driver.findElements(By.xpath("//div[@class=\"tags\"]/ul/li/a"));
        return allTags;
    }
    public WebElement pageTitle()
    {
        WebElement pageTitle= Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1"));
        return pageTitle;
    }



    public static List<WebElement> categories()
    {
        List <WebElement> categories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
        return categories;
    }

    public static List<WebElement> allSubCategories()
    {
        List <WebElement> allSubCategories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li//ul//li//a"));
        return allSubCategories;
    }




}
