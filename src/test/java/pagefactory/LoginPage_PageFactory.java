package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//private By txt_username = By.id("email");
//private By txt_password = By.id("pass");
//private By btn_login = By.name("login");


public class LoginPage_PageFactory {
	WebDriver driver = null;
	
	@FindBy(id = "email")
	WebElement txt_username;
	
	@FindBy(id = "pass")
	WebElement txt_password;
	
	@FindBy(name = "login")
	WebElement btn_login;
	
	//class constructor
	public LoginPage_PageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		//this = LoginPage_PageFactory.class
	}
	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clickLogin() {
		btn_login.click();
	}
	
	
	
	

}
