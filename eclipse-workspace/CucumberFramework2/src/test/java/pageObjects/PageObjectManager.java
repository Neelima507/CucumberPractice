package pageObjects;

import org.openqa.selenium.WebDriver;

//responsible for handling all page OBJECTS
public class PageObjectManager {
	public WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	public CheckOutpage checkOutPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public LandingPage getLandingPage() {
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	public OffersPage getOffersPage() {
		offersPage=new OffersPage(driver);
		return offersPage;
	}
	public CheckOutpage getCheckOutPage() {
		checkOutPage=new CheckOutpage(driver);
		return checkOutPage;
	}
}
