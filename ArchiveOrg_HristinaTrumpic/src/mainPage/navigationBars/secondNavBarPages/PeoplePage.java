package mainPage.navigationBars.secondNavBarPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class PeoplePage extends Waiters {

	static WebDriver driver;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// bios of people
	private static List<WebElement> bios() {
		return driver.findElements(By.cssSelector("#maincontent > div > div > div.col-md-9 > div > div div:not(.bio)"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// geting bios
	public List<WebElement> getBios() {
		return bios();
	}

	// checking number of bios
	public int numbOfBios() {
		return getBios().size();
	}

	// getting name and function of people from bios
	public List<String> getInfoBios() {
		List<WebElement> bios = getBios();
		List<String> bs = new ArrayList<String>();

		for (int i = 0; i < bios.size(); i++) {
			WebElement bTag = bios.get(i).findElement(By.cssSelector("b"));
			WebElement iTag = bios.get(i).findElement(By.cssSelector("i"));
			bs.add(bTag.getText() + ' ' + iTag.getText());
		}
		return bs;

	}

	// method for assessing two lists sizes assess
	public int assess(List<String> list1, List<String> list2) {
		int listResult = list1.size() - list2.size();
		return listResult;
	}

}
