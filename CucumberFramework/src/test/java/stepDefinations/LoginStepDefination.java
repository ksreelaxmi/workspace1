package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	@Given("^User is on Netbanking Landing page$")
	public void User_is_on_Netbanking_Landing_page() {
		System.out.println("User is on Netbanking Landing page");
	}
	
	@When("User is login into application with {string} and password {string}")
	public void user_is_login_into_application_with_and_password(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(string1);
	   System.out.println(string2);
	}
	
	@Then("^Home page will be populated$")
	public void Home_page_will_be_populated() {
		System.out.println("Home page will be populated");
	}
	
	@And("card dispalyed are {string}")
	public void card_dispalyed_are(String string1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(string1);
	}


}
