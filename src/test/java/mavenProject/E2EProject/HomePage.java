package mavenProject.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import pageObjects.LoginPageObjects;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String username, String password) throws IOException
	{
		log.info("Successfully initialized the driver");
		driver.get(prop.getProperty("url"));
		log.info("Successfully landed to Home page");
		LandingPageObjects l = new LandingPageObjects(driver);
		l.loginClick().click();
		log.info("Successfully landed to login page");
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.getEmailID().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.submit().click();
		log.info("Successfully validated login details");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="user1@qq.qq";
		data[0][1]="password1";
		data[1][0]="user2@qq.qq";
		data[1][1]="password2";
		return data;
		
	}
	

}
