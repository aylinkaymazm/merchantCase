package com.hepsiburada.PageObjectModel;

import com.hepsiburada.DriverUtility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class MainPage extends BasePage {

    @FindBy(xpath = "//span[@title='Giriş Yap']")
    private WebElement hoverLoginLocator;

    @FindBy(id = "login")
    private WebElement loginLocator;

    @FindBy(xpath = "//div[@id='myAccount']//span[contains(text(),'Hesabım')]")
    private WebElement checkoutMyAccount;

    @FindBy(xpath = "//input[@type='text' and @aria-controls='react-autowhatever-1']")
    private WebElement searchLocator;

    @FindBy(className = "SearchBoxOld-buttonContainer")
    private WebElement searchButtonLocator;

    WebDriver driver;

    public MainPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickLoginPageButton() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(hoverLoginLocator).build().perform();
        click(loginLocator);
    }

    public void waitForHomePageToLoad() throws InterruptedException {
        Thread.sleep(3000);
    }


    public void checkoutLogin() {
        var x = wait.until(ExpectedConditions.visibilityOf(checkoutMyAccount)).isDisplayed();
        Assert.assertTrue(x);
    }

    public void searchProduct(String product) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(searchLocator)).sendKeys(product);
        click(searchButtonLocator);
        Thread.sleep(3000);
    }




}
