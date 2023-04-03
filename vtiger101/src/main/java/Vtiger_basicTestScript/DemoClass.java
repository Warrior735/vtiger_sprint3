
package Vtiger_basicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.protobuf.Duration;

import POMrepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(genericUtility.ListenerImplementionClass.class)
public class DemoClass  {
	
	@SuppressWarnings("deprecation")
	
	@Test
	public void demo() 
	{
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
			
		ChromeDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		LoginPage login= new LoginPage(driver);
		login.loginAction("admin" , "admin");
		

	}

}

