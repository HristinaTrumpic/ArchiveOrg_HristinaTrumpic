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
import mainPage.navigationBars.imgIconsLeft.TextsIconElements;
import mainPage.upload.Upload;
import mainPage.userMenu.MyLibrary;

public class TestITBootcamp4 extends Waiters {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void ArchiveOrgTest() throws Exception{
		
		CenterSection CenterSection = new CenterSection(driver);
		
		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);
		
		SoftAssert asrt = new SoftAssert();
		
		CenterSection.clickSearchBox();
		asrt.assertTrue(CenterSection.ddMenuLoc().isDisplayed());
		System.out.println("1");
		CenterSection.inputSearchTerm("qa");
		CenterSection.clickCenterGoButton();
		Thread.sleep(3000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		asrt.assertTrue(URL.contains("?query=qa"));
		System.out.println("2");
		
		asrt.assertAll();
		driver.close();
	}
	}
		
