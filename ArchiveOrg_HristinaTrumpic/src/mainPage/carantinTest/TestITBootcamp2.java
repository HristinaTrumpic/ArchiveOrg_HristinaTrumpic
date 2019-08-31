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

public class TestITBootcamp2 extends Waiters {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void ArchiveOrgTest() throws Exception{
		
		CenterSection CenterSection = new CenterSection(driver);
		CollectionPage CollectionPage = new CollectionPage(driver);
		
		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);
		
		SoftAssert asrt = new SoftAssert();
		
		// getting the difference between items displayed on the first element 
		//and number of items when items page is opened 
		
		// saving number in string format  in variable
		String numb1 = CenterSection.numberOfItems1();
		
		CenterSection.clickTopColection(0);
		
		// saving number in string format  in variable
		String numb2 = CollectionPage.numberOfItems2();
		
		// extracting , from 
		String newNumb1 = numb1.replace(",", "");
		String newNumb2 = numb2.replace(",", "");
		int result1 = Integer.valueOf(newNumb1);
		System.out.println(result1);
		int result2 = Integer.valueOf(newNumb2);
		System.out.println(result2);
		
		int diference = result1 - result2;
		System.out.println(diference);
		
		asrt.assertAll();
		driver.close();
		
		//this also works but it wouldn't for every case
		
//		String numb1 = CenterSection.numberOfItems1();
//		String s = numb1;
//		String[] w = s.split(",");
//		String newNumb1 = w[0] + w[1] + w[2];
//		System.out.println(newNumb1);	
//		
//		CenterSection.clickTopColection(0);
//		
//		String numb2 = CollectionPage.numberOfItems2();
//		String s2 = numb2;
//		String[] w2 = s2.split(",");
//		String newNumb2 = w2[0] + w2[1] + w2[2];
//		System.out.println(newNumb2);
//	
//		
//		
//		int result1 = Integer.valueOf(newNumb1);
//		System.out.println(result1);
//		int result2 = Integer.valueOf(newNumb2);
//		System.out.println(result2);
//		
//		
//		int diference = result1 - result2;
//		System.out.println(diference);
		
		//asrt.assertTrue(diference > 100);	
		
	}
	}
		
