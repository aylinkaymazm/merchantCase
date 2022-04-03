package com.hepsiburada.TestSteps;

import com.hepsiburada.PageObjectModel.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
    MainPage mainPage;

    @Given("I am on the home page")
    public void onHomePage() {
        mainPage = new MainPage();
        mainPage.openHomePage();
    }

    @When("I click on the login page button")
    public void clickLoginPageButton() throws InterruptedException {
        mainPage.clickLoginPageButton();
    }

    @Then("Wait for the home page to load and checkout login")
    public void waitForTheHomePageToLoad() throws InterruptedException {
        mainPage.waitForHomePageToLoad();
        mainPage.checkoutLogin();
    }

    @And("I search for the {string} product")
    public void searchForTheProduct(String product) throws InterruptedException {
        mainPage.searchProduct(product);
    }
}
