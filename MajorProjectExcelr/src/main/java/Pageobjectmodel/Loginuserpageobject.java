package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginuserpageobject {
	WebDriver driver;
	
	By Homepage= By.linkText("Sign In");
	By email= By.id("email");
	By pwd= By.id("pass");
	By signinbtn= By.xpath("(//button[@type=\"submit\"])[2]");
	
public void Clicksigninlink(WebDriver driver) {
	this.driver=driver;
	driver.findElement(Homepage).click();
}

public void signininformation(String emailid, String password) {
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(pwd).sendKeys(password);
}

public void loginregistereduser(WebDriver driver) {
	this.driver=driver;
	driver.findElement(signinbtn).click();
}
}
