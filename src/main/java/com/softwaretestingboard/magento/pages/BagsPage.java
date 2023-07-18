package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utlity.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BagsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productName;

    public void clickOnProduct() {
        Reporter.log("Click On Product"+productName.toString());
        clickOnElement(productName);
        CustomListeners.test.log(Status.PASS,"Click On Product");
    }
}
