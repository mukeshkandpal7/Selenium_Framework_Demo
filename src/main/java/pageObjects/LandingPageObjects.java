package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {
	
	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("div[class='text-center'] h2");
	By navBar=By.cssSelector("[class='nav navbar-nav navbar-right']");
	
	public LandingPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement loginClick()
	{
		return driver.findElement(login);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement navBar()
	{
		return driver.findElement(navBar);
	}

}
