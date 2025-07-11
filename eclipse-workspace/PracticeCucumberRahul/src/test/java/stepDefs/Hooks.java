package stepDefs;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.*;
import utils.TestContext;


public class Hooks {
	public TestContext context;

	public Hooks(TestContext context) {
		this.context=context; }
		
	
	@After
	public void AfterScenario() throws IOException{
		//context.testBase.WebDriverManager().quit();
		context.testBase.driver.quit();
	}
	@AfterStep
	public void AfterStep(Scenario scenario) throws IOException {
		WebDriver driver=context.testBase.driver;
		if(scenario.isFailed()) {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // holds screenshot
			byte[] fileContent=FileUtils.readFileToByteArray(src); //convert into byte formate
			scenario.attach(fileContent, "image/png", "image");
			
		}
		
	}
	

}
