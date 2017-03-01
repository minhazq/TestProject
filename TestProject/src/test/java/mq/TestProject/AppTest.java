package mq.TestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {
    
	
	@Test
	public void m1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bn.com");
	}
}
