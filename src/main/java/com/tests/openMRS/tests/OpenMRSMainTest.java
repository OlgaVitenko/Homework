package com.tests.openMRS.tests;

import com.tests.openMRS.pages.OpenMRSMainPage;
import org.testng.annotations.Test;

public class OpenMRSMainTest extends OpenMRSTestBase {

    @Test
    public void loginPageValidation() {
        OpenMRSMainPage openMRSMainPage = new OpenMRSMainPage(driver);
        openMRSMainPage.logInFunctionality();


    }
}
