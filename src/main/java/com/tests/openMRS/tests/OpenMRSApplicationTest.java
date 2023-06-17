package com.tests.openMRS.tests;

import com.tests.openMRS.pages.OpenMRSApplicationPage;
import com.tests.openMRS.pages.OpenMRSMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OpenMRSApplicationTest extends OpenMRSTestBase{

    @Test
    public void registrationValidation() throws InterruptedException {
        OpenMRSMainPage openMRSMainPage = new OpenMRSMainPage(driver);
        openMRSMainPage.logInFunctionality();
        OpenMRSApplicationPage openMRSApplicationPage =new OpenMRSApplicationPage(driver);
        openMRSApplicationPage.informationInput();
        openMRSApplicationPage.registrationFunctionality("Vitenko","Patient ID");
        openMRSMainPage.patientRegistration("Olga");
    }
}
