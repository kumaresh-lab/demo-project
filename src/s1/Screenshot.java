package s1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		/*
		 a=10;
		
		float b=(float)a;
		
		System.out.println(a);
		
		System.out.println(b);*/
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\User\\Desktop\\Screen\\gmail"+System.currentTimeMillis()+".jpg"));
		
		
	}

}
