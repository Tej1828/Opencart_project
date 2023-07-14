package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") WebElement lnkAccount;
	
	@FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a") WebElement lnkRegister;
	
	@FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") WebElement lnkLogin;
	
	
	//Action Methods
	
	public void clickMyAccount() {
		lnkAccount.click();
	
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
 

}
