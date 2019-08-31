package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class AboutPage extends Waiters {

	static WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar icons
	private static List<WebElement> newsElements() {
		return driver.findElements(By.cssSelector("#maincontent > div > div > div.col-md-3.hidden-xs.hidden-sm > div.box a"));
	}
		

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// nav bar icons
	public List<WebElement> getNewsElements() {
		return newsElements();
	}

	// click on web icon from nav bar
	public void clickNewsElements(int i) {
		getNewsElements().get(i).click();
	}
	
	// click on web icon from nav bar
	public void sizeNewsElements() {
		getNewsElements().size();
	}
	
	// click on more option in news
	public void clickOnMoreLink() {
		getNewsElements().get(0).click();
	}
	
	
	
}
