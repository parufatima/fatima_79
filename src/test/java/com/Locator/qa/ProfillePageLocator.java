package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class ProfillePageLocator extends BaseClass {

	public ProfillePageLocator() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='paru begum']")
	public WebElement profilleName;
	
}
