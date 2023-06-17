package com.tests.amazon.tests;

import com.tests.amazon.pages.AmazonMainPage;
import com.tests.amazon.pages.AmazonVaccinePage;
import org.testng.annotations.Test;

public class AmazonVaccineTest extends AmazonTestBase{
    @Test
    public void cartFunctionality() throws InterruptedException {
        AmazonMainPage mainPage= new AmazonMainPage(driver);
        mainPage.logInPageFunctionality("Apple26","Apple26");
        AmazonVaccinePage vaccinePage=new AmazonVaccinePage(driver);
        vaccinePage.validateUserCreation("Apple26");
        vaccinePage.cartValidation("Pfizer Vaccine");
    }
}
