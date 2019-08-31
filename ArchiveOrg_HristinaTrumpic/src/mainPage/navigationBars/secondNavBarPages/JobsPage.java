package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class JobsPage extends Waiters {

	static WebDriver driver;

	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// search box
	private static WebElement searchBox() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElement(By.name("q"));
	}

	// search button
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}

	// link to advanced search
	private static WebElement linkAdvancedSearch() {
		return driver.findElement(By.cssSelector("a#link_show_advanced_search"));
	}

	// search results of job search
	private static List<WebElement> searchResults() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElements(By.cssSelector("table#jobs_table tr a"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// click on search box
	public void clickSearchBox(String searchTerm) {
		searchBox().sendKeys(searchTerm);
		searchBox().sendKeys(Keys.ENTER);
	}

	// click on search box
	public void clickSearchButton() {
		searchButton().click();
	}

	// click on search box
	public void clickLinkAdvancedSearch() {
		linkAdvancedSearch().click();
	}

	// click on web icon from nav bar
	public List<WebElement> getSearchResults() {
		return searchResults();
	}

	// click on web icon from nav bar
	public void clickSearchResults(int i) {
		getSearchResults().get(i).click();
	}
	
	// click on web icon from nav bar
	public void numbOfSearchResults() {
		getSearchResults().size();
	}

}
