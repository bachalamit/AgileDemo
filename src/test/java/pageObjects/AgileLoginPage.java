/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author AMIT123
 *
 */
public class AgileLoginPage {
	
	WebDriver driver;
	public AgileLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "uid")
	WebElement userid;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	public void setUserId(String uID)
	{
		userid.sendKeys(uID);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonLogin()
	{
		btnLogin.click();
	}
}
