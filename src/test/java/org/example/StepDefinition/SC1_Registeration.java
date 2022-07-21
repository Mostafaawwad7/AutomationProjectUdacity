package org.example.StepDefinition;

import org.example.Elements.RegisterPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

//Do happy Scenario Only
public class SC1_Registeration
{

    RegisterPageElements register = new RegisterPageElements();

    @Given("user click on register")
    public void registerLink()
    {
        register.registerLink().click();

    }

    @When("^user enter \"(.*)\" and \"(.*)\" as name$")
  public void enterName(String firstName, String lastName)
  {
      register.firstName().sendKeys(firstName);
      register.lastName().sendKeys(lastName);

  }


    @And("user choose gender")
    public void chooseGender()
    {
        register.maleGender().click();
    }

    @And("user enter date of birth")
    public void dateOfBirth()
  {     //Select DateOfBirthDay
      WebElement birthDay = register.dayOfBirth();
      Select selectDay = new Select(birthDay);
      selectDay.selectByIndex(30);
        //Select DateOfBirthMonth
      WebElement birthMonth = register.monthOfBirth();
      Select selectMonth = new Select(birthMonth);
      selectMonth.selectByValue("10");
        //Select DateOfBirthYear
      WebElement birthYear = register.yearOfBirth();
      Select selectYear = new Select(birthYear);
      selectYear.selectByValue("2002");

  }

    @And("^user enter \"(.*)\"$")
    public void enterEmail(String email)
  {
      register.email().sendKeys(email);
  }

    @And("^user enter company name as \"(.*)\"$")
    public void enterCompanyName(String name)
    {
        register.companyName().sendKeys(name);
    }

    @And("Uncheck Newsletter box")
    public void uncheckNewsletter()
    {
        register.newsletterCheckBox().click();
    }

    @And("^user enter \"(.*)\" as password$")
    public void enterPassword(String password)
    {
        register.password().sendKeys(password);
        register.confirmPassword().sendKeys(password);

    }

    @And("user click on register button")
    public void clickRegister()
    {
        register.registerButton().click();
    }

    @Then("Confirm that Registration is done")
    public void confirmRegistration()
    {
       String expectedResult = register.confirmRegMsg().getText();
        String actualResult = "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult),"Registration Failed");
    }









}
