package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver = null;
	
	private By txt_username = By.id("email");
	private By txt_password = By.id("pass");
	private By btn_login = By.name("login");
	private By txt_present = By.xpath("//span[contains(text(), 'Your Pages and profiles')]");
	
	//create a class constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void showText() {
		driver.findElement(txt_present).isDisplayed();
	}

}
