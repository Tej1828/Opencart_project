package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	@Test(groups= {"Regression","Master"}) 
	public void test_account_Resgistration()
	{
		logger.debug("Application logs....");
		logger.info("*** Starting TC_0001_AccountResgistrationTest***");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My account link");
		hp.clickRegister();
		logger.info("Clicked on Register link");

		
        AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
        logger.info("Providing customer data");

		
		regpage.setFirstName(randomString().toUpperCase());
		
		regpage.setLastName(randomString().toUpperCase());
		
		regpage.setEmail(randomString()+"@gmail.com");// randomly generated the email
		
		regpage.setTelephone(randomNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		
		regpage.clickContinue();
		logger.info("Clicked on continue");

		
		String confmsg=regpage.getConfirmationMsg();
		
		logger.info("Validating expected message");

		
		AssertJUnit.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		
		{
			logger.error("Test Failed");
			AssertJUnit.fail();
		}
		logger.info("*** Finished TC_001_AccountResgistrationTest");

	}
	
	

}
