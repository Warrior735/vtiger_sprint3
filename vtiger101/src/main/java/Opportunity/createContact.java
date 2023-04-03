package Opportunity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createContact {
	public createContact(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath= "//img[@title='Create Contact...']")
	WebElement creatingNewContactPage;

	@FindBy(xpath= "name=salutationtype")
	WebElement salutationDropdown;

	@FindBy(name="lastname")
	WebElement lastNameTextfield;

	@FindBy(xpath="//input[@value='U']")
	WebElement userRadioButton;

	@FindBy(xpath="//input[@value='T']")
	WebElement groupRadioButton;

	@FindBy(name="assigned_user_id")
	WebElement administartorDropdown;

	@FindBy(name="button")
	WebElement saveButton;

	public WebElement getCreatingNewContactPage() {
		return creatingNewContactPage;
	}

	public WebElement getSalutationDropdown() {
		return salutationDropdown;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getUserRadioButton() {
		return userRadioButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getAdministartorDropdown() {
		return administartorDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	//Business Logic

	public void selectSalutationDropdown(String option)
	{
		Select select = new Select(salutationDropdown);
		select.selectByVisibleText(option);
	}

	public void enterLastName() 
	{
		lastNameTextfield.click();

	}

	public void clickOnUserRadioButton()
	{
		userRadioButton.click();
	}

	public void SelectFromAdministartorDropdown(String option)
	{
		Select select = new Select(salutationDropdown);
		select.selectByVisibleText(option);
	}









}
