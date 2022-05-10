package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintedDressProductPage extends Utility {
    public PrintedDressProductPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
    @FindBy(css = "#group_1")
    WebElement sizeDropDown;
    @FindBy(css = "#color_13")
    WebElement colour;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartButton;

    public void mouseHoverAndClickOnQuantity(){
        mouseHoverToElementAndClick(quantity);
    }
    public void selectSize(String size){
        selectByVisibleTextFromDropDown(sizeDropDown,size);
    }
    public void clickOnColourBox(){
        clickOnElement(colour);
    }
    public void clickOnAddTOCartButton(){
        clickOnElement(addToCartButton);
    }
}
