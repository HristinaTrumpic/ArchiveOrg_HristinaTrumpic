package mainPage.navigationBars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class SecondNavMenu extends Waiters {

	static WebDriver driver;

	public SecondNavMenu(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar icons
	private static List<WebElement> navIcons() {
		return driver.findElements(By.cssSelector("ul#nav-abouts li"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// nav bar icons
	public List<WebElement> getNavIcons() {
		return navIcons();
	}

	// click on web icon from nav bar
	public void clickWebIcon(int i) {
		getNavIcons().get(i).click();
	}

}
