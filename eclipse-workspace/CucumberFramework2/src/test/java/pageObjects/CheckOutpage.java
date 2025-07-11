package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutpage {

	public WebDriver driver;
	By cartBag=By.cssSelector("img[alt='Cart']");
	By checkOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn=By.cssSelector(".promoCode");
	By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	
	public CheckOutpage(WebDriver driver) {
		this.driver=driver;
	}
	public void checkOutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	public boolean VerifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
		
	}
	public boolean VerifyPlacedOrder() {
		return driver.findElement(placeOrder).isDisplayed();
		
	}
	
}