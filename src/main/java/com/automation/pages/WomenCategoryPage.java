package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement womenText;
    @FindBy(linkText = "Tops")
    WebElement topsLink;
    @FindBy(linkText = "Dresses")
    WebElement dressesLink;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDown;
    @FindBy(xpath = "//div[@class='product-flags']")
    List<WebElement> productLists;
    @FindBy(linkText = "Blouse")
    WebElement blouseLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDressLink;
    @FindBy(xpath = "//a[contains(text(),'Printed Chiffon Dress')]")
    WebElement printedChiffonDress;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDress;

    public String getWomenText() {
        return getTextFromElement(womenText);
    }

    public void clickOnTopsLink() {
        clickOnElement(topsLink);
    }

    public void clickOnDressesLink() {
        clickOnElement(dressesLink);
    }

    public void selectSortByDropDown(int sortby) {
        selectByIndexFromDropDown(sortByDropDown, sortby);

    }
    public int getProductListsize() {
        List<WebElement> lists = productLists;
        return lists.size();
    }



    public void mouseHoverAndClickOnBlouseLink() {
        mouseHoverToElementAndClick(blouseLink);
    }

    public void mouseHoverAndClickOnPrintedDressLink() {
        mouseHoverToElementAndClick(printedDressLink);
    }

    public void mouseHoverAndClickOnPrintedChiffonDressLink() {
        mouseHoverToElementAndClick(printedChiffonDress);
    }

    public void mouseHoverAndClickOnPrintedSummerDressLink() {
        mouseHoverToElementAndClick(printedSummerDress);
    }

    public void clickOnProduct(String product) {
        for (WebElement lists : productLists)
            if (lists.getText().matches(product)) {
                lists.click();
                break;

            }
    }
}