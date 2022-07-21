package org.example.StepDefinition;

import org.example.Elements.LoginPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SC2_Login {
    LoginPageElements login = new LoginPageElements();

    @Given("user click on Login")
    public void loginLink()
    {
        login.loginLink().click();
    }

    @When("user enter valid mail")
    public void enterEmail()
    {
        login.email().sendKeys("mostafaawad311@gmail.com");
    }

    @And("user enter valid password")
    public void enterPassword()
    {
        login.password().sendKeys("123456789");
    }

    @And("user click on login button")
    public void clickLogin()
    {
        login.loginButton().click();
    }

    @Then("user confirm login by checking the URL")
    public void confirmLogin()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }


}
