package pageObjects;
 
 
	
	
	import static org.hamcrest.MatcherAssert.assertThat;
	import static org.hamcrest.Matchers.*;
	
	import java.io.File;
	import java.io.IOException;
	import java.net.URL;
	import java.nio.file.Files;
	import java.time.Duration;
	
	import org.apache.commons.codec.binary.Base64;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.testng.annotations.Test;
	
	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.imagecomparison.SimilarityMatchingOptions;
	import io.appium.java_client.imagecomparison.SimilarityMatchingResult;
	import io.appium.java_client.ios.IOSDriver;
	import io.appium.java_client.ios.options.XCUITestOptions;
	
	
	public class image {
	  @Test
	    public void setup() throws InterruptedException, IOException
	    {
	
	    XCUITestOptions options = new XCUITestOptions();
	    options.setDeviceName("iPhone 15 Pro Max");
	      options.setApp("/Users/rubix/Downloads/SmartFleet_Mobile_App (7)/UCWMobileAPP/bin/iPhoneSimulator/Debug/SmartFleet.app");
	    options.setPlatformVersion("17.0");
	    options.setWdaLaunchTimeout(Duration.ofSeconds(20));
	    IOSDriver driver = new IOSDriver(new URL("http://192.168.1.187:4723"),options);
	    // IOSDriver driver = new IOSDriver(new URL(http://192.168.1.187:4723),options);
	
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("App Launched");
	       
	    File screenshotFile1 = ((IOSDriver) driver).getScreenshotAs(OutputType.FILE);
	
	    // Convert the File to a byte array
	    byte[] screenshotBytes;
	    try {
	        screenshotBytes = Files.readAllBytes(screenshotFile1.toPath());
	    } catch (IOException e) {
	        e.printStackTrace();
	        return; // Handle the exception appropriately
	    }
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	    // Encode the byte array as Base64
	    byte[] screenshot1 = Base64.encodeBase64(screenshotBytes);
	    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile1, new File("/Users/abiramisundarapandian/Documents/screenshots/UIKitCatalog1.jpg"), true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("Screenshot 1 captured");
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	      //  driver.findElement(AppiumBy.accessibilityId("Activity Indicators")).click();
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	            File screenshotFile2 = ((IOSDriver) driver).getScreenshotAs(OutputType.FILE);
	
	          byte[] screenshotBytes2;
	          try {
	              screenshotBytes2 = Files.readAllBytes(screenshotFile2.toPath());
	          } catch (IOException e) {
	              e.printStackTrace();
	              return; // Handle the exception appropriately
	          }
	
	    byte[] screenshot2 = Base64.encodeBase64(screenshotBytes2);
	    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile2, new File("/Users/abiramisundarapandian/Documents/screenshots/UIKitCatalog2.jpg"), true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("Screenshot 2 captured");
	
	    SimilarityMatchingResult result = driver
	            .getImagesSimilarity(screenshot1, screenshot2, new SimilarityMatchingOptions()
	                    .withEnabledVisualization());
	    assertThat(result.getVisualization().length, is(greaterThan(0)));
	    assertThat(result.getScore(), is(greaterThan(0.0)));
	  
	        System.out.println("Length " + result.getVisualization().length);
	       
	        System.out.println("Similarity Score: " + result.getScore());
	
	        if (result.getVisualization() != null) {
	              byte[] visualizationData = result.getVisualization();
	              // Handle or print the visualization data as needed
	              System.out.println("Visualization Data: " + visualizationData.length + " bytes");
	          }
	        }
	   
	
 
}