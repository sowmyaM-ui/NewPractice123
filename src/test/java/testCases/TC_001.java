package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001 extends BaseClass {

	
	
	@Test(groups= {"Sanity"})
	public void verify_account_registration()
	{
		logger.info("******Starting with TC001");
		
		try {
		HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		logger.info("******click on My account link");

		hp.lnkRegister();
		logger.info("******click on My Register link");

		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("***Providing customer details");

		regpage.setFirstName(randomeString());
		regpage.setLastName(randomeString());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		
		String  password=randomeAlphanumeric();
		regpage.setPassword(password);
		regpage.setconfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();

		regpage.getConfirmationMsg();
		logger.info("validating expected message");

		String confrmmsg=regpage.getConfirmationMsg();
		if(confrmmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed.....");
			logger.error("Debug logs.....");
			Assert.assertTrue(false);

		}
		}
	
		catch(Exception e)
	{
		logger.error("Test failed.....");
		logger.error("Debug logs.....");
		Assert.fail();

	}
		logger.info("......finished TC001 test");

	
}
}

