package s1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) 
	{
		/*
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.close();
		*/
		
		/*
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://naukuri.com");
		
		driver.get("http://fb.com");
		
		driver.manage().window().maximize();
		
		driver.close();
		
	    */
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://youtube.com");
		
		driver.manage().window().maximize();
		
		 
		
		
	}

}
