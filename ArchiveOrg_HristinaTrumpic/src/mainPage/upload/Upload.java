package mainPage.upload;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class Upload extends Waiters {

	static WebDriver driver;

	public Upload(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// upload button
	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("#createhelp > center:nth-child(4) > a"));
	}
	
	// question mark
	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector("#createhelp > h3 > small > a"));
	}
	
	// Live Music Archive uploader
	private static WebElement blueButton() {
		return driver.findElement(By.cssSelector("#createhelp > center:nth-child(7) > a"));
	}
	
	
	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// click on upload icon 
	public void clickUploadButton() {
		uploadButton().click();
	}
	
	// click on questionMark
	public void clickQuestionMark() {
		questionMark().click();
	}
	
	// blue button for Live Music Archive uploader
	public void clickBlueButton() {
		blueButton().click();
	}

}
