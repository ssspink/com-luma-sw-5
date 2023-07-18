package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    /*
Create the package ‘testsuite’ and create the classes WomenTest inside the ‘testsuite’ package.
 */
    HomePage homePage;
    PantsPage pants;
    ShoppingCartPage shoppingCart;

    public void inIt() {
        homePage = new HomePage();
        pants = new PantsPage();
        shoppingCart = new ShoppingCartPage();
    }

    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Men Menu
        Thread.sleep(2000);
        homePage.mouseHoverToMenMenu();

        // Mouse Hover on Bottoms
        Thread.sleep(2000);
        homePage.mouseHoverToMenBottoms();

        // Click on Pants
        Thread.sleep(2000);
        homePage.clickOnPants();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        pants.hoverAndClickProduct();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        Thread.sleep(3000);
        pants.hoverAndClickProductColour();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        pants.hoverAndClickOnAddToCartButton();
       // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(pants.getTextAddedPantToShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.", "Error");

        // Click on ‘shopping cart’ Link into message
        pants.clickOnShoppingCart();

        // Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCart.getTextShoppingCart(), "Shopping Cart", "Error");

        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCart.getTextCronusYogaPant(), "Cronus Yoga Pant", "Error");

        // Verify the product size ‘32’
        Assert.assertEquals(shoppingCart.getTextSize32(), "32", "Error");

        // Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCart.getTextBlack(), "Black", "Error");
    }

    }

