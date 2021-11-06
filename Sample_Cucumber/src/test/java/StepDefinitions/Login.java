package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
     System.out.println("Hi");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	 System.out.println("you entered username and password");
	}

	@And("clicks login button")
	public void clicks_login_button() {
		 System.out.println("clicked login button1");
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		 System.out.println("on home page");
	}
}
