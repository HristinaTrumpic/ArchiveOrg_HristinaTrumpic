package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class DonatePage extends Waiters {

	static WebDriver driver;

	public DonatePage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar icons
	private static List<WebElement> donationAmounts() {
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// geting buttons from the list
	public List<WebElement> getDonationAmounts() {
		return donationAmounts();
	}

	// selecting specific button from the list
	public void clickDonationAmounts(int i) {
		getDonationAmounts().get(i).click();
	}
	
	// selecting custom button from the list and entering specific sum
	public void clickDonationAmounts(String amount) {
		getDonationAmounts().get(7).click();
		getDonationAmounts().get(7).sendKeys(amount);
		getDonationAmounts().get(7).sendKeys(Keys.ENTER);
	}

}
