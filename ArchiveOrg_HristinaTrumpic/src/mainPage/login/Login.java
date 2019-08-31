package mainPage.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mainPage.baseClasses.Waiters;

public class Login extends Waiters {

	static WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	// --------------------------------------------
	// ****ELEMENTS LOCATORS****
	// --------------------------------------------

	// sign in button in nav bar
	private static WebElement signinButton() {
		return driver
				.findElement(By.cssSelector("#navwrap2 li.dropdown-ia.pull-right.leftmost > a > span.hidden-xs-span"));
	}

	// sign up link
	private static WebElement signUp() {
		return driver.findElement(By.cssSelector("section.login-header.text-center > p > a"));
	}

	// email field
	private static WebElement emailField() {
		return driver.findElement(By.name("username"));
	}

	// password field
	private static WebElement passField() {
		return driver.findElement(By.name("password"));
	}

	// eye icon for show/hide password characters
	private static WebElement eyeIcon() {
		return driver.findElement(By.cssSelector("label:nth-child(4) > div > img"));
	}

	// forgotten password link
	private static WebElement forgottenPassLink() {
		return driver.findElement(By.cssSelector("span.reset-password > a"));
	}

	// check box for keep logged in
	private static WebElement keepLoggedIn() {
		return driver.findElement(By.name("remember"));
	}

	// login button
	private static WebElement loginButton() {
		return driver.findElement(By.name("submit-to-login"));
	}

	// login button
	private static WebElement errorMessage() {
		return driver.findElement(By.cssSelector(".login-error.password-error"));
	}

	// --------------------------------------------
	// ****ACTIONS****
	// --------------------------------------------

	// click on sign up
	public void clickSignIn() {
		signinButton().click();
	}

	// click on sign up
	public void clickSignUp() {
		signUp().click();
	}

	// send input to email field
	public void inputEmail(String email) {
		emailField().sendKeys(email);
	}

	// inputing password
	public void inputPass(String pass) {
		passField().sendKeys(pass);
	}

	// click on web icon from nav bar
	public void clickEyeIcon() {
		eyeIcon().click();
	}

	// click on web icon from nav bar
	public void clickForgottenPassLink() {
		forgottenPassLink().click();
	}

	// click on web icon from nav bar
	public void clickKeepLoggedIn() {
		keepLoggedIn().click();
	}

	// click on login button
	public void clickLoginButton() {
		loginButton().click();
	}

	// locator of ErrorMessage
	public WebElement locErrorMessage() {
		return errorMessage();
	}

	// locator for login buton
	public WebElement locLoginButton() {
		return loginButton();
	}

	// just locator for SignIn button
	public WebElement locSigninButton() {
		return signinButton();
	}

	// getting text from SignIn button to verify Singing in
	public String textSigninButton() {
		return signinButton().getText();
	}

	public WebElement locForgetPass() {
		return forgottenPassLink();
	}

}
