package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.Cartpage;
import pagepkg.Loginpage;
import utilpkg.Excelutils;


public class Logintest extends baseclass{
	Loginpage ob;
	@Test(priority = 1)
	public void verifylogintest() {
	    ob=new Loginpage(driver);
		String xl="F:\\saucedemo.xlsx";
		String sheet="Sheet1";
		
		int rowcount=Excelutils.getRowCount(xl, sheet);
		for(int i=1;i<=rowcount;i++) {
			String username=Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.println(username);
			String password=Excelutils.getCellValue(xl, sheet, i, 1);
			System.out.println(password);
			ob.setvaues(username, password);
			ob.loginbutton();
			ob.alerthandling();
		
			
		}

}
	@Test(priority = 2)
	public void addcart() {
		Cartpage cart=new Cartpage(driver);
		cart.alladdcart();
		
	}
	@Test(priority = 3)
	public void checkoutcart() {
		Cartpage cart=new Cartpage(driver);
		cart.checkout();
	}
	
}
