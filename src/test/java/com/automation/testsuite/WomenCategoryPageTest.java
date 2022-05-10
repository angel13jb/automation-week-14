package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        womenCategoryPage = new WomenCategoryPage();
        productPage =new ProductPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        homePage.clickOnWomenTab();
        String expectedText="WOMEN";
        String actualText=womenCategoryPage.getWomenText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
    @Test(groups = {"smoke","regression"},dataProvider = "product",dataProviderClass = TestData.class)
    public  void verifyUserShouldAddProductToTheCartSuccessfully(String product,String qty,String size,String colour) throws InterruptedException {
        homePage.clickOnWomenTab();
        womenCategoryPage.clickOnProduct(product);
        productPage.enterQuantity(qty);
        productPage.selectSize(size);
        productPage.clickOnColur(colour);
        productPage.clickOnAddCart();
        Thread.sleep(2000);
        String actualText = productPage.getSuccessFullyAddedText();
        Assert.assertTrue(actualText.contains("Product successfully added to your shopping cart"));
        //Assert.assertEquals(actualText,expactedtText,"displayed message is wrong ");
        productPage.clickOnCloseWindowTab();



    }
}
