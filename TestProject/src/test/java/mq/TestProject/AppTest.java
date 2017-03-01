package mq.TestProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AppTest {
    
	
	@Test
	public void m1() throws MalformedURLException{
		
		DesiredCapabilities desiredCapabilites = new DesiredCapabilities();
		desiredCapabilites.setBrowserName("firefox");
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://mquraishi.com:4444/wd/hub"),desiredCapabilites);
		driver.get("http://www.bn.com");
	}
}
