package org.example.StepDefinition;


import org.example.Elements.ResetPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

//***Note**** in this case you just need to confirm that this message is displayed
// "Email with instructions has been sent to you."
public class SC3_ResetPassword {
    ResetPageElements reset = new ResetPageElements();
    @Given("user click on login link")
    public void loginLink()
    {
        reset.loginButton().click();
    }

    @Given("user click on forget password")
    public void forgetPasswordLink()
    {
        reset.forgetPassword().click();
    }
    @When("user enter his email")
    public void enterEmail()
    {
        reset.email().sendKeys("mostafaawad311@gmail.com");
    }

    @And("user click on recover")
    public void clickRecover()
    {
        reset.recoverButton().click();
    }
    @Then("user should recieve confirmation message")
    public void confirmReset()
    {
        String actualResult = reset.confirmResetMsg().getText();
        Assert.assertEquals(actualResult,"Email with instructions has been sent to you.");
    }
}
