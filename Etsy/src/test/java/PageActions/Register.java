package PageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	@FindBy(xpath="//a[@id='register']")
	public static WebElement Register;
	
	@FindBy(xpath="//input[@id='join_neu_email_field']")
	public static WebElement Email;
	
	@FindBy(xpath="//input[@id='join_neu_first_name_field']")
	public static WebElement First_name;
	
	@FindBy(xpath="//input[@id='join_neu_password_field']")
	public static WebElement Password;
	
	
	public void click_Register() {
		Register.click();
	}
		public static void Enter_Email(String email) {
			 Email.sendKeys(email);
		
	}
		public static void Enter_First_Name(String name) {
			First_name.sendKeys(name);
		}
		
		public static void Enter_Password(String password) {
			Password.sendKeys(password);
		}

}
