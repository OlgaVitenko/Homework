package com.tests.openMRS.tests;

import com.tests.openMRS.pages.MrsTest2RegisterPage;
import com.tests.openMRS.pages.OpenMRSMainPage;
import org.testng.annotations.Test;

public class MrsTest2RegisterTest extends OpenMRSTestBase{
    @Test
    public void test2RegistrationFunctionality(){
        OpenMRSMainPage openMRSMainPage = new OpenMRSMainPage(driver);
        openMRSMainPage.logInFunctionality();
        MrsTest2RegisterPage registerPage=new MrsTest2RegisterPage(driver);
        registerPage.pageFunctionality(driver,"Laboratory","Logged in as Super User (admin) at Laboratory.");

    }
}
