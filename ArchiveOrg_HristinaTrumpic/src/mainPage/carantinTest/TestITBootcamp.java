package mainPage.carantinTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import mainPage.baseClasses.ArchiveOrgURLs;
import mainPage.baseClasses.Waiters;
import mainPage.centralMainSection.CenterSection;
import mainPage.login.Login;
import mainPage.navigationBars.AdvanceSearchPage;
import mainPage.navigationBars.NavMenu;
import mainPage.navigationBars.SearchPage;
import mainPage.upload.Upload;
import mainPage.userMenu.MyLibrary;

public class TestITBootcamp extends Waiters {


	// CORRECT
	public static final String EMAIL = "mali.maslacak.91@gmail.com";
	public static final String PASS = "qwerty";

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void ArchiveOrgTest() throws Exception {

		CenterSection centSec = new CenterSection(driver);
		NavMenu NavMenu = new NavMenu(driver);
		Login login = new Login(driver);
		MyLibrary MyLibrary = new MyLibrary(driver);
		SearchPage SearchPage = new SearchPage(driver);
		AdvanceSearchPage AdvanceSearchPage = new AdvanceSearchPage(driver);

		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);

		SoftAssert asrt = new SoftAssert();

		// CORRECT
		login.clickSignIn();
		login.inputEmail(EMAIL);
		login.inputPass(PASS);
		// login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		login.stalenessOf(login.locSigninButton());
		// Asserting if there is user name instead Sign In text on SignIn button
		asrt.assertTrue((login.textSigninButton().toLowerCase()) != ("sign in"));
		System.out.println("login succsess");

		login.clickSignIn();
		asrt.assertTrue(NavMenu.presentUserMenu(1).isDisplayed());
		NavMenu.clickUserMenuItem(0);
		String currentURL = driver.getCurrentUrl();
		asrt.assertTrue(currentURL.contains(login.textSigninButton()));
		MyLibrary.clickUpload();
		String currentURL2 = driver.getCurrentUrl();
		asrt.assertEquals(currentURL2, ArchiveOrgURLs.ARCHIVE_ORG_UPLOAD);
		NavMenu.inputSearchBoxRight("qa");
		SearchPage.clickAdvanceSearch();
		AdvanceSearchPage.inputAnyField("IT");
		AdvanceSearchPage.inputTitle("QA");
		AdvanceSearchPage.yaer(1);
		AdvanceSearchPage.month(1);
		AdvanceSearchPage.day(1);
		AdvanceSearchPage.clickSearchButton1();
		SearchPage.sizeResultOnList();
		asrt.assertTrue(SearchPage.sizeResultOnList() > 25);

		asrt.assertAll();
		driver.close();
	}
}
