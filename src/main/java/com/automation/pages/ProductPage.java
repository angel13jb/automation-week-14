package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantityField;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizeField;
    @FindBy(xpath = "//a[contains(@class,'color_pick' )]")
    List<WebElement> coulrList;
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addCartField;
    //@FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement successfullyAddedMessageTextField;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeWindowTAb;


    public void enterQuantity(String qty) throws InterruptedException {
        quantityField.clear();
        Thread.sleep(2000);
        sendTextToElement(quantityField, qty);

    }

    public void selectSize(String siz) {
        selectByVisibleTextFromDropDown(sizeField, siz);
    }

    public void clickOnColur(String colur) {
        for (WebElement cLists : coulrList) {
            if (cLists.getAttribute("title").equals(colur)) {
                cLists.click();
            }
        }
    }

    public void clickOnAddCart() {
        clickOnElement(addCartField);

    }

    public String getSuccessFullyAddedText() {
        return successfullyAddedMessageTextField.getAttribute("innerHTML");
    }
    public void clickOnCloseWindowTab() {
        clickOnElement(closeWindowTAb);
    }
}
