package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium driver files\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		/*
		driver.get("https://www.youtube.com");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bigbananaleaffish");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		driver.findElement(By.xpath("//img[@class='style-scope ytd-moving-thumbnail-renderer']")).isDisplayed(); 
		*/
		//realtive
		
		//single attribute- //tagname[@attribute='value']
		
		//multiple attribute- //tagname[@attribute='value'][@attribute='value']
		
		// text() - //tagname[text()='value']
		
		// contains() - //tagname[contains(text(),'value')]  //tagname[contains(@attribut,'value')]
		
		//starts-with() -//tagname[starts-with(text(),'value')] //tagname[starts-with(@attribute,'value')] 
		
		driver.get("http://www.fb.com");
		
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'][@data-testid='royal_pass']")).sendKeys("Java");
		
		String str=driver.findElement(By.xpath("//label[text()='Email or Phone']")).getText();
		
		System.out.println(str);
		
		String str1=driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText();
		
		System.out.println("Contains method :"+ str1);
		
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("abc");
		
		String s2=driver.findElement(By.xpath("//span[starts-with(text(),'Create')]")).getText();
		
		System.out.println(s2);
		
		String s3=driver.findElement(By.xpath("//div[starts-with(@class,'_5iyx')]")).getText();
		
		System.out.println(s3);
	}

}
