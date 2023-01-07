package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class LoginPageLocator extends BaseClass {
	
	public  LoginPageLocator() {

		PageFactory.initElements(driver, this);

	}
  @FindBy(id = "email")
  public WebElement EmailField;
  
  @FindBy(id = "passwd")
  public WebElement passwordField;
  
  @FindBy(id = "SubmitLogin")
  public WebElement signInButton;
  
  

}
