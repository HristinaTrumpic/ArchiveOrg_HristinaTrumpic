package mainPage.navigationBars.secondNavBarPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class ProjectsPage extends Waiters {

	static WebDriver driver;

	public ProjectsPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// nav bar icons
	private static List<WebElement> projects() {
		return driver.findElements(By.cssSelector("main#maincontent div.col-sm-9"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// geting projects from the list
	public List<WebElement> getProjects() {
		return projects();
	}

//	// checking number of projects on the page
//	public void clickProject(int i) {
//		getProjects().get(i).click();
//	}

	// checking number of projects on the page
	public void numbOfProjects() {
		getProjects().size();
	}
	
}
