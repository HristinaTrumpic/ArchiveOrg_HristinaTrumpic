package mainPage.tests;

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
import mainPage.baseClasses.ArchiveOrgURLs;
import mainPage.baseClasses.Waiters;
import mainPage.centralMainSection.CenterSection;
import mainPage.login.Login;
import mainPage.navigationBars.NavMenu;
import mainPage.upload.Upload;




public class LoginVerifying extends Waiters {

//	public static final String SEARCH_TERM = "metacafe";
	
	// CORRECT
	public static final String EMAIL = "mali.maslacak.91@gmail.com";
	public static final String PASS = "qwerty";
	
	// no email - email field EMPTY
	public static final String EMAIL1 = "";
	public static final String PASS1 = "qwerty";

	// no password - password field EMPTY
	public static final String EMAIL2 = "mali.maslacak.91@gmail.com";
	public static final String PASS2 = "";

	// wrong email, OK password
	public static final String EMAIL3 = "dfg@asfasdf.asd";
	public static final String PASS3 = "qwerty";

	// OK email, wrong password
	public static final String EMAIL4 = "mali.maslacak.91@gmail.com";
	public static final String PASS4 = "sdfgsd";

	// wrong email format, OK password
	public static final String EMAIL5 = "mali.ma";
	public static final String PASS5 = "qwerty";
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void ArchiveOrgTest() throws Exception{
		
		CenterSection centSec = new CenterSection(driver);
		NavMenu navMenuObj = new NavMenu(driver);
		Login login = new Login(driver);
		
		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);
		
		SoftAssert asrt = new SoftAssert();
		
		// no email - email field EMPTY
		login.clickSignIn();
		login.inputEmail(EMAIL1);
		login.inputPass(PASS1);
		//login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		asrt.assertEquals(login.textSigninButton().toLowerCase(), "sign in");
		System.out.println('1');
		
		// no password - password field EMPTY
		login.clickSignIn();
		login.inputEmail(EMAIL2);
		login.inputPass(PASS2);
		//login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		asrt.assertEquals(login.textSigninButton().toLowerCase(), "sign in");
		System.out.println('2');
		
		// wrong email, OK password
		login.clickSignIn();
		login.inputEmail(EMAIL3);
		login.inputPass(PASS3);
		//login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		asrt.assertEquals(login.textSigninButton().toLowerCase(), "sign in");
		System.out.println('3');
		
		
		// OK email, wrong password
		login.clickSignIn();
		login.inputEmail(EMAIL4);
		login.inputPass(PASS4);
		//login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		asrt.assertEquals(login.textSigninButton().toLowerCase(), "sign in");
		System.out.println('4');
		
		
		// wrong email format, OK password
		login.clickSignIn();
		login.inputEmail(EMAIL5);
		login.inputPass(PASS5);
		//login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		Assert.assertEquals(login.textSigninButton().toLowerCase(), "sign in");
		
		
		
		// CORRECT
		login.clickSignIn();
		login.inputEmail(EMAIL);
		login.inputPass(PASS);
		//login.visibilityOfElement(login.locLoginButton());
		Thread.sleep(2000);
		login.clickLoginButton();
		login.stalenessOf(login.locSigninButton());
		asrt.assertTrue((login.textSigninButton().toLowerCase()) != ("sign in"));
		asrt.assertAll();
		System.out.println('5');
		
		driver.close();
	}
	}
		
