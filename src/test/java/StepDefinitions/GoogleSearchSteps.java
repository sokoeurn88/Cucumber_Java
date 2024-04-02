package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver = null;
	
	@Given("browser is opened")
	public void browser_is_opened() {
		String userpath = System.getProperty("user.dir");
	    System.out.println("open browser");
	    System.setProperty("webdriver.chrome.driver", userpath+"./Drivers/chromedriver1.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("user is on goole browsing page");
		driver.navigate().to("https://www.google.com");
	}

	@When("user enter texts in text box")
	public void user_enter_texts_in_text_box() {
		System.out.println("user fills text in text box");
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Step By Step");
	}

	@And("user hits enter")
	public void user_hits_enter() {
		System.out.println("user clicks enter");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigate to search result")
	public void user_is_navigate_to_search_result() {
		System.out.println("result page pops up");
		driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");
		driver.close();
	}

}
