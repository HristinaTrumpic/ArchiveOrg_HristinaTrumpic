package mainPage.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class SignUpPage extends Waiters {

	static WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// sign in button in nav bar
	private static WebElement terms() {
		return driver.findElement(By.cssSelector("form > fieldset:nth-child(8) > div > a"));
	}

	
	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// click on sign up
	public void clickTerms() {
		terms().click();
	}

	
}
