package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utlity.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(css = "li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)")
    WebElement menMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-18 span")
    WebElement menBottoms;

    @CacheLookup
    @FindBy(css = "#ui-id-23 span")
    WebElement menPants;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement begs;

    public void mouseHoverToMenMenu() {
        Reporter.log("Mouse Hover To Men Menu"+ menMenu.toString());
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover To Men Menu");
    }

    public void mouseHoverToMenBottoms() {
        Reporter.log("Mouse Hover To Men Tops"+menBottoms.toString());
        mouseHoverToElement(menBottoms);
        CustomListeners.test.log(Status.PASS,"Mouse Hover To Men Tops");
    }

    public void clickOnPants() {
        Reporter.log("Click On Pants"+menPants.toString());
        mouseHoverToElementAndClick(menPants);
        CustomListeners.test.log(Status.PASS,"Click On Pants");
    }

    public void mouseHoverOnWomenMenu() {
        Reporter.log("Mouse Hover on Women Menu"+womenMenu.toString());
        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Women Menu");
    }

    public void mouseHoverOnTops() {
        Reporter.log("Mouse Hover on Tops"+tops.toString());
        mouseHoverToElement(tops);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Tops");
    }

    public void clickOnJackets() {
        Reporter.log("Click on Jackets"+jackets.toString());
        mouseHoverToElementAndClick(jackets);
        CustomListeners.test.log(Status.PASS,"Click on Jackets");
    }

    public void mouseHoverOnGearManu() {
        Reporter.log("Mouse Hover on Gear Menu"+gearMenu.toString());
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Gear Menu");
    }

    public void clickOnBags() {
        Reporter.log("Click on Bags"+begs.toString());
        mouseHoverToElementAndClick(begs);
        CustomListeners.test.log(Status.PASS,"Click on Bags");
    }

}
