package com.tests.openMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.List;

public class OpenMRSMainPage {
    public OpenMRSMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(css = "#Laboratory")
    WebElement laboratory;
    @FindBy(css = "#loginButton")
    WebElement loginButton;
    @FindBy(css = "#coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    WebElement findPatientButton;
    @FindBy(xpath = "//tr[@class='odd'][1]")
    List<WebElement>patientInfo;
    @FindBy(xpath = "//tr//td[@class=''][1]")
    List<WebElement> allIds;

    public void logInFunctionality() {
        username.sendKeys("admin");
        password.sendKeys("Admin123");
        laboratory.click();
        loginButton.click();

    }

    public void patientRegistration(String name) {
        findPatientButton.click();
        for(WebElement info:patientInfo){
            Assert.assertTrue(BrowserUtils.getText(info).contains(name));
        }
        for (int i=1,j=0; i<allIds.size();i++){
            Assert.assertFalse(BrowserUtils.getText(allIds.get(j)).contains(BrowserUtils.getText(allIds.get(i))));
        }
    }

}
