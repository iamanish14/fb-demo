package fb.com.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	public static void window_max() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {

		}
	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("element is not displayed" + e.getMessage());
		}
		return displayed;
	}

	public static void sendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void elementclick(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(20));
			wb.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
