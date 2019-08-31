package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class ContactPage extends Waiters {

	static WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// first map
	private static WebElement firstMap() {
		return driver.findElement(By.cssSelector("#maincontent a:nth-child(5) > img"));
	}
	
	// first map
	private static WebElement secondMap() {
		return driver.findElement(By.cssSelector("#maincontent a:nth-child(7) > img"));
	}
	

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------


	// click on first map
	public void clickFirstMap() {
		firstMap().click();
	}
	
	// click on second map
	public void clickSecondMap() {
		secondMap().click();
	}
	
}
