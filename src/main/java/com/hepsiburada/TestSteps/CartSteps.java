package com.hepsiburada.TestSteps;

import com.hepsiburada.PageObjectModel.CartPage;
import io.cucumber.java.en.Then;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("I should see the product add to the cart from different sellers")
    public void WatchTheProductsOnBasket() throws InterruptedException {
        Thread.sleep(500);
        cartPage.checkBasketItems();
    }


}
