package mainPage.userMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class MyLibrary extends Waiters {

	static WebDriver driver;

	public MyLibrary(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------
	
	// upload locator
		private static WebElement upload() {
			return driver.findElement(By.cssSelector("a > span.iconochive-email"));
		}
		
		
	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	
	// click on upload
	public void clickUpload() {
		upload().click();
	}
	
}
