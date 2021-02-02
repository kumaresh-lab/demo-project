package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbus {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "E:\\Bults\\geckodriver-v0.26.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.xpath("//input[@type='text'][@data-message='Please enter a source city']")).sendKeys("tambaram");
		
		driver.findElement(By.xpath("//input[@type='text'][@data-message='Please enter a destination city']")).sendKeys("chidambaram");
		
		//driver.findElement(arg0)
		

	}

}
