package mainPage.navigationBars;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class NavMenu extends Waiters {

	static WebDriver driver;

	public NavMenu(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar icons
	private static List<WebElement> navIcons() {
		return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left"));
	}

	// logo button
	private static WebElement logoIcon() {
		return driver.findElement(By.cssSelector("a.navbar-brand span.iconochive-logo"));
	}

	// sign in button in nav bar
	private static WebElement signinButton() {
		return driver
				.findElement(By.cssSelector("#navwrap2 li.dropdown-ia.pull-right.leftmost > a > span.hidden-xs-span"));
	}

	// drop down menu from sign in button in nav bar when logged in
	private static List<WebElement> userDropDown() {
		return driver.findElements(By.cssSelector("ul.dropdown-menu.mydrop li"));
	}

	// upload button in nav bar
	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("a.nav-upload"));
	}

	// Search bar right
	private static WebElement searchBoxRight() {
		return driver.findElement(By.name("search"));
	}

	// magnifier icon in right search bar
	private static WebElement magnifierIcon() {
		return driver.findElement(By.name("li#nav-search a:not(.search-options__advanced-search-link)"));
	}

	// advanced search link in right search bar drop down menu
	private static WebElement advancedSearchRight() {
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}

	// search options for search box on the right in drop down menu
	private static List<WebElement> searchOptionsRight() {
		return driver.findElements(By.cssSelector("div#navbar_search_options label"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// getting icons from the list
	public List<WebElement> getNavIcons() {
		return navIcons();
	}

	// click on web icon from nav bar
	public void clickWebIcon() {
		getUserDropDown().get(0).click();
	}

	// click on texts icon from nav bar
	public void clickTextsIcon() {
		getNavIcons().get(1).click();
	}

	// click on video icon from nav bar
	public void clickVideoIcon() {
		getNavIcons().get(2).click();
	}

	// click on audio icon from nav bar
	public void clickAudioIcon() {
		getNavIcons().get(3).click();
	}

	// click on software icon from nav bar
	public void clickSoftwareIcon() {
		getNavIcons().get(4).click();
	}

	// click on image icon from nav bar
	public void clickImageIcon() {
		getNavIcons().get(5).click();
	}

	// --------------------------------------------

	// click on logo icon from nav bar
	public void clickLogoIcon() {
		logoIcon().click();
	}

	// SIGN IN BUTTON AND ACTIONS ARE IN LOGIN FOLDER
	
	// click on upload icon from nav bar
		public void clickUpload() {
			uploadButton().click();
		}

	// --------------------------------------------

	// search box on the right
	public void inputSearchBoxRight(String searchTerm) {
		searchBoxRight().sendKeys(searchTerm);
		searchBoxRight().sendKeys(Keys.ENTER);
	}

	// clicking on magnifier glass to start search
	public void clickMagnifierIcon() {
		magnifierIcon().click();
	}

	// getting search options from the list
	public List<WebElement> getSearchOptions() {
		return searchOptionsRight();
	}

	// choosing search option for search on the right
	public void chooseSearchOption(int i) {
		searchOptionsRight().get(i).click();
	}

	// clicking on advenced search in right search bar drop down menu
	public void clickAdvancedSearch() {
		advancedSearchRight().click();
	}

	// getting items from the list
	public List<WebElement> getUserDropDown() {
		return userDropDown();
	}

	// click on item in user menu
	public void clickUserMenuItem(int i) {
		getUserDropDown().get(i).click();
	}

	// check presence of user menu
	public WebElement presentUserMenu(int i) {
		return getUserDropDown().get(i);
	}

}
