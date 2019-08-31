package mainPage.navigationBars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class CollectionPage extends Waiters {

	static WebDriver driver;

	public CollectionPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// sort by buttons on top of the results
	private static List<WebElement> sortButtons() {
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a:not(.hidden)"));
	}
	
	// result list
	private static List<WebElement> resultList() {
		return driver.findElements(By.cssSelector("div#ikind--downloads div:not(.mobile-header).item-ia.hov"));
	}
	
	// media type more link
	private static WebElement resultNumber() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}
	
	// ------------
	
	// media type check boxes
	private static List<WebElement> mediaTypeChechBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-mediatype input[type=checkbox]"));
	}
	
	// media type more link
	private static WebElement mediaTypeMoreLink() {
		return driver.findElement(By.cssSelector("div.facet_mediatype.collapse > a"));
	}
	
	// ------------
	
	// year check boxes
	private static List<WebElement> yearChechBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-year input[type=checkbox]"));
	}
	
	// year more link
	private static WebElement yearMoreLink() {
		return driver.findElement(By.cssSelector("div.facet_year.collapse > a"));
	}

	// ------------
	
	// Topics & Subjects check boxes
	private static List<WebElement> TSChechBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-subject input[type=checkbox]"));
	}
	
	// Topics & Subjects more link
	private static WebElement TSCMoreLink() {
		return driver.findElement(By.cssSelector("div.facet_subject.collapse > a"));
	}

	// ------------
	
	// Collection check boxes
	private static List<WebElement> collectionChechBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-collection input[type=checkbox]"));
	}
	
	// Collection more link
	private static WebElement collectionMoreLink() {
		return driver.findElement(By.cssSelector("div.facet_collection.collapse > a"));
	}

	// ------------
	
	// Creator type check boxes
	private static List<WebElement> creatorChechBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-creator input[type=checkbox]"));
	}
	
	// Creator more link
	private static WebElement creatorMoreLink() {
		return driver.findElement(By.cssSelector("div.facet_creator.collapse > a"));
	}

	// ------------
	
	// Language check boxes
	private static List<WebElement> languageChechBoxes() {
		return driver.findElements(By.cssSelector("div.fatable.facet-languageSorter input[type=checkbox]"));
	}
	
	// Language more link
	private static WebElement languageMoreLink() {
		return driver.findElement(By.cssSelector("div.facet_languageSorter.collapse > a"));
	}

	// ------------
	
	// collection search box
	private static WebElement collectionSearchBox() {
		return driver.findElement(By.name("and[]"));
	}
	
	// play buttons 
	private static List<WebElement> playButtons() {
		return driver.findElements(By.cssSelector("div.col-xs-1.col-sm-2.welcome-right > a, div.col-xs-1.col-sm-2.welcome-right > span"));
	}
	

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// getting buttons from the list
		public List<WebElement> getSortButtons() {
			return sortButtons();
		}
		
		// click on buttons to sort the content
		public void clickWebIcon(int i) {
			getSortButtons().get(i).click();
		}
		
		// getting check boxes from the list
		public List<WebElement> getMediaTypeChechBoxes() {
			return mediaTypeChechBoxes();
		}
		
		// clicking on specific check box
		public void clickMediaTypeChechBox(int i) {
			getMediaTypeChechBoxes().get(i).click();
		}
		
		// get size of result list
		public void clickMediaTypeMoreLink() {
			mediaTypeMoreLink().click();
		}
		
		// getting check boxes from the list
		public List<WebElement> getYearChechBoxes() {
			return yearChechBoxes();
		}
		
		// clicking on specific check box
		public void clickYearChechBoxes(int i) {
			getYearChechBoxes().get(i).click();
		}
		
		// get size of result list
		public void clickYearMoreLink() {
			yearMoreLink().click();
		}
		
		// getting check boxes from the list
		public List<WebElement> getTSChechBoxes() {
			return TSChechBoxes();
		}
		
		// clicking on specific check box
		public void clickTSChechBoxes(int i) {
			getTSChechBoxes().get(i).click();
		}
		
		// get size of result list
		public void clickTSCMoreLink() {
			TSCMoreLink().click();
		}
		
		// getting check boxes from the list
		public List<WebElement> getCollectionChechBoxes() {
			return collectionChechBoxes();
		}
		
		// clicking on specific check box
		public void clickCollectionChechBoxes(int i) {
			getCollectionChechBoxes().get(i).click();
		}
		
		// get size of result list
		public void clickCollectionMoreLink() {
			collectionMoreLink().click();
		}
		
		// getting check boxes from the list
		public List<WebElement> getCreatorChechBoxes() {
			return creatorChechBoxes();
		}
		
		// clicking on specific check box
		public void clickCreatorChechBoxes(int i) {
			getCreatorChechBoxes().get(i).click();
		}
		
		// get size of result list
		public void clickCreatorMoreLink() {
			creatorMoreLink().click();
		}
		
		// getting check boxes from the list
		public List<WebElement> getLanguageChechBoxes() {
			return languageChechBoxes();
		}
		
		// clicking on specific check box
		public void clickLanguageChechBoxes(int i) {
			getLanguageChechBoxes().get(i).click();
		}
		
		// get size of result list
		public void clickLanguageMoreLink() {
			languageMoreLink().click();
		}
		
		// inputing term for searching in search box
		public void inputCollectionSearchBox(String searchTerm) {
			collectionSearchBox().sendKeys(searchTerm);
			collectionSearchBox().sendKeys(Keys.ENTER);
		}
		
		// getting check boxes from the list
		public List<WebElement> getPlayButtons() {
			return playButtons();
		}
		
		// clicking on specific check box
		public void clickPlayButtons(int i) {
			getPlayButtons().get(i).click();
		}
		
		// getting number of buttons displayed
		public void numbOfPlayButtons(int i) {
			getPlayButtons().size();
		}
		
		// getting number of buttons displayed
		public String resultNumber1() {
			return resultNumber().getText();
		}
		
		// getting number of buttons displayed
		public String numberOfItems2() {
			String s = resultNumber1();
			String[] w = s.split(" ");			
		return w[0];
		}
		
		public Integer convNumb2() {
			String number = numberOfItems2();
			int result = Integer.valueOf(number);
		return result;
		}
		
		
		
		

}
