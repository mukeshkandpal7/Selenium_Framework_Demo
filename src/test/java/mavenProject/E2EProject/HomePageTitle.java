package mavenProject.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import pageObjects.LoginPageObjects;
import resources.Base;

public class HomePageTitle extends Base {
	
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test
	public void validateTitle() throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPageObjects l = new LandingPageObjects(driver);
		String impTitle=l.getTitle().getText();
		Assert.assertEquals(impTitle, "FEATURED COURSES123");
		log.info("Successfully validated Landing page title");
		Assert.assertTrue(l.navBar().isDisplayed());
		log.info("Successfully validated Landing page navigation Bar");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
