package s1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https:www.gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    TakesScreenshotts=(takesscreenshot)driver;
	    
	    file src= ts.getScreenshotAs(OutputType.FILE);
	    
	    
	    filehandler.copy(src,new file(("C:\\Users\\User\\Desktop\\Screen\\"+System.currentTimeMillis()+".jpg")))

		
		
		
	}

}
