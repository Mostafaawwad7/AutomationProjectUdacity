package org.example.StepDefinition;
import org.example.Elements.SelectTagsPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SC8_SelectDifferentTags {
    SelectTagsPageElements anyCategoryPage=new SelectTagsPageElements();
    Random random = new Random();
    SoftAssert tagPage= new SoftAssert();
    int randomNumber;
    int randomNumber2;
    String expectedURL;


    @Given("user select random category")
    public void SelectRandomCategory()
    {
            int numberOfCategories=SelectTagsPageElements.categories().size();
            int numberOfSubCat=SelectTagsPageElements.allSubCategories().size();
            int numberOfAvailableSubCat=0;
            randomNumber = random.nextInt(numberOfCategories);
            Actions action = new Actions(Hooks.driver);
            List<WebElement> availableSubCat=new ArrayList<WebElement>();
            action.moveToElement(SelectTagsPageElements.categories().get(randomNumber)).perform();
            for(int i=0;i<numberOfSubCat;i++)
            {
                if(SelectTagsPageElements.allSubCategories().get(i).isDisplayed())
                {
                    numberOfAvailableSubCat++;
                    availableSubCat.add(SelectTagsPageElements.allSubCategories().get(i));
                }
            }
            if(numberOfAvailableSubCat>0)
            {
                randomNumber2 = ((this.random.nextInt(numberOfAvailableSubCat)));
                expectedURL=availableSubCat.get(randomNumber2).getAttribute("href");
                availableSubCat.get(randomNumber2).click();
            }
            else
            {
                expectedURL= SelectTagsPageElements.categories().get(randomNumber).getAttribute("href");
                SelectTagsPageElements.categories().get(randomNumber).click();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    @When("user select random tag")
    public void userSelectRandomTag()
    {
        int numberOfAvailableTags = anyCategoryPage.allTags().size();
        randomNumber=random.nextInt(numberOfAvailableTags);
        anyCategoryPage.allTags().get(randomNumber).click();
    }
    @Then("user should see relative products to the selected tag")
    public void userShouldSeeRelativeProductsToTheSelectedTag()
    {
        tagPage.assertTrue(anyCategoryPage.pageTitle().getText().contains(anyCategoryPage.allTags().get(randomNumber).getText()));
        tagPage.assertAll();
    }

}
