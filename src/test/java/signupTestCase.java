package com.crm.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class signupTestCase {
    
    private WebDriver driver;

    public signupTestCase(WebDriver driver)
    {
        this.driver=driver;
        
        PageFactory.initElement(driver,this);


    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Email_Sign_Up
    
    @FindBy(xpath = "//button[@id='btn1']")
    public WebElement Sign_In

    @FindBy(xpath = "//button[@id='btn2']")
    public WebElement Skip_Sign_In


    public void clicksignIn()
    {
        Skip_Sign_In.click();
    }

       public void enterusername()
    {
        Skip_Sign_In.sendKeys("");
    }

}
