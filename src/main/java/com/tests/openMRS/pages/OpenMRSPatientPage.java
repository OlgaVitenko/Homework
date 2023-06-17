package com.tests.openMRS.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class OpenMRSPatientPage {
    public OpenMRSPatientPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//tr[@class='odd'][1]")
    WebElement patientInformationButton;
    @FindBy(xpath = "//a[@id='org.openmrs.module.coreapps.deletePatient']")
    WebElement deleteButton;
    @FindBy(xpath = "//div[@id='delete-patient-creation-dialog']//button[.='Confirm']")
    WebElement confirmButton;
    @FindBy(css = "#delete-reason-empty")
    WebElement emptyFieldAlert;
    @FindBy(css = "#delete-reason")
    WebElement reasonField;


    public void patientRegistration(String message,String reason) throws InterruptedException {
        patientInformationButton.click();
        deleteButton.click();
        Thread.sleep(1000);
        confirmButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(BrowserUtils.getText(emptyFieldAlert),message);
        reasonField.sendKeys(reason);
        confirmButton.click();
        Thread.sleep(200);


    }
}
