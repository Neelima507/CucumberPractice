package stepDefs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TestContext;

public class OffersPageSteps {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContext context;
	public OffersPage offersPage;
	public PageObjectManager pageObjectManager;
	public OffersPageSteps(TestContext context) {
		this.context=context;
		this.pageObjectManager = context.pageObjectManager;
	}
	@Then("^user searched for (.+) in offers page to check  product exist with same name$")
	public void user_searched_for_in_offers_page_to_check_product_exist_with_same_name(String shortName) throws InterruptedException {
		switchToOffersPage();
		OffersPage OffersPage=context.pageObjectManager.getOffersPage();
		context.pageObjectManager.getOffersPage().searchItem(shortName);
		offerPageProductName=context.pageObjectManager.getOffersPage().getProductName();
		
		}
	public void switchToOffersPage() {
		
		LandingPage landingPage=context.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		context.genericUtils.switchWindowToChild();
		

	}
	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerPageProductName, context.landingPageproductName);
		System.out.println("DONEEEEEEEE");
	}

}
