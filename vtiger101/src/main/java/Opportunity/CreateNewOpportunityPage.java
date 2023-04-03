package Opportunity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOpportunityPage {
	
public  CreateNewOpportunityPage(WebDriver driver){
	PageFactory.initElements(driver,this);

}
	
	@FindBy(name="potentialname")
	WebElement opportunityTextfieldName;
	
	@FindBy(name="related_to_type")
	WebElement relatedToDropdown;
	
	@FindBy(xpath= "//img[@title='Select']")
	WebElement relatedToPlusButton;
	
	//Getter methods

	public WebElement getOpportunityTextfieldName() {
		return opportunityTextfieldName;
	}

	public WebElement getRelatedToDropdown() {
		return relatedToDropdown;
	}

	public WebElement getRelatedToPlusButton() {
		return relatedToPlusButton;
	}	
	
	//BUSINESS LOGIC
	
	public void enterTheOpportunityName(String opportunityName)
	{
		opportunityTextfieldName.sendKeys(opportunityName);

	}
	
	public void selectRelatedToDropdown(String option )
	{
		Select select = new Select(relatedToDropdown);
		select.selectByVisibleText(option);
	}
	
	public void clickOnRelatedtoPlusLButton()
	{	
		relatedToPlusButton.click();
		
	}
	
	
	}
	                                                                                     