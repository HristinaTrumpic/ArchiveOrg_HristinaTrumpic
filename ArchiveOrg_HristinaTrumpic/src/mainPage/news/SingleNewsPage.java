package mainPage.news;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class SingleNewsPage extends Waiters {

	static WebDriver driver;

	public SingleNewsPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// news elements
	private static WebElement edit() {
		return driver.findElement(By.cssSelector("#maincontent > div > div > h1 > a"));
	}

	// news elements
	private static WebElement replay() {
		return driver.findElement(By.cssSelector("#maincontent > div > div > h1 > div > a:nth-child(1)"));
	}

	// news elements
	private static WebElement goBack() {
		return driver.findElement(By.cssSelector("#maincontent > div > div > h1 > div > a:nth-child(2)"));
	}

	// news elements
	private static WebElement news() {
		return driver.findElement(By
				.cssSelector("#maincontent > div > div > h2 > table > tbody > tr:nth-child(2) > td:nth-child(2) > a"));
	}

	// news elements
	private static WebElement moreText() {
		return driver.findElement(By.cssSelector("div.box.well.well-sm > a"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// click on web icon from nav bar
	public void clickEdit() {
		edit().click();
	}

	// click on web icon from nav bar
	public void clickReplay() {
		replay().click();
	}

	// click on web icon from nav bar
	public void clickGoBack() {
		goBack().click();
	}

	// click on web icon from nav bar
	public void clickNews() {
		news().click();
	}

	// click on web icon from nav bar
	public void clickMoreText() {
		moreText().click();
	}

}
