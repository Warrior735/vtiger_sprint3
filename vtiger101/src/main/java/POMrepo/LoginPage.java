package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver) //login page can relate to driver in DemoClass
	{
		PageFactory.initElements(driver, this);//pagefactory selenium ki class maia static initelements ke through driver..chrome ke liye launch kor rahe hai is class se 
	}
	
	
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	public WebElement getUsernameTextField() //created getter methods >>right click>>source>>generate getter method
	{
		return usernameTextField;
	}

	public WebElement getPasswordTextField()                                                                                                                                                                                                                                                                                                                                             
	{
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginAction(String username, String password)//created generic method so we dont have to put un and pwd everytime
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}


	}
	


