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

import java.util.List;

import mainPage.baseClasses.ArchiveOrgURLs;
import mainPage.baseClasses.Waiters;
import mainPage.centralMainSection.CenterSection;
import mainPage.login.Login;
import mainPage.navigationBars.AdvanceSearchPage;
import mainPage.navigationBars.CollectionPage;
import mainPage.navigationBars.NavMenu;
import mainPage.navigationBars.SearchPage;
import mainPage.upload.Upload;
import mainPage.userMenu.MyLibrary;

public class TestITBootcamp6 extends Waiters {

	public static final String EMAIL = "foo@gmail.com";
	public static final String PASS = "bar";

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
	
		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);

		SoftAssert asrt = new SoftAssert();

		// no email - email field EMPTY
		login.clickSignIn();
		asrt.assertTrue(login.locSigninButton().isDisplayed());
		login.inputEmail(EMAIL);
		login.inputPass(PASS);
		// login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		Thread.sleep(1000);
		asrt.assertTrue(login.locErrorMessage().isDisplayed());
		System.out.println('1');

		asrt.assertAll();
		driver.close();
	}
}
