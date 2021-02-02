package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twitter2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://twitter.com/login");
		
		driver.findElement(By.xpath("//input[@type='text'][@class='js-username-field email-input js-initial-focus']")).sendKeys("muguwebmaster@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password'][@class='js-password-field']")).sendKeys("mugundhan@8");
		
		driver.findElement(By.xpath("//button[@type='submit'][@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
		
		driver.findElement(By.xpath("//span[text()='More']")).click();
		
		driver.findElement(By.xpath("//div[@title='Log out']")).click();
		
		
		

	}

}
