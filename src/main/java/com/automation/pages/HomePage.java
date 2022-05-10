package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText ="Women")
    WebElement womenTab;

    @FindBy(linkText = "Dresses")
    WebElement dressesTab;

    @FindBy(linkText = "T-shirts")
    WebElement tShirtsTab;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoLocators;

    public void clickOnWomenTab(){
        clickOnElement(womenTab);
    }
    public void clickOnDressesTab(){
        clickOnElement(dressesTab);
    }
    public void clickOnTshirtsTab(){
        clickOnElement(tShirtsTab);
    }
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
    public  String getSigninLinkText(){
        return getTextFromElement(signInLink);
    }
    public void clickOnLogoLocatores(){
        clickOnElement(logoLocators);
    }
}
