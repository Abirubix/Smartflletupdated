package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage   {

	public 	IOSDriver driver;
	public LoginPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	
	@iOSXCUITFindBy(iOSClassChain  ="**/XCUIElementTypeTextField[`value == \"Enter your email address\"`]" )
	private WebElement username;
	
	@iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeButton[`label == \"Next\"`]" )
	private WebElement clickNext;
	
	@iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeTextField[`value == \"Enter your password\"`]" )
	private WebElement password;
	
	@iOSXCUITFindBy(iOSClassChain  ="**/XCUIElementTypeStaticText[`label == \"Log in\"`]" )
	private WebElement loginBtn;
	
	public void login(String usernamevalue , String passwordvalue) throws InterruptedException {
		if(driver== null) {
			System.out.println("driver is null");
		}
		username.click();
		System.out.println(usernamevalue);
	   username.sendKeys(usernamevalue);
		clickNext.click();
		Thread.sleep(1000);
		password.sendKeys(passwordvalue);
		Thread.sleep(2000);

		loginBtn.click();
	}
	
	
	
	
}
