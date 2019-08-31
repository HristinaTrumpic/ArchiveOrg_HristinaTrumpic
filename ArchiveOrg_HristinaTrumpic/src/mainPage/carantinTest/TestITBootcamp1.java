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

public class TestITBootcamp1 extends Waiters {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void ArchiveOrgTest() throws Exception {

		CenterSection CenterSection = new CenterSection(driver);

		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_MAIN);

		SoftAssert asrt = new SoftAssert();

		// checking if there is more then 20 elements of topcollection
		Thread.sleep(4000);
		CenterSection.sizeTopColection();
		asrt.assertTrue(CenterSection.sizeTopColection() > 20);
		System.out.println("1");

		// Cheking if there is string ITEMS in every element
		System.out.println(CenterSection.stringItems());
		int brojac = 0;
		List<String> items = CenterSection.stringItems();
		for (int i = 0; i < items.size(); i++) {
			boolean hasItemsText = items.get(i).contains("ITEMS");
			if (hasItemsText) {
				brojac++;
			}
		}
		asrt.assertEquals(brojac, items.size());
		System.out.println("2");

	}
}
