package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement cart1;
	
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement cart2;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement cart3;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement cart4;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement cart5;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement cart6;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement clickcart;
	
	
	
	public Cartpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void alladdcart() {
		cart1.click();
		cart2.click();
		cart3.click();
		cart4.click();
		cart5.click();
		cart6.click();
		
	}
	public void checkout() {
		clickcart.click();
	}


}
