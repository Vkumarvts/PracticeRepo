package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public WebDriver driver;
	public LoginPage LoginPG;
	
	@Given("I lounch chrome Browser")
	public void i_lounch_chrome_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		LoginPG = new LoginPage(driver);
		

	}

	@When("I Open URL {string}")
	public void i_open_url(String url) {
		
		driver.get(url);

	}

	@When("user enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
	
		LoginPG.EnterEmail(email);
		LoginPG.EnterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		LoginPG.ClickOnLogin();

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String Exptitle) {
	   String ActualTitle = driver.getTitle();
	   if(ActualTitle.equals(Exptitle))
	   {
		   junit.framework.Assert.assertTrue(true);
	   }
	    
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
		LoginPG.ClickLogOutBTN();

	}

	

		
	@Then("close browser")
		
	public void close_browser() {

		driver.close();
	}

}
