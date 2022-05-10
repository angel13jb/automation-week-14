package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignInPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }
    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToSignInPageSuccessFully(){
        homePage.clickOnSignInLink();
        String expectedText="AUTHENTICATION";
        String actualText=signInPage.getAuthenticationText();
        Assert.assertEquals(expectedText,actualText,"Text not Displayed");
    }
    @Test(groups = {"regression","smoke"},dataProvider = "credentials",dataProviderClass = TestData .class)

    public void verifyTheErrorMessageWithInvalidCredentials(String username,String password,String message){
        homePage.clickOnSignInLink();
        signInPage.signinToApplication(username,password);
        String expectedErrorMessage="Authentication failed.";
        String actualErrorMessage=signInPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message not displayed");
    }
    @Test(groups = {"regression","smoke"})
    public void verifyThatUserShouldLoginSuccessFuLlyWithValidCredentials(){
        homePage.clickOnSignInLink();
        signInPage.signinToApplication("lily@gmail.com","lily12");
        String expectedText="Sign out";
        String actualText=signInPage.getSignOutText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
    }
    @Test(groups = "regression")
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignInLink();
        signInPage.signinToApplication("lily@gmail.com","lily12");
        signInPage.clickOnSignOutLink();
        String expectedText="Sign in";
        String actualText= homePage.getSigninLinkText();
        Assert.assertEquals(expectedText,actualText,"Text not Match");
    }
}
