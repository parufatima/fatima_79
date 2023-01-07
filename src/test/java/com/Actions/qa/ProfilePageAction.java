package com.Actions.qa;

import org.testng.Assert;

import com.Locator.qa.ProfillePageLocator;
import com.Utility.qa.BaseClass;

public class ProfilePageAction extends BaseClass {
	
	ProfillePageLocator profillePageLocator = new ProfillePageLocator();
	
	public void Verifyuserloginsuccessfully() {
		
		boolean verifyLogin = profillePageLocator.profilleName.isDisplayed();
		Assert.assertTrue(verifyLogin);
	}

}
