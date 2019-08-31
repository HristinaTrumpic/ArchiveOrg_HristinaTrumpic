package mainPage.carantinTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import mainPage.baseClasses.ArchiveOrgURLs;
import mainPage.baseClasses.Waiters;
import mainPage.navigationBars.secondNavBarPages.PeoplePage;

public class TestITBootcamp8 extends Waiters {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nina\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void ArchiveOrgTest() throws Exception {


		PeoplePage PeoplePage = new PeoplePage(driver);
		
		File src = new File("C:\\Users\\Nina\\Desktop\\poi\\ZavrsniFajl.xlsx");
		
		driver.navigate().to(ArchiveOrgURLs.ARCHIVE_ORG_PEOPLE);
		
		SoftAssert asrt = new SoftAssert();

		// this is a list of all names and titles from PeoplePage
				
		List<WebElement> bios = PeoplePage.getBios();
		List<String> bs = new ArrayList<String>();
		
		for (int i = 0; i < bios.size(); i++) {
			WebElement bTag = bios.get(i).findElement(By.cssSelector("b"));
			WebElement iTag = bios.get(i).findElement(By.cssSelector("i"));
			bs.add(bTag.getText() + ' ' + iTag.getText());
		}
		//System.out.println(bs);
		
		//----------------------------
		
		// getting strings from Excel sheet with ApachePOI
		
		File file = new File("C:\\Users\\Nina\\Desktop\\poi\\ZavrsniFajl.xlsx");

		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		
		// ArrayList for values from spreadsheet
		ArrayList<String> names = new ArrayList<String>();

		// getting values from spreadsheet to putt in ArrayList
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			String name = sheet.getRow(i).getCell(0).getStringCellValue();

			// putting values from spread sheet into ArrayList
			names.add(name);
		}
		
		//asserting if two lists are the same
		asrt.assertEquals(bs, names);
		
		// inputing new list in spread sheet with ApachePOI
		for (int i = 0; i < bs.size(); i++) {
			sheet.getRow(0).createCell(i).setCellValue(bs.get(i));
		}

		FileOutputStream fout = new FileOutputStream(src);

		wb.write(fout);
		wb.close();		
		
		asrt.assertAll();
		driver.close();
	}
}
