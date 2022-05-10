package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name="credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"","123456","An email address required"},
                {"abcd@gmail.com","","Password is required"},
                {"adfdfgfg","123456","Invalid email address"},
                {"abcd@gmail.com","123456","Authentication failed"}};


        return data;
    }
    @DataProvider(name="product")
    public Object[][] getProduct() {
        Object[][] product = new Object[][]{
                {"Blouse","2","M","White"},
                {"Printed Dress","3","l","Orange"},
                {"Printed Chiffon Dress","4","s","Green"},
                {"Printed Summer Dress","2","M","Blue"}


        };
        return product;

    }}