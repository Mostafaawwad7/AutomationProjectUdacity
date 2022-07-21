package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPageElements {

public WebElement registerLink()
{
    return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
}

public WebElement firstName()
{
    return Hooks.driver.findElement(By.id("FirstName"));
}

public WebElement lastName()
{
    return Hooks.driver.findElement(By.id("LastName"));
}

public WebElement maleGender()
{
    return Hooks.driver.findElement(By.id("gender-male"));
}

public WebElement femaleGender()
{
    return Hooks.driver.findElement(By.id("gender-female"));
}

public WebElement dayOfBirth()
{
    return Hooks.driver.findElement(By.name("DateOfBirthDay"));
}

public WebElement monthOfBirth()
{
    return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
}

public WebElement yearOfBirth()
{
    return Hooks.driver.findElement(By.name("DateOfBirthYear"));
}

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement companyName()
    {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement newsletterCheckBox()
    {
        return Hooks.driver.findElement(By.id("Newsletter"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement confirmRegMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }




}
