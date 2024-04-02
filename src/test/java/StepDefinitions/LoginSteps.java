package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user click on login button");
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("user is land on home page");
	}

}
