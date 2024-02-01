package stepDefinitions;

import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestBase;
import utils.TestContextSetup;

public class hooks {
	
	TestContextSetup testcontextsetup;
	public hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	
	@AfterMethod
	public void afterscenario() throws IOException {
		
		testcontextsetup.testbase.setup().quit();
		
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException  {
		IOSDriver driver=testcontextsetup.testbase.setup();
		if(scenario.isFailed()) {
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		
		}
	}

}
