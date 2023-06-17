package com.tests.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage {
    public AmazonMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement logIn;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='regbtn']")
    WebElement registrationButton;
    @FindBy(xpath = "//button[@name='loginbtn']")
    WebElement registrationButton2;
    @FindBy(xpath = "//button[@name='loginbtn']")
    WebElement logInButton;

    public void logInPageFunctionality(String login, String passWord) throws InterruptedException {

        logIn.clear();
        Thread.sleep(1000);
        password.clear();
        Thread.sleep(1000);
        registrationButton.click();
        Thread.sleep(1000);
        logIn.sendKeys(login);
        Thread.sleep(1000);
        password.sendKeys(passWord);
        Thread.sleep(1000);
        registrationButton2.click();
        Thread.sleep(1000);
        logIn.clear();
        Thread.sleep(1000);
        logIn.sendKeys(login);
        Thread.sleep(1000);
        password.clear();
        Thread.sleep(500);
        password.sendKeys(passWord);
        Thread.sleep(500);
        logInButton.click();


    }
}
