package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class registerTestCases {
    



    @FindBy(xpath="//input[@placeholder='First Name']")
    public WebElement first_name

     @FindBy(xpath="//input[@placeholder='Last Name']")
     public WebElement last_name

     @FindBy(xpath="//input[@type='email']")
     public WebElement email

     @FindBy(xpath="//input[@type='radio' and @value='Male']")
     public WebElement selectmale

     @FindBy(xpath="//input[@type='radio' and @value='FeMale']")
     public WebElement selectfemale


     @FindBy(xpath ='//select[@id='select2-country-container']')
     public WebElement selectcountry


      @FindBy(xpath ='//label[contains(text(),'Password')]')
     public WebElement Password

      @FindBy(xpath ='//label[contains(text(),'Confirm Password')]')
     public WebElement Confirm_Password

    @FindBy(xpath ='//input[@id='submitbtn']')
     public WebElement submit


    public void enterfirstname()
    {
        first_name.sendKeys("Saurabh")
    }
    
    public void enterLastName()
    {
            last_name.sendKeys("takru")
    }

    
    public void enterEmail()
    {
        email.sendKeys("takrusaurabh07@gmail.com")
    }   

    
    public void selectgenderMale()
    {
        selectmale.click()    
    }

     
    public void selectgenderfemale()
    {
        selectfemale.click();
    }

    public void selectcountry(selectcountry)
    {
        Select select = new Select(selectcountry);
        select.selectByValue("India");
    }


    private void enterPassword()
    {
        Password.sendKeys("123asdc#")
    }
      private void enterConfirmPassword()
    {
            Confirm_Password.sendKeys("123asdc#");
    }

  public void submit()
    {
      submit.click();
    }

}
