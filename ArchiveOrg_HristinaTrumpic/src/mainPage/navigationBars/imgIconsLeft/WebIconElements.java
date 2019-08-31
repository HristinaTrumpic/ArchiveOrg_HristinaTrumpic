package mainPage.navigationBars.imgIconsLeft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class WebIconElements extends Waiters {

	static WebDriver driver;

	public WebIconElements(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// web pages link
	private static WebElement webPagesLink() {
		return driver.findElement(By.cssSelector("div.wayback-txt a"));
	}

	// search bar
	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// clicking on "web pages" link
	public void clickWebPagesLink() {
		webPagesLink().click();
	}

	// Inputing tearm for searching
	public void inputSearchTerm(String searchTerm) {
		searchBar().sendKeys(searchTerm);
		searchBar().sendKeys(Keys.ENTER);
	}

}
