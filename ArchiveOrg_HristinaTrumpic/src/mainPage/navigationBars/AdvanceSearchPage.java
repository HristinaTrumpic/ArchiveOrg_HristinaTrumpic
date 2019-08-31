package mainPage.navigationBars;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mainPage.baseClasses.Waiters;

public class AdvanceSearchPage extends Waiters {

	static WebDriver driver;

	public AdvanceSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// any field drop down menu
	private static WebElement anyFieldMenu() {
		return driver.findElement(By.name("any_type"));
	}

	// any field field
	private static WebElement anyFieldField() {
		return driver.findElement(By.cssSelector("#searchForm > div:nth-child(1) > div.col-sm-7 > input"));
	}

	// title drop down menu
	private static WebElement titleMenu() {
		return driver.findElement(By.name("title_type"));
	}

	// title field
	private static WebElement titleField() {
		return driver.findElement(By.name("title_query"));
	}

	// creator drop down menu
	private static WebElement creatorMenu() {
		return driver.findElement(By.name("creator_type"));
	}

	// creator field
	private static WebElement creatorField() {
		return driver.findElement(By.name("creator_query"));
	}

	// description drop down menu
	private static WebElement descriptionMenu() {
		return driver.findElement(By.name("description_type"));
	}

	// description field
	private static WebElement descriptionField() {
		return driver.findElement(By.name("description_query"));
	}

	// collection drop down menu
	private static WebElement collectionMenu() {
		return driver.findElement(By.name("collection_type"));
	}

	// collection field
	private static WebElement collectionField() {
		return driver.findElement(By.name("collection_query"));
	}

	// mediatype drop down menu
	private static WebElement mediatypeMenu() {
		return driver.findElement(By.name("mediatype_type"));
	}

	// mediatype field
	private static WebElement mediatypeMenu2() {
		return driver.findElement(By.name("mediatype_query"));
	}

	// --------------------------------------------

	// custom1 drop down menu
	private static WebElement custom1Menu() {
		return driver.findElement(By.name("optional_field1_type"));
	}

	// custom2 drop down menu
	private static WebElement custom2Menu() {
		return driver.findElement(By.name("optional_field2_type"));
	}

	// custom3 drop down menu
	private static WebElement custom3Menu() {
		return driver.findElement(By.name("optional_field3_type"));
	}
	// ------------

	// custom1 field left
	private static WebElement custom1FieldLeft() {
		return driver.findElement(By.name("optional_field1"));
	}

	// custom2 field left
	private static WebElement custom2FieldLeft() {
		return driver.findElement(By.name("optional_field2"));
	}

	// custom3 field left
	private static WebElement custom3FieldLeft() {
		return driver.findElement(By.name("optional_field3"));
	}

	// ------------
	// custom1 field right
	private static WebElement custom1FieldRight() {
		return driver.findElement(By.name("optional_field1_q"));
	}

	// custom2 field right
	private static WebElement custom2FieldRight() {
		return driver.findElement(By.name("optional_field2_q"));
	}

	// custom3 field right
	private static WebElement custom3FieldRight() {
		return driver.findElement(By.name("optional_field3_q"));
	}

	// --------------------------------------------

	// year drop down
	private static WebElement year() {
		return driver.findElement(By.name("date_year"));
	}

	// month drop down
	private static WebElement month() {
		return driver.findElement(By.name("date_year"));
	}

	// day drop down
	private static WebElement day() {
		return driver.findElement(By.name("date_year"));
	}

	// --------------------------------------------

	// year drop down
	private static WebElement yearFrom() {
		return driver.findElement(By.name("date_from_year"));
	}

	// month drop down
	private static WebElement monthFrom() {
		return driver.findElement(By.name("date_from_month"));
	}

	// day drop down
	private static WebElement dayFrom() {
		return driver.findElement(By.name("date_from_day"));
	}

	// --------------------------------------------

	// year drop down
	private static WebElement yearTo() {
		return driver.findElement(By.name("date_to_year"));
	}

	// month drop down
	private static WebElement monthTo() {
		return driver.findElement(By.name("date_to_month"));
	}

	// day drop down
	private static WebElement dayTo() {
		return driver.findElement(By.name("date_to_day"));
	}

	// --------------------------------------------

	// search button #1
	private static WebElement searchButton1() {
		return driver.findElement(By.cssSelector("#searchForm > center > input.btn.btn-primary"));
	}

	// --------------------------------------------
	// --------------------------------------------

	// search query
	private static WebElement searchQuery() {
		return driver.findElement(By.name("q"));
	}

	// search query
	private static WebElement fieldsToReturn() {
		return driver.findElement(By.name("fl[]"));
	}

	// ----------------

	// sort results by 1st select menu
	private static WebElement sortRes1() {
		return driver.findElement(By.name("#rawform > div:nth-child(5) > select:nth-child(2)"));
	}

	// sort results by 2nd select menu
	private static WebElement sortRes2() {
		return driver.findElement(By.name("#rawform > div:nth-child(5) > select:nth-child(4)"));
	}

	// sort results by 3th select menu
	private static WebElement sortRes3() {
		return driver.findElement(By.name("#rawform > div:nth-child(5) > select:nth-child(6)"));
	}

	// ----------------

	// number of results field
	private static WebElement numbOfResField() {
		return driver.findElement(By.name("rows"));
	}

	// number of pages field
	private static WebElement numbOfPagesField() {
		return driver.findElement(By.name("page"));
	}

	// ----------------

	// JSON format check
	private static WebElement jsonFormat() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
	}

	// XML format check
	private static WebElement xmlFormat() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=radio]"));
	}

	// XML format check box
	private static WebElement xmlFormatBox() {
		return driver.findElement(By.name("save"));
	}

	// HTML table
	private static WebElement htmlTable() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=radio]"));
	}

	// CSV format
	private static WebElement csvFormat() {
		return driver.findElement(By.cssSelector("#csvpick"));
	}

	// CSV format link
	private static WebElement csvFormatLink() {
		return driver.findElement(
				By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr:nth-child(4) > td:nth-child(1) > a"));
	}

	// RSS format
	private static WebElement rssFormat() {
		return driver.findElement(By.cssSelector(
				"#rawform > div:nth-child(5) > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]"));
	}

	// ----------------

	// search button #2
	private static WebElement searchButton2() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > input.btn.btn-primary"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// selecting from any field menu
	public void anyField(int i) {
		Select ddMenu = new Select(anyFieldMenu());
		ddMenu.selectByIndex(i);
	}

	// input in any field field
	public void inputAnyField(String anyField) {
		anyFieldField().sendKeys(anyField);
		anyFieldField().sendKeys(Keys.TAB);
		anyFieldField().sendKeys(Keys.TAB);
	}

	// selecting from title menu
	public void titleMenu(int i) {
		Select ddMenu = new Select(titleMenu());
		ddMenu.selectByIndex(i);
	}

	// input in title field
	public void inputTitle(String title) {
		titleField().sendKeys(title);
		titleField().sendKeys(Keys.TAB);
		titleField().sendKeys(Keys.TAB);
	}

	// selecting from creator menu
	public void creatorMenu(int i) {
		Select ddMenu = new Select(creatorMenu());
		ddMenu.selectByIndex(i);
	}

	// input in creator field
	public void inputCreator(String creator) {
		creatorField().sendKeys(creator);
		creatorField().sendKeys(Keys.TAB);
		creatorField().sendKeys(Keys.TAB);
	}

	// selecting from description menu
	public void descriptionMenu(int i) {
		Select ddMenu = new Select(descriptionMenu());
		ddMenu.selectByIndex(i);
	}

	// input in description field
	public void inputDescription(String description) {
		descriptionField().sendKeys(description);
		descriptionField().sendKeys(Keys.TAB);
		descriptionField().sendKeys(Keys.TAB);
	}

	// selecting from collection menu
	public void collectionMenu(int i) {
		Select ddMenu = new Select(collectionMenu());
		ddMenu.selectByIndex(i);
	}

	// input in collection field
	public void inputCollection(String collection) {
		collectionField().sendKeys(collection);
		collectionField().sendKeys(Keys.TAB);
		collectionField().sendKeys(Keys.TAB);
	}

	// selecting from mediatype menu
	public void mediatypeMenu(int i) {
		Select ddMenu = new Select(mediatypeMenu());
		ddMenu.selectByIndex(i);
	}

	// selecting from mediatype menu 2
	public void mediatypeMenu2(int i) {
		Select ddMenu = new Select(mediatypeMenu2());
		ddMenu.selectByIndex(i);
	}

	// ----------------

	// input in custom1 field
	public void inputCustom1Left(String custom1Left) {
		custom1FieldLeft().sendKeys(custom1Left);
		custom1FieldLeft().sendKeys(Keys.TAB);
		custom1FieldLeft().sendKeys(Keys.TAB);
	}

	// selecting from custom1 menu
	public void custom1Menu(int i) {
		Select ddMenu = new Select(custom1Menu());
		ddMenu.selectByIndex(i);
	}

	// input in custom1 field
	public void inputCustom1Right(String custom1Right) {
		custom1FieldRight().sendKeys(custom1Right);
		custom1FieldRight().sendKeys(Keys.TAB);
		custom1FieldRight().sendKeys(Keys.TAB);
	}

	// ----------------

	// input in custom2 field
	public void inputCustom2Left(String custom2Left) {
		custom2FieldLeft().sendKeys(custom2Left);
		custom2FieldLeft().sendKeys(Keys.TAB);
		custom2FieldLeft().sendKeys(Keys.TAB);
	}

	// selecting from custom2 menu
	public void custom2Menu(int i) {
		Select ddMenu = new Select(custom2Menu());
		ddMenu.selectByIndex(i);
	}

	// input in custom2 field
	public void inputCustom2Right(String custom2Right) {
		custom2FieldRight().sendKeys(custom2Right);
		custom2FieldRight().sendKeys(Keys.TAB);
		custom2FieldRight().sendKeys(Keys.TAB);
	}

	// ----------------

	// input in custom3 field
	public void inputCustom3Left(String custom3Left) {
		custom3FieldLeft().sendKeys(custom3Left);
		custom3FieldLeft().sendKeys(Keys.TAB);
		custom3FieldLeft().sendKeys(Keys.TAB);
	}

	// selecting from custom3 menu
	public void custom3Menu(int i) {
		Select ddMenu = new Select(custom3Menu());
		ddMenu.selectByIndex(i);
	}

	// input in custom3 field Right
	public void inputCustom3Right(String custom3Right) {
		custom3FieldRight().sendKeys(custom3Right);
		custom3FieldRight().sendKeys(Keys.TAB);
		custom3FieldRight().sendKeys(Keys.TAB);
	}

	// ----------------

	// selecting from year menu
	public void yaer(int i) {
		Select ddMenu = new Select(year());
		ddMenu.selectByIndex(i);
	}

	// selecting from month menu
	public void month(int i) {
		Select ddMenu = new Select(month());
		ddMenu.selectByIndex(i);
	}

	// selecting from day menu
	public void day(int i) {
		Select ddMenu = new Select(day());
		ddMenu.selectByIndex(i);
	}

	// ----------------

	// selecting from year from menu
	public void yaerFrom(int i) {
		Select ddMenu = new Select(yearFrom());
		ddMenu.selectByIndex(i);
	}

	// selecting from month menu
	public void monthFrom(int i) {
		Select ddMenu = new Select(monthFrom());
		ddMenu.selectByIndex(i);
	}

	// selecting from day menu
	public void dayFrom(int i) {
		Select ddMenu = new Select(dayFrom());
		ddMenu.selectByIndex(i);
	}

	// ----------------

	// selecting from year to menu
	public void yaerTo(int i) {
		Select ddMenu = new Select(yearTo());
		ddMenu.selectByIndex(i);
	}

	// selecting from month menu
	public void monthTo(int i) {
		Select ddMenu = new Select(monthTo());
		ddMenu.selectByIndex(i);
	}

	// selecting from day menu
	public void dayTo(int i) {
		Select ddMenu = new Select(dayTo());
		ddMenu.selectByIndex(i);
	}
	
	// ----------------
	
	// clicking on search
	public void clickSearchButton1() {
		searchButton1().click();
	}

	// input in query search field
	public void inputSearchQuery(String searchTerm) {
		searchQuery().sendKeys(searchTerm);
	}
		
	// selecting from fiealds to return menu
		public void fieldsToReturn(int i) {
			Select ddMenu = new Select(fieldsToReturn());
			ddMenu.selectByIndex(i);
		}
		
	// selecting from sort 1 menu
		public void fieldsSortRes1(int i) {
			Select ddMenu = new Select(sortRes1());
			ddMenu.selectByIndex(i);
		}
		
	// selecting from sort 2 menu
		public void sortRes2(int i) {
			Select ddMenu = new Select(sortRes2());
			ddMenu.selectByIndex(i);
		}
		
	// selecting from sort 3 menu
		public void sortRes3(int i) {
			Select ddMenu = new Select(sortRes3());
			ddMenu.selectByIndex(i);
		}	
		
	// input how many results to display
	public void inputNumbOfResField(String numbOfRes) {
		numbOfResField().sendKeys(numbOfRes);
	}
		
	// input how many pages to display
	public void inputNumbOfPagesField(String numbOfRes) {
		numbOfPagesField().sendKeys(numbOfRes);
	}	
	
	// click JSON check
	public void clickJsonFormat() {
		jsonFormat().click();
	}
	
	// click XML check
	public void clickXmlFormat() {
		xmlFormat().click();
	}
	
	// click HTML check
	public void clickXmlFormatBox() {
		xmlFormatBox().click();
	}
		
	// click HTML check
	public void clickHtmlTable() {
		htmlTable().click();
	}
	
	// click CSV check
	public void clickCsvFormat() {
		csvFormat().click();
	}
	
	// click CSV link check
	public void clickCsvFormatLink() {
		csvFormatLink().click();
	}
	
	// click CSV link check
	public void clickRssFormat() {
		rssFormat().click();
	}
	
	// click CSV link check
	public void clickSearchButton2() {
		searchButton2().click();
	}	
		
	}
