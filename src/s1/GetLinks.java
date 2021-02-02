package s1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.rediff.com"); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		int totallinks=link.size();
		
		System.out.println(totallinks);
		
		/*
		for(int i=0; i<totallinks;i++)
		{
			System.out.println(link.get(i).getText()+"------->"+link.get(i).getAttribute("href"));
		}*/
		
		
		for(WebElement aa :link)
		{
			System.out.println(aa.getText());
		}
		

	}

}
