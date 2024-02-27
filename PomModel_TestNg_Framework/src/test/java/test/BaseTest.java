package test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import base.BaseClass;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class BaseTest {

	WebDriver driver;
	Properties prop;
	BaseClass bc;
	HomePage homePage;
	SearchPage searchPage;
	ProductPage productPage;
	@BeforeTest
	public void setup() {
		bc = new BaseClass();
		prop = bc.init_prop();
		driver = bc.init_driver(prop);
		homePage = new HomePage(driver);
		searchPage = new SearchPage(driver);
		productPage = new ProductPage(driver);
		
		
	}
	
	@AfterMethod
	public void tesrDown() {
		driver.quit();
	}
}
