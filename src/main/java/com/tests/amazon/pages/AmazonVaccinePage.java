package com.tests.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class AmazonVaccinePage {
    public AmazonVaccinePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//nav[contains(@class,'expand-lg')]")
    List<WebElement> topInfoLine;
    @FindBy(xpath = "//div[@class='card-body']//button")
    List<WebElement> allVaccines;
    @FindBy(xpath = "//a[.='Cart']")
    WebElement cart;
    @FindBy(xpath = "//tbody//td[2]")
    List<WebElement>vaccinesInCart;

    public void validateUserCreation(String name) {
        for (WebElement item : topInfoLine) {
            if (BrowserUtils.getText(item).contains(name)) {
                Assert.assertTrue(BrowserUtils.getText(item).contains(name));
            }
        }
    }
    public void cartValidation(String vaccineName) throws InterruptedException {
        allVaccines.get(0).click();
        Thread.sleep(1000);
        allVaccines.get(0).click();
        cart.click();
        for(WebElement vaccine:vaccinesInCart){
            Assert.assertTrue(BrowserUtils.getText(vaccine).contains(vaccineName));
        }
    }
}
