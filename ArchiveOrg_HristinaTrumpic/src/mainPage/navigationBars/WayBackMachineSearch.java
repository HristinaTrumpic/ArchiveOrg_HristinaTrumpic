package mainPage.navigationBars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class WayBackMachineSearch extends Waiters {

	static WebDriver driver;

	public WayBackMachineSearch(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// search bar
	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}

	// search results from Way Back Machine
	private static List<WebElement> searchRes() {
		return driver.findElements(By.cssSelector("ul.result-list li"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// Inputing tearm for searching
	public void inputSearchTerm(String searchTerm) {
		searchBar().sendKeys(searchTerm);
		searchBar().sendKeys(Keys.ENTER);
	}

	// getting search results from Way Back Machine
	public List<WebElement> getSearchRes() {
		return searchRes();
	}

	// click on search result from Way Back Machine
	public void clickSearchRes(int i) {
		getSearchRes().get(i).click();
	}

}
