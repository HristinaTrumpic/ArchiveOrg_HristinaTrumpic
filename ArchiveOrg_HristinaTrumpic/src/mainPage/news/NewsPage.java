package mainPage.news;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class NewsPage extends Waiters {

	static WebDriver driver;

	public NewsPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// news elements
	private static List<WebElement> newsElements() {
		return driver.findElements(By.cssSelector("#maincontent div > table tr:not(.backColor1)"));
	}
	
	// news elements
		private static WebElement emailIcon() {
			return driver.findElement(By.cssSelector("a > span.iconochive-email"));
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
	public void clickEailIcon() {
		emailIcon().click();
	}
	
}
