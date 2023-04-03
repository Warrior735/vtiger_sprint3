
package vtiger.basicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POMrepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
co.addArguments("- -remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "admin");
	}
		

	}