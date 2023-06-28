package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver1 ;
	
	public LoginPage(WebDriver Rdriver)
	{
		driver1=Rdriver;
		
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath = "//input[@class='email valid']") WebElement Username;
	@FindBy(xpath = "//input[@class='password']") WebElement Password;
	@FindBy(xpath = "//button[@class='button-1 login-button']") WebElement LoginBTN;
	@FindBy(xpath = "//a[text()='Logout']") WebElement LogOut;
	//a[text()='Logout']
	public void EnterEmail(String email)
	{
		Username.sendKeys("email");
	}
	
	public void EnterPassword(String Pass)
	{
		Username.sendKeys("Pass");
	}
	public void ClickOnLogin()
	{
		Username.click();
	}

	public void ClickLogOutBTN()
	{
		LogOut.click();
// changes has beeen done
	}

}
