package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class HelpPage extends Waiters {

	static WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// sign In link
	private static WebElement signInLink() {
		return driver.findElement(By.cssSelector("a.login"));
	}

	// search box
	private static WebElement searchBox() {
		return driver.findElement(By.name("query"));
	}

	// buttons
	private static List<WebElement> buttons() {
		return driver.findElements(By.cssSelector("ul.blocks-list li"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// click on web icon from nav bar
	public void clickSignInLink() {
		signInLink().click();
	}

	// click on web icon from nav bar
	public void inputSearchBox(String searchTerm) {
		searchBox().sendKeys(searchTerm);
		searchBox().sendKeys(Keys.ENTER);
	}

	// geting buttons from the list
	public List<WebElement> getButtons() {
		return buttons();
	}

	// selecting specific button from the list
	public void clicknewsElements(int i) {
		getButtons().get(i).click();
	}

}
