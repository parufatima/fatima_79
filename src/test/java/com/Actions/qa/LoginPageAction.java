package com.Actions.qa;


import com.Locator.qa.LoginPageLocator;
import com.Utility.qa.BaseClass;

public class LoginPageAction extends BaseClass{
	
	LoginPageLocator loginPageLocator  = new LoginPageLocator();
	
	
	public void UserCredential(String uName, String PW) {
		
		loginPageLocator.EmailField.sendKeys(uName);
		loginPageLocator.passwordField.sendKeys(PW);
		loginPageLocator.signInButton.click();
		
	}
	

}
