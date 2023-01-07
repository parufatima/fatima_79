package com.Actions.qa;

import org.testng.Assert;

import com.Locator.qa.HomePageLocator;
import com.Utility.qa.BaseClass;
import com.Utility.qa.TestData;

public class HomePageAction extends BaseClass{
	
	HomePageLocator  homePageLocator = new HomePageLocator();
	
	public void Userclickoncontactuslink() {
		
		homePageLocator.contactusLink.click();
	}
	
	public void  Userenterwomaninsearchfield() {
		
		homePageLocator.searchField.sendKeys(TestData.searchInput);
	}
	public void Userclickonsearchbutton() {
		
		homePageLocator.searchButton.click();
	}
	public void Verifysearchresultdisplay() {
		
		boolean verifyWomanSerch = homePageLocator.womanSearchResult.isDisplayed();
		Assert.assertTrue(verifyWomanSerch);
		
	}
	public void  VerifyclickingHomeiconreturntohomepage() {
		
		boolean verifyHomePageLogo =  homePageLocator.homePageLogo.isDisplayed();
		Assert.assertTrue(verifyHomePageLogo);
		
	}
	
	public void  UserclickonSignINlink() {
		homePageLocator.SignInLink.click();
	}
	
	
	
	
	
	

}
