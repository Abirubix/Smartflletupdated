package utils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

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

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;

import  static org.hamcrest.Matchers.*;

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

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;

public class CommonMethods {
	public IOSDriver driver;

	public CommonMethods(IOSDriver driver) {
		this.driver = driver;
	}

	public void scrollDown(WebElement ele) {
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "down");
		params.put("element", ((RemoteWebElement) ele).getId());
		driver.executeScript("mobile:scroll", params);
	}

	public void swipe(int startX, int startY, int endX, int endY) {

		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(
						finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(sequence));

	}

	public void tap(WebElement ele) {

		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(
						finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), getElementCenter(ele)))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(sequence));
	}

	public Point getElementCenter(WebElement ele) {
		Point location = ele.getLocation();
		Dimension size = ele.getSize();
		return new Point(location.getX() + size.getWidth() / 2, location.getY() + size.getHeight() / 2);

	}

	public void imagevalidation() throws InterruptedException, IOException

	{

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

		File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile1, new File(
				"/Users/abiramisundarapandian/Documents/RubixEclipseWorkspace/SmartfleetApp/src/test/java/imageValidation/image1.png"),
				true);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Screenshot 1 captured");

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

		File scrFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile2, new File(
				"/Users/abiramisundarapandian/Documents/RubixEclipseWorkspace/SmartfleetApp/src/test/java/imageValidation/image2.png"),
				true);

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
	
	public boolean imagecomparitor() throws InterruptedException, IOException {
		
		
		     File screenshotFile1 = ((IOSDriver) driver).getScreenshotAs(OutputType.FILE);

		 

		     // Convert the File to a byte array

		     byte[] screenshotBytes;

		     try {

		         screenshotBytes = Files.readAllBytes(screenshotFile1.toPath());

		     } catch (IOException e) {

		         e.printStackTrace();

		      //   return; // Handle the exception appropriately

		     }

		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		     File fnew=new File("/Users/abiramisundarapandian/Documents/screenshots/UIKitCatalog1.jpg");
//		     BufferedImage originalImage=ImageIO.read(fnew);
//		     ByteArrayOutputStream baos=new ByteArrayOutputStream();
//		     ImageIO.write(originalImage, "jpg", baos );
//		     byte[] screenshot1=baos.toByteArray();
		     
		     byte[]  screenshotBytes1 = Files.readAllBytes(fnew.toPath());
		     byte[] screenshot1 = Base64.encodeBase64(screenshotBytes1);


		     // Encode the byte array as Base64

		   //  byte[] screenshot1 = Base64.encodeBase64(screenshotBytes);

		  //   File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		  //  FileUtils.copyFile(scrFile1, new File("/Users/parthibanelangovan/Downloads/UIKitCatalog1.png"), true);

		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        System.out.println("Screenshot 1 captured");

		    

		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		       

		      //  driver.findElement(AppiumBy.accessibilityId("Activity Indicators")).click();
		    

		          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		       driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Enter your email address\"`]")).sendKeys("rajyalakshmi724@gmail.com");
			  driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Next\"`]")).click();
					
		  	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Enter your password\"`]")).sendKeys("Amma@31348286");
		    driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Log in\"`]")).click();
		    //driver.findElement(AppiumBy.accessibilityId("No")).click();

		    driver.findElement(AppiumBy.accessibilityId("Planning")).click();

		    driver.findElement(AppiumBy.accessibilityId("pan")).click();
		    Thread.sleep(3000);


		             File screenshotFile2 = ((IOSDriver) driver).getScreenshotAs(OutputType.FILE);

		 

		          byte[] screenshotBytes2 = null;

		          try {

		        	   screenshotBytes2 = Files.readAllBytes(screenshotFile2.toPath());

		          } catch (IOException e) {

		              e.printStackTrace();

		           //   return; // Handle the exception appropriately

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
				return true;

		        }

		  
		
		
	}

