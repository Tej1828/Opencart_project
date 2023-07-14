package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void login_test() {
		
		logger.info("Starting_TC_002_LoginTest");
		
		
		try
		{
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on My account");
		
		hp.clickLogin();
		logger.info("Clicked on Login");
		
		LoginPage lp = new LoginPage(driver);
		
		logger.info("Providng Login Creds");
		lp.setEmailAddress(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clickLogin();
		
		MyAccountpage myacc = new MyAccountpage(driver);
		boolean targetpage =myacc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true );
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		logger.info(" Finished TC_002_LoginTest");
	}
	
	
	

}
