package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass =DataProviders.class)
	public void test_loginDDT(String email, String password , String exp) {
		
		logger.info("Starting_TC_003_LoginDDT");
		
		try 
		{
			
        HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on My account");
		
		hp.clickLogin();
		logger.info("Clicked on Login");
		
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing Login Credentials");
		
		lp.setEmailAddress(email);
		lp.setPassword(password);
		lp.clickLogin();
		
		MyAccountpage myacc = new MyAccountpage(driver);
		boolean targetpage =myacc.isMyAccountPageExists();
		
		
		
		if(exp.equals("Valid")) {
			if(targetpage==true) {
				myacc.clickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equals("Invalid")) {
			if(targetpage==true)
			{
				MyAccountpage myaccpage = new MyAccountpage(driver);
				myaccpage.clickLogout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(false);
			}
		}
		}catch(Exception e) {
			Assert.fail();
		}
		
		logger.info(" Finished TC_003_LoginDataDrivenTest");	
		
	}
	

}
