package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		 {
			FileInputStream fis;
			try {
				fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		
		} 
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUserID()
	{
		String username = pro.getProperty("userID");
		return username;
	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getEdgePath()
	{
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
}
