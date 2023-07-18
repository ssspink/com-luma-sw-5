package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utlity.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PantsPage extends Utility {
    @CacheLookup
    @FindBy(css = ".product-item-link")
    WebElement productName;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement  size32;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(css = ".action.tocart.primary")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(css = "[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
    WebElement addedPant;
    @CacheLookup
    @FindBy(css = ".message-success.success.message div a")
    WebElement linkShoppingCart;

    public void hoverAndClickProduct() {
        Reporter.log("Mouse Hover and Click Product"+productName.toString());
        mouseHoverToElement(productName);
        Reporter.log("Mouse Hover and Click Product"+size32.toString());
        mouseHoverToElementAndClick(size32);
        CustomListeners.test.log(Status.PASS,"Mouse Hover and Click Product");
    }

    public void hoverAndClickProductColour() {
        Reporter.log("Mouse Hover and Click Product Colour"+productName.toString());
        mouseHoverToElement(productName);
        Reporter.log("Mouse Hover and Click Product Colour"+colourBlack.toString());
        mouseHoverToElementAndClick(colourBlack);

    }

    public void hoverAndClickOnAddToCartButton() {
        Reporter.log("Mouse Hover on product"+productName.toString());
        mouseHoverToElement(productName);
        Reporter.log("Mouse Hover and Click Add to cart Button"+addToCartButton.toString());
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {
        Reporter.log("get Text Added Pant To Shopping Cart"+addedPant.toString());
        CustomListeners.test.log(Status.PASS,"get Text Added Pant To Shopping Cart");
        return getTextFromElement(addedPant);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click On Shopping Cart");
        clickOnElement(linkShoppingCart);
        CustomListeners.test.log(Status.PASS,"Click On Shopping Cart");
    }
}
