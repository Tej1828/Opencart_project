package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountpage extends BasePage{

	public MyAccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[1]") WebElement msgHeading;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement btnLogout;
	
	public boolean isMyAccountPageExists() {
		try 
		{
		return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickLogout() {
		
		btnLogout.click();
	}

}
