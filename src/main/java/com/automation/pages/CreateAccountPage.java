package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#id_gender2")
    WebElement mrsRadioButton;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstnameField;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastnameField;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//select[@id='days']")
    WebElement daysName;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthsName;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearsName;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityName;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateName;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postCodeField;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryName;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement addressAlias;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountText;

    public void clickOnRadioButton() {
        clickOnElement(mrsRadioButton);
    }

    public void enterFirstNameField(String firstname) {
        sendTextToElement(firstnameField, firstname);
    }

    public void enterLastNameField(String lastName) {
        sendTextToElement(lastnameField, lastName);
    }

    public void enterEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void selectDayName(String day) {
        selectByVisibleTextFromDropDown(daysName, day);
    }

    public void selectMonthName(String month) {
        selectByVisibleTextFromDropDown(monthsName, month);
    }

    public void selectYearName(String year) {
        selectByVisibleTextFromDropDown(yearsName, year);
    }

    public void enterFirstName(String ftName) {
        sendTextToElement(firstName, ftName);
    }

    public void enterLastName(String ltName) {
        sendTextToElement(lastName, ltName);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCityName(String city) {
        sendTextToElement(cityName, city);
    }

    public void selectStateName(String state) {
        selectByVisibleTextFromDropDown(stateName, state);
    }

    public void enterPostCodeField(String postcode) {
        sendTextToElement(postCodeField, postcode);
    }

    public void selectCountryName(String country) {
        selectByVisibleTextFromDropDown(countryName, country);
    }

    public void enterMobileNumber(String mnumber) {
        sendTextToElement(mobileNumber, mnumber);
    }

    public void enterAddressAlias(String alias) {
        sendTextToElement(addressAlias, alias);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getMyAccountText(){
        return getTextFromElement(myAccountText);
    }

}
