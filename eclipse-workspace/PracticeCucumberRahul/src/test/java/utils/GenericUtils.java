package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void switchWindowToChild() {
		Set<String> s1= driver.getWindowHandles();//windows indexes stores here
		Iterator<String> it=s1.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
	}
	

}
