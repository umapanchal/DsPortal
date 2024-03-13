package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Stack_SD {
	
	WebDriver driver = new ChromeDriver();
	
	
	String URL="https://dsportalapp.herokuapp.com/login";
	
	
	@Given("Enter  into the DS Algo portal with Valid URL")
	public void enter_into_the_ds_algo_portal_with_valid_url() throws InterruptedException  {
		
		
		driver.get (URL);
		
		WebElement userName = driver.findElement(By.id("id_username"));
		userName.sendKeys("karthika");
		
		WebElement password = driver.findElement(By.id("id_password"));
		password.sendKeys("Numpy@12345");
		
		WebElement login= driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
	}

	@When("Click on {string} Button in Stack section in the home page")
	public void click_on_button_in_stack_section_in_the_home_page(String string) {
	    
		
		WebElement stackGetstarted= driver.findElement(By.xpath("//h5[contains(text(),'Stack')]/../a[contains(text(),'Get Started')]"));
		
		stackGetstarted.click();
	}

	@Then("{string} Stack page should open")
	public void stack_page_should_open(String string) {
		
		

	}
	

	@When("Go to Topics Covered section and click {string} link")
	public void go_to_topics_covered_section_and_click_link(String string) {
		
		WebElement operationsinstack= driver.findElement(By.xpath("//a[contains(text(),'Operations in Stack')]"));
		operationsinstack.click(); 
	}

	@Then("{string} Operations in stack page should open")
	public void operations_in_stack_page_should_open(String string) {
		 System.out.println("operationsinstack");
		
	}

	@When("Click {string} button at the bottom of the page")
	public void click_button_at_the_bottom_of_the_page(String string) {
		
	
	
		WebElement tryhere= driver.findElement(By.linkText("Try here>>>"));
		tryhere.click();
	}

	@Then("Editor box should open with run button in Assessment page in the same window")
	public void editor_box_should_open_with_run_button_in_assessment_page_in_the_same_window() {
	    
	    
	}

	@When("Type Sample <print\"hello\"> and click run button")
	public void type_sample_print_hello_and_click_run_button() {
	    
	    
	}

	@Then("Result should displayed in the bottom of the page {string}")
	public void result_should_displayed_in_the_bottom_of_the_page(String string) {
	    
	    
	}

	@When("Clear the Editor Box an type sample other language System.out.println\\({string}) and click run button")
	public void clear_the_editor_box_an_type_sample_other_language_system_out_println_and_click_run_button(String string) {
	    
	    
	}

	@Then("Alert should displayed as 'NameError: name 'System' is not defined on line <line {int}>' with ok button")
	public void alert_should_displayed_as_name_error_name_system_is_not_defined_on_line_line_with_ok_button(Integer int1) {
	    
	    
	}

	@When("Click OK button and click browser right arrow to go back")
	public void click_ok_button_and_click_browser_right_arrow_to_go_back() {
	    
	    
	}

	@Then("{string}  Operations in stack page should displayed")
	public void operations_in_stack_page_should_displayed(String string) {
	    
	    
	}

	@Then("{string} Implementation page should open")
	public void implementation_page_should_open(String string) {
	    
	    
	}

	@Then("{string} Implementation page should displayed")
	public void implementation_page_should_displayed(String string) {
	    
	    
	}

	@Then("{string} Applications page should open")
	public void applications_page_should_open(String string) {
	    
	    
	}

	@Then("{string} Application page should displayed")
	public void application_page_should_displayed(String string) {
	    
	    
	}

	@When("Click Practice Question link in the Linked List section on the right side")
	public void click_practice_question_link_in_the_linked_list_section_on_the_right_side() {
	    
	    
	}

	@Then("Empty Practice Question page should displayed on the same window")
	public void empty_practice_question_page_should_displayed_on_the_same_window() {
	    
	    
	}




}
