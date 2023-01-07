package StepDepp;

import com.Actions.qa.ContactPageAction;
import com.Actions.qa.HomePageAction;
import com.Actions.qa.LoginPageAction;
import com.Actions.qa.ProfilePageAction;
import com.Utility.qa.BaseClass;
import com.Utility.qa.Utiliti;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TheCoder_92 extends BaseClass {
	
	HomePageAction  homePageAction  = new HomePageAction();
	
	ContactPageAction  contactPageAction  = new ContactPageAction();
	
	LoginPageAction  loginPageAction = new LoginPageAction();
	
	ProfilePageAction profilePageAction = new ProfilePageAction();

	@Given("^Lunch <\"([^\"]*)\"> Application$")
	public void lunch_Application(String URL) throws Throwable {
		lunchURL(URL);
		Utiliti.takeMyScreenshot(driver, "Home Page");
	}

	@When("^User click on contactus link$")
	public void user_click_on_contactus_link() throws Throwable {
		homePageAction.Userclickoncontactuslink();
	  
	}

	@Then("^Verify contact page display$")
	public void verify_contact_page_display() throws Throwable {
		contactPageAction.Verifycontactpagedisplay();
	}

	@When("^User enter woman in search field$")
	public void user_enter_woman_in_search_field() throws Throwable {
		homePageAction.Userenterwomaninsearchfield();
	   
	}
	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		homePageAction.Userclickonsearchbutton();
	}

	@Then("^Verify search result display$")
	public void verify_search_result_display() throws Throwable {
		homePageAction.Verifysearchresultdisplay();
	}

	@When("^Click Home Icon$")
	public void click_Home_Icon() throws Throwable {
		contactPageAction.ClickHomeIcon();
	   
	}

	@Then("^Verify clicking Home icon return to home page$")
	public void verify_clicking_Home_icon_return_to_home_page() throws Throwable {
		homePageAction.VerifyclickingHomeiconreturntohomepage();
	  
	}

	@When("^User click on SignIN link$")
	public void user_click_on_SignIN_link() throws Throwable {
	   homePageAction.UserclickonSignINlink();
		
	}

	@When("^Enter userName and password and click signin button$")
	public void enter_userName_and_password_and_click_signin_button() throws Throwable {
		loginPageAction.UserCredential(prop.getProperty("UserName1"), prop.getProperty("Password1"));
	}

	@Then("^Verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		profilePageAction.Verifyuserloginsuccessfully();
		
		Utiliti.takeMyScreenshot(driver, "Profile Page");
	   
	}

	
	
	
	
	
	
	
}
