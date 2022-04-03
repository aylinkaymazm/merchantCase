package com.hepsiburada.PageObjectModel;

import com.hepsiburada.DriverUtility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage {
    @FindBy(xpath = "//li[contains(@class,'basket_item_1rDra')]")
    private List<WebElement> basketItems;
    WebDriver driver;

    public CartPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void checkBasketItems() {
        Assert.assertTrue(basketItems.size() > 0, "Sepetinizde ürün bulunmamaktadır.");
    }


}
