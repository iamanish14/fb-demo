package projectObjectManager;

import org.openqa.selenium.WebDriver;

import fb.com.baseclass.BaseClass;
import fb.com.locators.LoginPage;

public class PageObjectManager extends BaseClass {
	public PageObjectManager(WebDriver xdriver) {
		this.driver=xdriver;
	}
	private LoginPage loginpage;
	public LoginPage getLoginpage() {
		if(loginpage==null) {
			loginpage = new LoginPage(driver);
		}
		return loginpage;
	}
	

}
