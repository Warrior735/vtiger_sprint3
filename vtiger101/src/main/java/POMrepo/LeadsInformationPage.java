package POMrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsInformationPage {
	WebDriver driver;
	
public LeadsInformationPage(WebDriver driver) 
{
		
		this.driver = driver;
}
	
	
	public String verifyingLeadInfo(String leadName)
	{
	
		return driver.findElement(By.xpath("//span[contains(text(), '"+leadName+"')]")).getText();
	}
}