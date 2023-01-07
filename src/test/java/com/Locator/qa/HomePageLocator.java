package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class HomePageLocator extends BaseClass {
	
	public HomePageLocator () {

		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText = "Contact us")
	public WebElement contactusLink;
	
	@FindBy(id= "search_query_top")
	public WebElement searchField;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	public WebElement searchButton;
	
	@FindBy(css = ".lighter")
	public WebElement womanSearchResult;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	public WebElement homePageLogo;
	
	@FindBy(xpath = "//a[@class='login']" )
	public WebElement SignInLink;
	
}
