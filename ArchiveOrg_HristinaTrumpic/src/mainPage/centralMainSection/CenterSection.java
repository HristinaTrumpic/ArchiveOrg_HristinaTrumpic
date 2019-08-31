package mainPage.centralMainSection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class CenterSection extends Waiters {

	static WebDriver driver;

	public CenterSection(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar icons
	private static List<WebElement> centerIcons() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}

	// center search bar
	private static WebElement centerSearchBar() {
		return driver.findElement(By.name("search"));
	}
	// center drop down menu from search
		private static WebElement ddMenu() {
			return driver.findElement(By.cssSelector("div#search_options"));
		}
	// center drop down menu from search
		private static List<WebElement> ddMenuItems() {
			return driver.findElements(By.cssSelector("div#search_options label"));
		}

	// center go button
	private static WebElement centerGoButton() {
		return driver.findElement(By.cssSelector("#searchform > div > button"));
	}

	// center Advanced Search link
	private static WebElement centerAdvancedLink() {
		return driver.findElement(By.cssSelector("div#search_options a"));
	}

	// center announsments column
	private static List<WebElement> announsments() {
		return driver.findElements(By.cssSelector("div.wplinks"));
	}

	// center Advanced Search link
	private static WebElement seeMore() {
		return driver.findElement(By.cssSelector("div.col-sm-3.hero-right a.stealth"));
	}

	// Top colection elements
	private static List<WebElement> topColection() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// getting Center sections icons
	public List<WebElement> getCenterIcons() {
		return centerIcons();
	}

	// click on web icon from nav bar
	public void clickCenterIcons(int i) {
		getCenterIcons().get(i).click();
	}

	// click on center search
	public void clickSearchBox() {
		centerSearchBar().click();
	}
	
	// inputing search ter mfor center search
	public void inputSearchTerm(String searchTerm) {
		centerSearchBar().sendKeys(searchTerm);
	}
	
	// getting Center sections icons
	public List<WebElement> getDDMenuItems() {
		return ddMenuItems();
	}
	
	// locator for dd menu
		public WebElement ddMenuLoc() {
		return ddMenu();
		}

	// click on web icon from nav bar
	public void clickgetDDMenuItems(int i) {
		getDDMenuItems().get(i).click();
	}

	// click on center go button
	public void clickCenterGoButton() {
		centerGoButton().click();
	}

	// click on center go button
	public void clickAdvancedLink() {
		centerAdvancedLink().click();
	}

	// getting Center sections icons
	public List<WebElement> getAnnounsments() {
		return announsments();
	}

	// click on center go button
	public void clickAnnounsments(int i) {
		announsments().get(i).click();
	}

	// click on center go button
	public void clickSeeMore() {
		seeMore().click();
	}

	// getting Center sections icons
	public List<WebElement> getTopColection() {
		return topColection();
	}

	// click on web icon from nav bar
	public void clickTopColection(int i) {
		getTopColection().get(i).click();
	}

	// cheking size of top collection list
	public int sizeTopColection() {
		return getTopColection().size();
	}

	// getting items string 
	public List<String> stringItems() {
		List<WebElement> elements = getTopColection();
		List<String> li = new ArrayList<String>();

		for (int i = 0; i < topColection().size(); i++) {
			WebElement text = elements.get(i);
			li.add(text.getText());
		}
		return li;
	}

	// getting name and function of people from bios
		public String numbOfItemsInFirstTopElement() {
			WebElement text = getTopColection().get(0).findElement(By.cssSelector("div.num-items.topinblock"));
				return text.getText();
		}
		
		
		public String numberOfItems1() {
			String s = numbOfItemsInFirstTopElement();
			String[] w = s.split("[\\n]");
		return w[0];
		}
		
		public Integer convNumb1() {
			String number = numberOfItems1();
			int result = Integer.valueOf(number);
		return result;
		}
		

}
