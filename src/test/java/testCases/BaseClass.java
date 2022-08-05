/**
 * 
 */
package testCases;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

/**
 * @author AMIT123
 *
 */
public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String userID = readconfig.getUserID();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger = Logger.getLogger("Agile Project"); 
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			ChromeOptions opt = new ChromeOptions();
			opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
			driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", readconfig.getChromePath());
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
