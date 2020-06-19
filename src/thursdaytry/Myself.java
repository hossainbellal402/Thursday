package thursdaytry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myself {
@Test
	public void openBrowser() throws InterruptedException {
		
System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\Desktop\\New folder (2)\\chromedriver_win32 (1)\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		  driver.get( "https://Facebook.com/");
		
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);
		  Thread.sleep(3000);
		  
		  driver.findElement( By.cssSelector("#u_0_m")).sendKeys("Bellal");
		  driver.findElement(By.cssSelector( "#u_0_o")).sendKeys( "Hossain");
		  driver.findElement( By.cssSelector( "#u_0_r")).sendKeys("Hossainbellal@gmail.com");
		 driver.findElement(By.cssSelector( "#u_0_u")).sendKeys( "Hossainbellal@gmail.com");
		 driver.findElement(By.cssSelector("#u_0_w")).sendKeys( "9294994679");
		 driver.findElement( By.cssSelector( "#month")).sendKeys( "Numember");
		 driver.findElement(By.cssSelector( "#day")).sendKeys( "15");
		 driver.findElement(By.cssSelector( "#year")).sendKeys( "1989");
		 driver.findElement(By.cssSelector( "#u_0_z > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector( "#u_0_13")).click();
		
		String part1="//*[@id=\"pageFooter\"]/ul/li[";
		String part2="]";
		for(int i=1;i<=12;i++) {
			System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
		}
        
		String ft1="//*[@id=\"content\"]/div/div/div/div[1]/div[";
		String ft2="]";
		for(int i=1;i<=3;i++) {
			System.out.println(driver.findElement(By.xpath(ft1+i+ft2)).getText());
		}
		
		String fo1="//*[@id=\"pageFooterChildren\"]/ul/li[";
		String fo2="]/a";
		for(int i=1;i<=28;i++) {
			System.out.println(driver.findElement(By.xpath(fo1+i+fo2)).getText());
		}
		
	
		
		
		
		

	}

}
