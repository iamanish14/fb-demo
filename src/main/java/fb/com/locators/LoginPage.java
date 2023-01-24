package fb.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img[alt='Facebook']")
	private WebElement Fb_logo;

	@FindBy(id = "email")
	private WebElement Username;
	
	@FindBy(id = "pass")
	private WebElement Password;
	
	@FindBy(name="login")
	private WebElement Login_button;
	
	@FindBy(id="u_0_0_9Z")
	private WebElement CreateAccount;

	public WebElement getFb_logo() {
		return Fb_logo;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin_button() {
		return Login_button;
	}

	public WebElement getCreateAccount() {
		return CreateAccount;
	}

}
