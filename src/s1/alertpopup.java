package s1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Bults\\geckodriver-v0.26.0-win64");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		String popuptext=alt.getText();
		
		System.out.println(popuptext);
		
		alt.accept();
		
		
		
		
		
		
		
		


	}

}
