package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjectmodel.Usercreationpageobject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateaccountStepdefinition {
	
	WebDriver driver;
	Usercreationpageobject createuseraccobj = new Usercreationpageobject();
	
	@Given("I am visiting home page of Luma website")
	public void i_am_visiting_home_page_of_luma_website() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
	    
	}

	@Given("I navigate to create user account page")
	public void i_navigate_to_create_user_account_page() {
		createuseraccobj.Clickoncreateaccountlink(driver);
	}

	@When("I add personal information as {string} and {string}")
	public void i_add_personal_information(String ftname, String ltname) {
		createuseraccobj.personalinformation(ftname, ltname);   
	}

	@When("I add sign in information as {string} and {string} and {string}")
	public void i_add_sign_in_information(String mailid, String pwd, String cpwd) {
		createuseraccobj.signininformation(mailid, pwd, cpwd);
	}

	@Then("I want to create an account")
	public void i_want_to_click_on_create_an_account() {
		createuseraccobj.createanaccount(driver);
	}

	@Then("I check the outcomes")
	public void i_check_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
