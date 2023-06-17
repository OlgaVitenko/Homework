package com.tests.amazon.tests;

import com.tests.amazon.pages.AmazonMainPage;
import org.testng.annotations.Test;

public class AmazonMainTest extends AmazonTestBase{

    @Test
    public void logInPageValidation() throws InterruptedException {
        AmazonMainPage mainPage= new AmazonMainPage(driver);
        mainPage.logInPageFunctionality("Apple8","Apple8");
    }
}
