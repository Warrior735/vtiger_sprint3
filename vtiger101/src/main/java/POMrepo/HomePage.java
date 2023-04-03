package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(linkText= "Leads")
	private WebElement leadsLink;
	
	
	@FindBy(linkText= "Organizations")
	private WebElement OrganizationsLink;
	
	@FindBy(linkText= "Contacts")
	private WebElement ContactsLink ;
	
	@FindBy(linkText= "Opportunities")
	private WebElement OpportunitiesLink;
	
	@FindBy(linkText= "Products")
	private WebElement ProductsLink ;
	
	
	@FindBy(linkText= "More")
	private WebElement MoreLink  ;
	
	@FindBy(linkText= "Campaigns")
	private WebElement  CampaignsLink;
	
	@FindBy(linkText= "Vendors")
	private WebElement VendorsLink ;
	
	@FindBy(linkText="Invoice")
	private WebElement InvoiceLink;
	
	@FindBy(linkText= "Quotes")
	private WebElement QuotesLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	
	

	//getters methods 
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogoutIcon() {
		return logoutIcon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}



	
	//created setters methods 

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrganizationsLink() {
		return OrganizationsLink;
	}

	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return OpportunitiesLink;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}

	public WebElement getVendorsLink() {
		return VendorsLink;
	}

	public WebElement getInvoiceLink() {
		return InvoiceLink;
	}

	public WebElement getQuotesLink() {
		return QuotesLink;
	}
	

	
		
		//business logic 
	public void ClickOnLeadsModule()
	{
		leadsLink.click();
	}
	
	public void ClickOnOrganizationModule()
	{
		OrganizationsLink.click();
	}
	
	public void ClickOnContactsModule() 
	{
		ContactsLink.click();
	}
	public void ClickOnOpportunitiesModule1()
	{
		OpportunitiesLink.click();
	}
	public void ClickOnProductsModule()
	{
		ProductsLink.click();
	}
	
	public void ClickOnCampaignsModule()
	{
		Actions action=new Actions(driver);
		action.moveToElement(MoreLink).click(CampaignsLink).perform();
	}
	
	public void ClickOnVendorsModule()
	{
		Actions action=new Actions(driver);
		action.moveToElement(MoreLink).click(VendorsLink).perform();
	}

	public void logoutAction() {
		Actions action=new Actions(driver);
		action.moveToElement(logoutIcon).click().perform();
		signOutLink.click();
	}

	
}
