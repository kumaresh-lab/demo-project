package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("Java");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("muguwebmaster@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("mugundhan@8");
		
		driver.findElement(By.id("loginbutton")).click();
		
	//	String text=driver.findElement(By.className("_5iyx")).getText();
		
	//	System.out.println(text);
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten a")).click();
		

	}

}
