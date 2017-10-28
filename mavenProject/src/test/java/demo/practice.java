package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practice 
{
	@Parameters({"browser" , "nodeurl" , "appurl" })
	@Test
	public void m1(String browser , String nodeurl , String appurl) throws MalformedURLException
	{
		URL url = new URL(nodeurl);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		RemoteWebDriver rc = new RemoteWebDriver(url, dc);
		rc.get(appurl);

//		if(browser.equals("firefox"))
//		{
//			
//		}
//		
//		else if(browser.equals("chrome"))
//		{
//			RemoteWebDriver rc = new RemoteWebDriver(url, dc);
//			rc.get(appurl);
//		}
	}
}
