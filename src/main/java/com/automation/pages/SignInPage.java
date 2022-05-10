package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createEmail;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAccountButton;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement errorMessage;
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutLink;


    public  void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }
    public  void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
    public void signinToApplication(String username,String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnSignInButton();
    }
    public void enterCreateEmail(String emailID){
        sendTextToElement(createEmail,emailID);
    }


    public void clickOnCreateAnAccountButton(){
        clickOnElement(createAccountButton);
    }
    public String getAuthenticationText(){
        return getTextFromElement(authenticationText);
    }
    public String getCreateAnAccountText(){
        return getTextFromElement(createAnAccountText);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public String getSignOutText(){
        return getTextFromElement(signOutLink);
    }
    public void clickOnSignOutLink(){
        clickOnElement(signOutLink);
    }
}
