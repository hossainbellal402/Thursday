package thursdaytry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thursdaytime {
	
	@Test

	public void openBrowser()  {
		  
		
System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\eclipse-workspace\\Thursday\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		  driver.get( "https://Facebook.com/");
		
		
		

	}

}
