package stepDefs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CheckOutpage;
import pageObjects.LandingPage;
import utils.TestContext;

public class CheckOutPageSteps {
	public WebDriver driver;
public String landingPageproductName;
public String offerPageProductName;
public TestContext context;
public CheckOutpage checkOutPage;
public CheckOutPageSteps(TestContext context) {
	this.context=context;
	this.checkOutPage=context.pageObjectManager.getCheckOutPage();
}

	@Then("^user proceeds to checkout and validate (.+) items in checkout page$")
	public void user_proceeds(String name) throws InterruptedException {
		checkOutPage.checkOutItems();
		Thread.sleep(3000);
	}
	@Then("verify user has ability to enter promo code and place order")
	public void user_ability() {
		//checkOutPage=context.pageObjectManager.getCheckOutPage();
		
		Assert.assertTrue(checkOutPage.VerifyPromoBtn());
		Assert.assertTrue(checkOutPage.VerifyPlacedOrder());
		
	}
	


}
