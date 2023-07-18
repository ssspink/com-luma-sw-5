package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utlity.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedProductText;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement linkShoppingCart;

    public String verifyOvernightDuffleText() {
        Reporter.log("verify Overnight Duffle Text"+productText.toString());
        CustomListeners.test.log(Status.PASS,"verify Overnight Duffle Text");
        return getTextFromElement(productText);
    }

    public void changeQuantity(String qty) {
        Reporter.log("Change Quantity"+changeQty.toString());
        sendTextToElement(changeQty, Keys.BACK_SPACE + qty);
        CustomListeners.test.log(Status.PASS,"Change Quantity");

    }

    public void addToCart() {
        Reporter.log("Add TO Cart"+addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Add TO Cart");
    }

    public String verifyProductAddText() {
        Reporter.log("Verify Product Added Text"+addedProductText.toString());
        CustomListeners.test.log(Status.PASS,"Verify Product Added Text");
        return getTextFromElement(addedProductText);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click on Shopping Cart"+linkShoppingCart.toString());
        clickOnElement(linkShoppingCart);
        CustomListeners.test.log(Status.PASS,"Click on Shopping Cart");
    }
}
