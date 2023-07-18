package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utlity.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class JacketPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement sort;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> beforeProdductList;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> afterProductList;

    public void sortByFilter(String filter) {
        Reporter.log("Sort by Filter"+sort.toString());
        selectByVisibleTextFromDropDown(sort, filter);
        CustomListeners.test.log(Status.PASS, "Sort by Filter");
    }

    public void beforeSortByProductList() {
        List<WebElement> jacketsElementsList = beforeProdductList;
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
    }
    public void afterSortByProductList() throws InterruptedException {
        List<WebElement> jacketsElementsList = afterProductList;
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value1 : jacketsElementsList) {
            jacketsNameListAfter.add(value1.getText());
        }
    }
}
