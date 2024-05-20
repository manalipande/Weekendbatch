package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjectmodel.Buynewitempageobject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyitemStepdefinition {
	WebDriver driver;
	Buynewitempageobject buyobj= new Buynewitempageobject();
	
	@Given("I want to go to Luma homepage")
	public void i_want_to_go_to_luma_homepage() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@Given("I want to go to women section and buy pants")
	public void i_want_to_go_to_women_section_and_buy_pants() {
	    buyobj.Gotowomensec(driver);
	    buyobj.Gotowomensecpants(driver);
	}

	@When("I want to select an item")
	public void i_want_to_select_an_item() {
	    buyobj.selectnitem(driver);
	}

	@When("I want to select size and color")
	public void i_want_to_select_size_and_color() {
	    buyobj.selectcolorandsize(driver);
	}

	@When("I want to add the item into the cart")
	public void i_want_to_add_the_item_into_the_cart() {
	    buyobj.add2cart(driver);
	}

	@Then("I want to go to cart")
	public void i_want_to_go_to_cart() {
	    buyobj.go2cart(driver);
	}

	@Then("I want to do the checkout")
	public void i_want_to_do_the_checkout() {
	    buyobj.chkout(driver);
	}
	
	@Then("I want to add shipping address as {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void i_want_to_add_shipping_address_as_and_and_and_and_and_and_and_and(String mailid, String fname, String lname, String address, String cty, String ste, String zip, String cnty, String phnno) { 
		//try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.id("customer-email"))));
		buyobj.shipformfill(driver, mailid, fname, lname, address, cty, ste, zip, cnty, phnno);	
		//}
		//catch(Exception e) {
		//}
		}

	@Then("I want to place the order")
	public void i_want_to_place_the_order() {
	    buyobj.gotoplaceorder(driver);
	}

}
