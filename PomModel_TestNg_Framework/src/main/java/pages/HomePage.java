package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	
	private By headTailSearchBar = By.xpath("(//input[@name='q'])[2]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String homePageTitle() {
		
		return driver.getTitle();
		
	}
	public SearchPage searchProduct(String search) {
		driver.findElement(headTailSearchBar).sendKeys(search,Keys.ENTER);	
		return new SearchPage(driver);
	}
	
}
