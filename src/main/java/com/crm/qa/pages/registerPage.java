package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

import 

public class registerPage extends Testbase {

    Webdriver driver = TestBase.getDriver("chrome");
    driver.enterfirstname();
    driver.enterlastname();
    driver.enterEmail();
    
}
