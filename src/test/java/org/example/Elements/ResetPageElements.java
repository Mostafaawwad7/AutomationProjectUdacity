package org.example.Elements;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResetPageElements {
    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement forgetPassword()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement recoverButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
    }
    public WebElement confirmResetMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
