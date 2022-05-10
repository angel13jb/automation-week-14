package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnSignInLink();
        signInPage.enterCreateEmail("lilysmith@gmail.com");
        signInPage.clickOnCreateAnAccountButton();
        createAccountPage.clickOnRadioButton();
        createAccountPage.enterFirstNameField("lily");
        createAccountPage.enterLastNameField("smith");
        createAccountPage.enterEmailField("lilysmith@gmail.com");
        createAccountPage.enterPasswordField("lilysmith12");
        createAccountPage.selectDayName("1  ");
        createAccountPage.selectMonthName("January ");
        createAccountPage.selectYearName("2022  ");
        createAccountPage.enterFirstName("lily");
        createAccountPage.enterLastName("smith");
        createAccountPage.enterAddress("albany road");
        createAccountPage.enterCityName("corby");
        createAccountPage.selectStateName("California");
        createAccountPage.enterPostCodeField("35900");
        createAccountPage.selectCountryName("United States");
        createAccountPage.enterMobileNumber("08675342234");
        createAccountPage.enterAddressAlias("My address");
        createAccountPage.clickOnRegisterButton();
        String expectedMessage="MY ACCOUNT";
        String actualMessage=createAccountPage.getMyAccountText();
        Assert.assertEquals(expectedMessage,actualMessage,"Message not displayed");




    }
}