package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import util.Constants;

public class HeadTailsTest extends BaseTest {
	@Test
	public void headTailsTitleValidation() {
		String actualTitle = homePage.homePageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, Constants.HEAD_TAILS_TITLE);
		
		
	}
@Test(priority=2)
public void getPriceValidation() {
	homePage.searchProduct("pedigree adult food");
	searchPage.selectProduct();
	String headTailsPrice = productPage.getPrice();
	System.out.println(headTailsPrice);
	String originalHeadTailsPrice = headTailsPrice.replace('₹', ' ').trim();
	Assert.assertEquals(originalHeadTailsPrice, "279.00");
}
}
