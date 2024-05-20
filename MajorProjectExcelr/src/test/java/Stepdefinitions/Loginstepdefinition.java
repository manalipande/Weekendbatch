package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjectmodel.Loginuserpageobject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition {
	WebDriver driver;
	Loginuserpageobject signinobj= new Loginuserpageobject();

	@Given("I am visiting sign in page of Luma website")
	public void i_am_visiting_sign_in_page_of_luma_website() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@When("I navigate to sign in page")
	public void i_navigate_to_sign_in_page() {
		signinobj.Clicksigninlink(driver);
	}

	@When("I add sign in information as {string} and {string}")
	public void i_add_sign_in_information(String mailid, String passwd) {
		signinobj.signininformation(mailid, passwd);
	    
	}

	@Then("I want to get logged in to my account")
	public void i_want_to_get_logged_in_to_my_account() {
		signinobj.loginregistereduser(driver);
	}


}
