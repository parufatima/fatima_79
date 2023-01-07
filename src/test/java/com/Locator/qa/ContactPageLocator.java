package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class ContactPageLocator extends BaseClass {

	public ContactPageLocator() {

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
	public WebElement  contactpage;

	@FindBy(css =  ".icon-home")
	public WebElement homeIcon;
	
}
