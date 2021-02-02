package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	
	
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kumaresh\\\\Downloads\\\\geckodriver-v0.25.0-win64\\\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dgooginabkvernac-21%26ascsubtag%3D_k_EAIaIQobChMI8dyd9uHo5AIVRSQrCh1czwj2EAAYASAAEgLc-vD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMI8dyd9uHo5AIVRSQrCh1czwj2EAAYASAAEgLc-vD_BwE%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ap_email")).sendKeys("muguwebmaster@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("thewiper");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wranglerjeans");
		
		driver.findElement(By.className("nav-input")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		

	}

}
