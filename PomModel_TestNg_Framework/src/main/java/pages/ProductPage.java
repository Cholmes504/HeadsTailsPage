package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	private WebDriver driver;
	private By headTailsSize = By.xpath("//label[@data-value='1.2 kg']");
	private By headTailsPrice = By.cssSelector(".price-item--sale");
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public String getPrice() {
		
		driver.findElement(headTailsSize).click();
		String price = driver.findElement(headTailsPrice).getText();
		return price;
	}
}
