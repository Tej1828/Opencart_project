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
	
	@FindBy(xpath="//input[@placeholder='Search']")  //For Search Product Test
	WebElement txtSearchbox;
	
	@FindBy(xpath="//div[@id='search']//button[@type='button']") //For Search Product Test
	WebElement btnSearch;
	
	
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
	
	public void enterProductName(String pName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}
	
	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}
 

}
