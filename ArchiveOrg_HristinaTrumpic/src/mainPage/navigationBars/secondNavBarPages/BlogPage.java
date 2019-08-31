package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mainPage.baseClasses.Waiters;

public class BlogPage extends Waiters {

	static WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar links
	private static List<WebElement> navLinks() {
		return driver.findElements(By.cssSelector("ul#menu-menu li"));
	}

	// facebook an twitter icons
	private static List<WebElement> fbTwIcons() {
		return driver.findElements(By.cssSelector("li#archive_sharing_widget-4 a"));
	}

	// search field
	private static WebElement searchBox() {
		return driver.findElement(By.name("s"));
	}

	// search button
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("input#searchsubmit"));
	}

	// elements generated after search
	private static List<WebElement> searchElements() {
		return driver.findElements(By.cssSelector("div#content div.post.type-post.status-publish.format-standard"));
	}

	// archive drop down menu
	private static WebElement archiveMenu() {
		return driver.findElement(By.name("archive-dropdown"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// nav bar icons
	public List<WebElement> getNavLinks() {
		return navLinks();
	}

	// click on nav bar links
	public void clickWebIcon(int i) {
		getNavLinks().get(i).click();
	}

	// facebook an twitter icons
	public List<WebElement> getFbTwIcons() {
		return fbTwIcons();
	}

	// click on facebook icon
	public void clickFBIcon() {
		getFbTwIcons().get(0).click();
	}

	// click on twitter icon
	public void clickTWIcons() {
		getFbTwIcons().get(1).click();
	}

	// click on search field and input searchTerm for searching
	public void inputSearchTerm(String searchTerm) {
		searchBox().sendKeys(searchTerm);
	}

	// click on search button
	public void clickSearchButton() {
		searchButton().click();
	}

	// selecting from archiveMenu
	public void archiveMenu(int i) {
		Select ddMenu = new Select(archiveMenu());
		ddMenu.selectByIndex(i);
	}

}
