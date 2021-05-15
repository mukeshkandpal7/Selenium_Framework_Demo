package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
public WebDriver driver;
	
	By emailID = By.id("user_email");
	By password = By.id("user_password");
	By submit = By.cssSelector("input[value='Log In']");
	
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmailID()
	{
		return driver.findElement(emailID);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
