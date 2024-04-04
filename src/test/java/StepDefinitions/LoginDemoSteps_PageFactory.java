package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import pagefactory.HomePage_PageFactory;
import pagefactory.LoginPage_PageFactory;

public class LoginDemoSteps_PageFactory {
	WebDriver driver = null;
	LoginPage_PageFactory login;
	HomePage_PageFactory home;
	
	//this method is for using hook concept
	@Before
	public void browserSetup() {
		String userpath = System.getProperty("user.dir");
	    System.out.println("open browser");
	    System.setProperty("webdriver.chrome.driver", userpath+"./Drivers/chromedriver1.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    System.out.println("inside browserSetup");
		}
	
	@After
	public void tearDown() {
		System.out.println("inside tearDown");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void goBeforStep() {
		System.out.println("BeforeStep");
	}
	
	@AfterStep
	public void goAfterStep() {
		System.out.println("AfterStep");
	}
	
	@Given("browser is opened sucessfully")
	public void browser_is_opened_sucessfully() {
		System.out.println("Browser is opened");
	}

	@And("user is on login page sucessfully")
	public void user_is_on_login_page_sucessfully() {
	    driver.navigate().to("https://www.facebook.com");
	}

	@When("^user enters (.*) and (.*) sucessfully$")
	public void user_enters_username_and_password_sucessfully(String username, String password) {
		login = new LoginPage_PageFactory(driver); 
		
		login.enterUsername(username);
		login.enterPassword(password);
	}
	
	@And("user clicks on login sucessfully")
	public void user_clicks_on_login_sucessfully() {
		login.clickLogin();
	}
	
	@Then("user navigate to the home page sucessfully")
	public void user_navigate_to_the_home_page_sucessfully() {
		home.showText();
	}
	
	
	
	@When("user type name and pass")
	public void user_type_name_and_pass() {
	}
	
	@Then("user is in homepage")
	public void user_is_in_homepage() {
	}
	
	@When("When user enters <username> and <password> sucessfully")
	public void when_user_enters_username_and_password_sucessfully() {
	}
	

}
