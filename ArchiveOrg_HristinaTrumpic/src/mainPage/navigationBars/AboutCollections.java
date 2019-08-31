package mainPage.navigationBars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class AboutCollections extends Waiters {

	static WebDriver driver;

	public AboutCollections(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// contributors
	private static List<WebElement> contributors() {
		return driver.findElements(By.cssSelector("div.about-box div.items_list.person"));
	}

	// 3 graficons
	private static List<WebElement> grafs() {
		return driver.findElements(By.cssSelector("div.col-sm-5 div.grafs.about-box"));
	}

	// top Regions table
	private static WebElement topRegions() {
		return driver.findElement(By.cssSelector("div.col-sm-5 > section"));
	}

	// related collections
	private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector(
				"#tabby-about > div > div.col-sm-5 > div:nth-child(7) > div:nth-child(2), #tabby-about > div > div.col-sm-5 > div:nth-child(7) > div:nth-child(3)"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// getting contributors from the list
	public List<WebElement> getContributors() {
		return contributors();
	}

	// click on contributor
	public void clickContributors(int i) {
		getContributors().get(i).click();
	}

	// get number of contributors listed
	public void numbOfContributors(int i) {
		getContributors().size();
	}

	// ---------------

	// getting grafs from the list
	public List<WebElement> getGrafs() {
		return grafs();
	}

	// get number of grafs listed
	public void numbOfGrafs(int i) {
		getGrafs().size();
	}
	
	// ---------------
	//for top table ????
	// ---------------

	// getting related Collections from the list
	public List<WebElement> getRelatedCollections() {
		return relatedCollections();
	}

	// click on contributor
	public void clickRelatedCollections(int i) {
		getRelatedCollections().get(i).click();
	}

	// get number of contributors listed
	public void numbOfRelatedCollections(int i) {
		getRelatedCollections().size();
	}

}
