/**
 * 
 */
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AgileLoginPage;

/**
 * @author AMIT123
 *
 */
public class AgileLoginTest01 extends BaseClass{
	@Test
	public void loginpage()
	{
		AgileLoginPage lp = new AgileLoginPage(driver);
		logger.info("UserID and Password entered");
		lp.setUserId(userID);
		lp.setPassword(password);
		lp.clickonLogin();
		logger.info("Login Success");
	
		if (driver.getTitle().equals("Guru99 Bank Customer HomePage")) {
			Assert.assertTrue(true);
			logger.info("Test Case 001 is passed");
		} else 
		{
			//capturescreen(driver, "login test");
			Assert.assertTrue(false);
			logger.info("Test Case 001 is failed");
		}
	}

}
