package pagepkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"user-name\"]")// page factory
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement login;
	
	
	public Loginpage(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvaues(String usrname,String pawd) {
		username.clear();
		username.sendKeys(usrname);
		password.clear();
		password.sendKeys(pawd);
		
		}
	public void loginbutton() {
		login.click();
	}
	
	public void alerthandling()
	{
		Alert a= driver.switchTo().alert();
		a.accept();
	}
	
	
}
