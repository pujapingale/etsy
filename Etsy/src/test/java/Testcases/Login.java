package Testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DataProviderPackage.DataProvide1;
import Keywords.Constants;
import Keywords.Keyword1;
import PageActions.Register;
import junit.framework.Assert;

public class Login {
	
	@Test(dataProvider="TestData",dataProviderClass=DataProvide1.class)
	public  void LoginTest(String email,String name,String pass) {
		Keyword1.openBrowser("Chrome");
		Constants.driver.get("https://www.etsy.com/");
		Keyword1.maximiseWindow();
		Keyword1.implicitelyWait();
		Register reg = PageFactory.initElements(Constants.driver, Register.class);
		reg.click_Register();
		reg.Enter_Email(email);
		reg.Enter_First_Name(name);
		reg.Enter_Password(pass);
		//Constants.driver.close();
		reg.Register1.click();
		String actual=Constants.driver.findElement(By.xpath("aria-join_neu_email_field-error")).getText();
		Assert.assertEquals(actual, "Please enter a valid email address");
		System.out.println("Test pass");
		
		
		String actualName=Constants.driver.findElement(By.xpath("Your first name contains invalid characters.")).getText();
		Assert.assertEquals(actual, "Your first name contains invalid characters.");
		System.out.println("Test Case pass");
		
		String actualpass= Constants.driver.findElement(By.xpath("Must be at least 6 characters.")).getText();
		Assert.assertEquals(actualpass,"Must be at least 6 characters.");
		System.out.println("Test pass");
	}

}
