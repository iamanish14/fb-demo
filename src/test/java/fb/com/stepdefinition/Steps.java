package fb.com.stepdefinition;

import org.openqa.selenium.WebElement;

import fb.com.baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import projectObjectManager.PageObjectManager;

public class Steps extends BaseClass {
	PageObjectManager obj = new PageObjectManager(driver);

	@Given("user lauch the {string} browser")
	public void user_lauch_the_browser(String string) {
		browserlaunch(string);
	}

	@Given("user navigate to te url {string}")
	public void user_navigate_to_te_url(String string) {
		geturl(string);
		
	}

	@Given("user verify the login page")
	public void user_verify_the_login_page() {
		isDisplayed(obj.getLoginpage().getFb_logo());

	}

	@Given("user enter the valid user name {string}")
	public void user_enter_the_valid_user_name(String string) {
		sendkeys(obj.getLoginpage().getUsername(), string);

	}

	@Given("user enter the valid password {string}")
	public void user_enter_the_valid_password(String string) {
		sendkeys(obj.getLoginpage().getPassword(), string);

	}

	//@Then("user verify login successfully")
	//public void user_verify_login_successfully() {
		//elementclick(obj.getLoginpage().getLogin_button());
		
		
		

	}

	



