package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
		
		//@Elements
		
		@FindBy(xpath ="//input[@id='input-email']") WebElement txtEmailAddress;
		
		@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
		
		@FindBy(xpath="//input[@value='Login']") WebElement btnLogin;
		
		
		
		//Action Methods
		
		public void setEmailAddress(String Email) {
			
			txtEmailAddress.sendKeys(Email);

		}
		
		public void setPassword (String Password) {
			
			txtPassword.sendKeys(Password);
			
		}
		
		public void clickLogin() {
			
			btnLogin.click();
			
		}
		
	
	

}
