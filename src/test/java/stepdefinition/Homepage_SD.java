package stepdefinition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_SD {
	public static WebDriver driver;
	String
	URL="https://dsportalapp.herokuapp.com";
	By Home_button=By.xpath("//a[@href='/home']");

	//data structure dropdown values

	
	By Datastructure=By.xpath("//*[@id='navbarCollapse']/div[1]/div/a");
	By DS_Arrays=By.linkText("Arrays");
	By DS_Linked=By.linkText("Linked List");
	By DS_Stack=By.linkText("Stack");
	By DS_Queue=By.linkText("Queue");
	By DS_Tree=By.linkText("Tree");
	By DS_Graph=By.linkText("Graph");
	//login
	By login_link=By.xpath("//a[@href='/login']");
	By user_name=By.id("id_username");
	By pass_word=By.id("id_password");
	By Login_button=By.xpath("//input[@value='Login']");
	
	@Given("Enter DS Algo portal")
	public void enter_ds_algo_portal() {
			driver=new ChromeDriver();
			driver.get(URL);
			driver.findElement(Home_button).click();
			String home_name=driver.getTitle();
			Assert.assertEquals
			(home_name,"NumpyNinja");

			driver.findElement(login_link).click();

			driver.findElement(user_name).sendKeys("karthika");
			

			driver.findElement(pass_word).sendKeys("Numpy@12345");

			driver.findElement(Login_button).click();
			
			}
	   
	

	@When("Click the Data structure dropdown arrow")
	public void click_the_data_structure_dropdown_arrow() {
		
		driver.findElement(Datastructure).click();
		
	}

	@Then("Check Dropdown Values")
	public void check_dropdown_values() {
		
		List<WebElement>

		drop_values=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));

		for(int i=0;i<drop_values.size();i++)
		{
			
		String
		ds_pages=drop_values.get(i).getText();
		System.out.println(ds_pages);
		}
	   
	}

	@When("Click All dropdown Values")
	public void click_all_dropdown_values() {
		driver.findElement(DS_Arrays).click();
		driver.findElement(Datastructure).click();

		driver.findElement(DS_Linked).click();
		driver.findElement(Datastructure).click();
		driver.findElement(DS_Stack).click();
		driver.findElement(Datastructure).click();
		driver.findElement(DS_Queue).click();
		driver.findElement(Datastructure).click();
		driver.findElement(DS_Tree).click();
		driver.findElement(Datastructure).click();
		driver.findElement(DS_Graph).click();
	   
	}

	@Then("DS page should displayed")
	public void ds_page_should_displayed() {
		String G_Pages=driver.getTitle();
		System.out.println(G_Pages);
	    
	   
	}

	@When("Click on Register link")
	public void click_on_register_link() {
		By register_link=By.xpath("//input[@value='Login']");
		driver.findElement(register_link).click();
	   
	}

	@Then("Registration page open")
	public void registration_page_open() {
	    
	   
	}

	@When("Click on Signin link")
	public void click_on_signin_link() {
	    
	   
	}

	@Then("Login page Open")
	public void login_page_open() {
	    
	   
	}

	@When("Click on ' Get Started 'button in Data Structure-Introduction")
	public void click_on_get_started_button_in_data_structure_introduction() {
	    
	   
	}

	@Then("You are not logged in message displayed.")
	public void you_are_not_logged_in_message_displayed() {
	    
	   
	}

	@When("Click on Get Started Button in Array")
	public void click_on_get_started_button_in_array() {
	    
	   
	}

	@When("Click on Get Started button in Linked List")
	public void click_on_get_started_button_in_linked_list() {
	    
	   
	}

	@When("Click on Get Started Button in Stack")
	public void click_on_get_started_button_in_stack() {
	    
	   
	}

	@When("Click on Get Started Button in Queue")
	public void click_on_get_started_button_in_queue() {
	    
	   
	}

	@When("Click on Get Started button in Tree")
	public void click_on_get_started_button_in_tree() {
	    
	   
	}

	@When("Click on Get Started Button in Graph")
	public void click_on_get_started_button_in_graph() {
	    
	   
	}



	
}