//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginDemoSteps {
//	WebDriver driver = null;
//	
//	@Given("browser is opened sucessfully")
//	public void browser_is_opened_sucessfully() {
//		String userpath = System.getProperty("user.dir");
//	    System.out.println("open browser");
//	    System.setProperty("webdriver.chrome.driver", userpath+"./Drivers/chromedriver1.exe");
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//	}
//
//	@And("user is on login page sucessfully")
//	public void user_is_on_login_page_sucessfully() {
//	    driver.navigate().to("https://www.google.com");
//	}
//
//	@When("user enters username and password sucessfully")
//	public void user_enters_username_and_password_sucessfully() {
//		driver.findElement(By.id("APjFqb")).sendKeys("TestProject");
//	}
//	
//	@And("user clicks on login sucessfully")
//	public void user_clicks_on_login_sucessfully() {
//		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//	}
//	
//	@Then("user navigate to the home page sucessfully")
//	public void user_navigate_to_the_home_page_sucessfully() {
//		driver.getPageSource().contains("TestProject Test Automation Tool Hands-on Review Tutorial");
//		driver.close();
//	}
//	
//
//}
