package mainPage.navigationBars.imgIconsLeft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class SoftwareIconElements extends Waiters {

	static WebDriver driver;

	public SoftwareIconElements(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// TV news
	private static WebElement firstRoundElement() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div a"));
	}

	// Understanding 9/11
	private static WebElement secondRoundElement() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div a"));
	}

	// --------------------------------------------

	// Featured column's elements
	private static List<WebElement> featuredCol() {
		return driver.findElements(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-7.col-sm-push-4 > div a"));
	}

	// --------------------------------------------

	// Top column's elements
	private static List<WebElement> topCol() {
		return driver.findElements(By.cssSelector(
				"##nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-7.col-sm-push-2 > div a"));
	}

	// --------------------------------------------

	// last column's elements
	private static List<WebElement> lastCol() {
		return driver.findElements(
				By.cssSelector("#nav-tophat > div.row.toprow.fivecolumns.software > div:nth-child(5) > div a"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// clicking on books To Borrow Link
	public void clickFirstRoundElement() {
		firstRoundElement().click();
	}

	// clicking on open Library Link
	public void clickSecondRoundElement() {
		secondRoundElement().click();
	}

	// --------------------------------------------

	// getting featured col elements
	public List<WebElement> getFeaturedCol() {
		return featuredCol();
	}

	// click on first line in featured col
	public void clickElementsFeaturedCol(int x) {
		getFeaturedCol().get(x).click();
	}

	// --------------------------------------------

	// getting top col elements
	public List<WebElement> getTopCol() {
		return topCol();
	}

	// click on first line in top col
	public void clickElementsTopCol(int x) {
		getTopCol().get(x).click();
	}

	// --------------------------------------------

	// getting last col elements
	public List<WebElement> getLastCol() {
		return lastCol();
	}

	// click on first line in last col
	public void clickElementsLastCol(int x) {
		getLastCol().get(x).click();
	}

}
