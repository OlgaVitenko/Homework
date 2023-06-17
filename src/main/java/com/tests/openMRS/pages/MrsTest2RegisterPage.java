package com.tests.openMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class MrsTest2RegisterPage {
    public MrsTest2RegisterPage (WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//span[@id='selected-location']")
    WebElement locationDepartment;
    @FindBy(tagName = "h4")
    WebElement superUser;
    @FindBy(css = ".logo")
    WebElement homeButton;



    public  void pageFunctionality(WebDriver driver,String department,String userCreate){
        Assert.assertEquals(BrowserUtils.getText(locationDepartment),department);
        Assert.assertEquals(BrowserUtils.getText(superUser),userCreate);
        driver.navigate().back();
    }
}
