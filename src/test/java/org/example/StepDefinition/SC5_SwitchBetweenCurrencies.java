package org.example.StepDefinition;

import org.example.Elements.SwitchCurrenciesPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class SC5_SwitchBetweenCurrencies {

    SoftAssert productsPrices=new SoftAssert();
    SwitchCurrenciesPageElements Currency = new SwitchCurrenciesPageElements();
    @Given("user click on currency button")
    public void currencyButtonClick()
{
    Currency.currenciesButton().click();
}

@And("user change currency to EURO")
public void currencyChangeToEURO()
{
    WebElement currency = Currency.currenciesButton();
    Select selectCurrency = new Select(currency);
    selectCurrency.selectByVisibleText("Euro");
}

    @Then("all products should be shown in EUROS")
    public void userShouldFoundAllProductsPricesInEURO()
    {
        int numberOfProducts= SwitchCurrenciesPageElements.productPrices().size();
        for(int i=0;i<numberOfProducts;i++)
        {
            productsPrices.assertEquals(SwitchCurrenciesPageElements.productPrices().get(i).getText().substring(0,1),"€","Product price is not in EURO");
            productsPrices.assertAll();
        }
    }

}
