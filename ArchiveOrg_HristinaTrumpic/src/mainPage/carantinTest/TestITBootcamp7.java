package mainPage.carantinTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import mainPage.baseClasses.ArchiveOrgURLs;
import mainPage.baseClasses.Waiters;
import mainPage.centralMainSection.CenterSection;
import mainPage.login.Login;
import mainPage.login.SignUpPage;
import mainPage.navigationBars.AdvanceSearchPage;
import mainPage.navigationBars.CollectionPage;
import mainPage.navigationBars.NavMenu;
import mainPage.navigationBars.SearchPage;
import mainPage.upload.Upload;
import mainPage.userMenu.MyLibrary;

public class TestITBootcamp7 extends Waiters {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void ArchiveOrgTest() throws Exception {

		Login login = new Login(driver);
		SignUpPage SignUpPage = new SignUpPage(driver);

		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);
		String MainWindow = driver.getWindowHandle();
		SoftAssert asrt = new SoftAssert();

		
		login.clickSignIn();
		asrt.assertTrue(login.locForgetPass().isDisplayed());
		login.clickSignUp();
		SignUpPage.clickTerms();
		Thread.sleep(2000);

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
			}
		}

		String URL = driver.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(URL);
		asrt.assertTrue(URL.contains("terms"));

		asrt.assertAll();
		driver.close();
	}
}
