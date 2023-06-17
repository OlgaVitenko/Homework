package com.tests.openMRS.tests;

import com.tests.openMRS.pages.OpenMRSApplicationPage;
import com.tests.openMRS.pages.OpenMRSMainPage;
import com.tests.openMRS.pages.OpenMRSPatientPage;
import org.testng.annotations.Test;

public class OpenMRSPatientTest extends OpenMRSTestBase{

    @Test
    public void patientRegistrationVerification() throws InterruptedException {
        OpenMRSMainPage openMRSMainPage = new OpenMRSMainPage(driver);
        openMRSMainPage.logInFunctionality();
        OpenMRSApplicationPage openMRSApplicationPage =new OpenMRSApplicationPage(driver);
        openMRSApplicationPage.informationInput();
        openMRSApplicationPage.registrationFunctionality("Vitenko","Patient ID");
        openMRSMainPage.patientRegistration("Olga");
        OpenMRSPatientPage patientPage= new OpenMRSPatientPage(driver);
        patientPage.patientRegistration("Reason cannot be empty","moved");

    }
}
