package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kumaresh\\\\Downloads\\\\geckodriver-v0.25.0-win64\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dgooginabkvernac-21%26ascsubtag%3D_k_EAIaIQobChMIl_61u6Dr5AIVV46PCh2yeAryEAAYASAAEgKd8vD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIl_61u6Dr5AIVV46PCh2yeAryEAAYASAAEgKd8vD_BwE%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");	
        
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("muguwebmaster@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("thewiper");
        
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        
        
        
        
        
		
		

	}

}
