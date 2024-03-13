package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD {
	
	@When("Click Register Button")
	public void click_register_button() {
	    
	    
	}

	@Then("{string}  tooltip should  displayed in the all empty field")
	public void tooltip_should_displayed_in_the_all_empty_field(String string) {
	    
	    
	}

	@When("Click Login Link")
	public void click_login_link() {
	    
	    
	}

	@Then("Login page should Open on the same window")
	public void login_page_should_open_on_the_same_window() {
	    
	    
	}

	@When("Click on Register link on the top left corner of the Home page.")
	public void click_on_register_link_on_the_top_left_corner_of_the_home_page() {
	    
	    
	}

	@Then("Registration page should Open on the same window")
	public void registration_page_should_open_on_the_same_window() {
	    
	    
	}

	@When("Enter valid <user name> ,<password>,<Password confirmation>")
	public void enter_valid_user_name_password_password_confirmation() {
	    
	    
	}

	@Then("Home Page should displayed with message 'New Account Created. You are logged in as <user name>.")
	public void home_page_should_displayed_with_message_new_account_created_you_are_logged_in_as_user_name() {
	    
	    
	}

	@When("Enter invalid <user name> and valid <password>,<Password confirmation> and click register button")
	public void enter_invalid_user_name_and_valid_password_password_confirmation_and_click_register_button() {
	    
	    
	}

	@Then("Warning message for invalid username should displayed as {string}")
	public void warning_message_for_invalid_username_should_displayed_as(String string) {
	    
	    
	}

	@When("Enter valid <user name> and invalid <password>,<Password confirmation> and click register button")
	public void enter_valid_user_name_and_invalid_password_password_confirmation_and_click_register_button() {
	    
	    
	}

	@Then("Warning message for invalid password should displayed")
	public void warning_message_for_invalid_password_should_displayed() {
	    
	    
	}

	@When("Enter valid <user name> and mismatched between <password>and <Password confirmation> and click register button")
	public void enter_valid_user_name_and_mismatched_between_password_and_password_confirmation_and_click_register_button() {
	    
	    
	}

	@Then("{string} Warning message should be displayed.")
	public void warning_message_should_be_displayed(String string) {
	    
	    
	}
	

}
