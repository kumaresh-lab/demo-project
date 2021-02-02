package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flikart {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		//driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		
		driver.findElement(By.xpath("//input[@type='text'][@class='_2zrpKA _1dBPDZ']")).sendKeys("muguwebmaster@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password'][@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("mugundhan");

		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		

	}

}
