package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class TestBase {
	public   IOSDriver driver;
	
	public static final String UserName = "abirubix_MpwYig";
	public static final String  AutomateKey="tibtkNsVextHfiWvSBLQ";
	public static final String URL = "https://"+UserName+":"+AutomateKey+"@hub-cloud.browserstack.com/wd/hub";
	
	public  IOSDriver setup() throws MalformedURLException {
		
		
		
		if(driver==null) {
			
//			  DesiredCapabilities cap = new DesiredCapabilities();
//			   cap.setCapability("os_version" , "16.4") ;
//			   cap.setCapability("deviceName", "iPhone 14");
//			   cap.setCapability("app", "bs://5c6d2b4fe44a8835231a767d9e28971dd3f194c6");
//			   cap.setCapability("project", "BSDemo");
//			   cap.setCapability("name", "BrowserStack Test");
//			    driver = new IOSDriver(new URL(URL),cap);
			
//			DesiredCapabilities caps = new DesiredCapabilities();
//			caps.setCapability("deviceName", "iPhone 15 Pro");
//			caps.setCapability("os_version", "17.0");
//			caps.setCapability("Project", "BSdemo");
//			caps.setCapability("name", "Browserstack Sample Test");
//			caps.setCapability("app", "bs://258172ec654cbf6b830ebb47a248384030fafe05" );
//			IOSDriver driver = new IOSDriver(new URL(URL),caps);

			//   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


			
	
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPhone 15 Pro Max");
		options.setApp("/Users/abiramisundarapandian/Downloads/SmartFleet_Mobile_App (43)/UCWMobileAPP/bin/iPhoneSimulator/Debug/SmartFleet.app");
		options.setPlatformVersion("17.2");
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		
		 driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		
		return driver;

		
		
		
	}
	
	
}
