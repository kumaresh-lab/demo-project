package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("muguwebmaster@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).isDisplayed();
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][@autocomplete='current-password']")).sendKeys("123456");
		
		
		
		

	}

}
