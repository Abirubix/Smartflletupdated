package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage  {
	
	public 	IOSDriver driver;
	public HomePage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "Planning" )
	private WebElement preplanningicon;
	
	@iOSXCUITFindBy(accessibility = "No" )
	private WebElement noalert;
	
	@iOSXCUITFindBy(accessibility = "Active Pads" )
	private WebElement activepad;
	
	public void clickPrePlanning() throws InterruptedException {
	//	noalert.click();
		Thread.sleep(1000);

		preplanningicon.click();
		
	}
	public void clickactivepad() {
		activepad.click();
	}
}
