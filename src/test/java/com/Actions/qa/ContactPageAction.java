package com.Actions.qa;

import org.testng.Assert;

import com.Locator.qa.ContactPageLocator;
import com.Utility.qa.BaseClass;

public class ContactPageAction extends BaseClass{
	
	ContactPageLocator  contactPageLocator = new ContactPageLocator();
	
	public void Verifycontactpagedisplay() {
		
		 boolean verifyContactPage = contactPageLocator.contactpage.isDisplayed();
		 Assert.assertTrue(verifyContactPage);
	}
	public void ClickHomeIcon() {
		
		contactPageLocator.homeIcon.click();
	}

}
