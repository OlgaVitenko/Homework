package com.tests.openMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class OpenMRSApplicationPage {
    public OpenMRSApplicationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@id,'registerPatient')]")
    WebElement registerPatient;
    @FindBy(xpath = "//input[@name='givenName']")
    WebElement name;
    @FindBy(xpath = "//input[@name='familyName']")
    WebElement lastName;
    @FindBy(xpath = "//span[@id='genderLabel']")
    WebElement gender;
    @FindBy(xpath = "//option[@value='F']")
    WebElement female;
    @FindBy(xpath = "//span[@id='birthdateLabel']")
    WebElement birthday;
    @FindBy(xpath = "//input[@name='birthdateDay']")
    WebElement birthdayDay;
    @FindBy(xpath = "//select[@name='birthdateMonth']")
    WebElement months;
    @FindBy(xpath = "//input[@name='birthdateYear']")
    WebElement birthYear;
    @FindBy(xpath = "//span[.='Address']")
    WebElement addressButton;
    @FindBy(css = "#address1")
    WebElement address;
    @FindBy(css = "#cityVillage")
    WebElement city;
    @FindBy(css = "#stateProvince")
    WebElement state;
    @FindBy(css = "#country")
    WebElement country;
    @FindBy(css = "#postalCode")
    WebElement postalCode;
    @FindBy(xpath = "//li[@class='question-legend']//span")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    WebElement phoneNumberInput;
    @FindBy(css = "#confirmation_label")
    WebElement confirm;
    @FindBy(xpath = "//div[@id='dataCanvas']//p")
    List<WebElement> allInformation;
    @FindBy(css = "#submit")
    WebElement submitButton;
    @FindBy(tagName = "h1")
    List<WebElement> patientInfo;
    @FindBy(css = ".identifiers")
    WebElement patientId;
    @FindBy(xpath = "//div[@class='logo']//a")
    WebElement homeButton;


    public void informationInput() throws InterruptedException {
        registerPatient.click();
        name.sendKeys("Olga");
        lastName.sendKeys("Vitenko");
        gender.click();
        female.click();
        birthday.click();
        birthdayDay.sendKeys("09");
        Select select = new Select(months);
        select.selectByVisibleText("April");
        birthYear.sendKeys("1989");
        Thread.sleep(2000);
        addressButton.click();
        address.sendKeys("2200 E Devon ave");
        city.sendKeys("Des Plains");
        state.sendKeys("IL");
        country.sendKeys("USA");
        postalCode.sendKeys("60018");
        phoneNumber.click();
        phoneNumberInput.sendKeys("996 52 18 0592");
        confirm.click();


    }

    public void registrationFunctionality(String lastname, String id) {

        List<String> myInfo = Arrays.asList("Vitenko", "Female", "1989", "Devon", "0592");
        for (int i = 0; i < allInformation.size(); i++) {
            Assert.assertTrue(BrowserUtils.getText(allInformation.get(i)).contains(myInfo.get(i)));
        }

        submitButton.click();
        for (WebElement info : patientInfo) {
            if (BrowserUtils.getText(info).contains(lastname)) ;
            Assert.assertTrue(BrowserUtils.getText(info).contains(lastname));
        }
        Assert.assertTrue(BrowserUtils.getText(patientId).contains(id));
        homeButton.click();
    }
}
