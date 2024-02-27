package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	private WebDriver driver;
	private By headTailsProduct = By.xpath("(//div[@class='st-product-name']//a[1]");
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	public ProductPage selectProduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(headTailsProduct)).click();
		return new ProductPage(driver);
	}
}
