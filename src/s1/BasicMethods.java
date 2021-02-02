package s1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicMethods {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kumaresh\\\\Downloads\\\\geckodriver-v0.25.0-win64\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().to("http://www.google.com");
		
		driver.manage().window().maximize();
	
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
		//driver.close();
		

	}

}
