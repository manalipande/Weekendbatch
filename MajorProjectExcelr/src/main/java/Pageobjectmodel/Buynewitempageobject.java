package Pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buynewitempageobject {
	WebDriver driver;
	By womensec= By.linkText("Women");
	By womensecpants= By.linkText("Pants");
	By selectitem= By.linkText("Portia Capri");
	By size= By.xpath("//div[@id='option-label-size-143-item-171']");
	By color= By.xpath("//div[@id='option-label-color-93-item-50']");
	By addtocart= By.xpath("//button[@title='Add to Cart']");
	By gotocart= By.linkText("shopping cart");
	By checkout= By.xpath("(//button[@class='action primary checkout'])[2]");
	By shipemail= By.id("customer-email");
	By shipfname= By.xpath("(//input['@name=firstname'])[10]");
	By shiplname= By.xpath("(//input['@name=lastname'])[11]");
	By shipaddress= By.xpath("(//input[@class='input-text'])[8]");
	By shipcity= By.xpath("(//input[@class='input-text'])[11]");
	By shipstate= By.xpath("(//select[@class='select'])[1]");
	By shipzip= By.xpath("(//input[@class='input-text'])[13]");
	By shipcountry= By.xpath("(//select[@class='select'])[2]");
	By shipphnno= By.xpath("(//input[@class='input-text'])[14]");
	By shipmethod= By.xpath("(//input[@class='radio'])[1]");
	By shipnextbtn= By.xpath("//button[@class='button action continue primary']");
	By placeorder=By.xpath("//button[@class='action primary checkout']");
	
	public void Gotowomensec(WebDriver driver) {
		this.driver=driver;
		driver.findElement(womensec).click();
	}
	
	public void Gotowomensecpants(WebDriver driver) {
		this.driver=driver;
		driver.findElement(womensecpants).click();
	}
	
	public void selectnitem(WebDriver driver) {
		this.driver=driver;
		driver.findElement(selectitem).click();
	}
	
	public void selectcolorandsize(WebDriver driver) {
		this.driver=driver;
		driver.findElement(size).click();
		driver.findElement(color).click();
	}
	
	public void add2cart(WebDriver driver) {
		this.driver=driver;
		driver.findElement(addtocart).click();
	}
	
	public void go2cart(WebDriver driver) {
		this.driver=driver;
		driver.findElement(gotocart).click();
	}
	
	public void chkout(WebDriver driver) {
		this.driver=driver;
		driver.findElement(checkout).click();
	}
	
	public void shipformfill(WebDriver driver,String mail, String finame, String laname, String addres, String city, String state, String zipc, String country, String phoneno) {
		this.driver=driver;
		
		driver.findElement(shipemail).sendKeys(mail);
		driver.findElement(shipfname).sendKeys(finame);
		driver.findElement(shiplname).sendKeys(laname);
		driver.findElement(shipaddress).sendKeys(addres);
		driver.findElement(shipcity).sendKeys(city);
		Select statedropdown = new Select(driver.findElement(shipstate));
		statedropdown.selectByVisibleText(state);
		driver.findElement(shipzip).sendKeys(zipc);
		Select countrydropdown= new Select(driver.findElement(shipcountry));
		countrydropdown.selectByVisibleText(country);
		driver.findElement(shipphnno).sendKeys(phoneno);
		driver.findElement(shipmethod).click();
	}
	public void gotoplaceorder(WebDriver driver) {
		this.driver=driver;
		driver.findElement(shipnextbtn).click();
		driver.findElement(placeorder).click();
	}
}
