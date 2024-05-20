package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Usercreationpageobject {
	WebDriver driver;
	
	By Homepage = By.linkText("Create an Account");
	By firstname= By.id("firstname");
	By lastname= By.id("lastname");
	By email= By.id("email_address");
	By pwd= By.id("password");
	By cpwd= By.id("password-confirmation");
	By createaccbtn= By.xpath(("//button[@type='submit'])[2]"));
	
public void Clickoncreateaccountlink(WebDriver driver) {
	this.driver=driver;
	driver.findElement(Homepage).click();
}
public void personalinformation(String fname, String lname	) {	

	driver.findElement(firstname).sendKeys(fname);
	driver.findElement(lastname).sendKeys(lname);
}
public void signininformation(String emailid, String password, String cpassword) {
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(pwd).sendKeys(password);
	driver.findElement(cpwd).sendKeys(cpassword);
}
public void createanaccount(WebDriver driver) {
	this.driver=driver;
	driver.findElement(createaccbtn).click();
}
}
