package com.crm.qa.pages;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

@Test
public class registerPage {
    
  Webdriver driver = TestBase.getDriver("chrome");
    driver.enterfirstname();
    driver.enterlastname();
    driver.enterEmail();l

}
