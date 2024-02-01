package pageObjects;

import io.appium.java_client.ios.IOSDriver;
import utils.TestContextSetup;

public class PageObjectManager {
    public LoginPage loginpage;
    public HomePage homepage;
    public PrePlanningPage preplanningpage;
    public PrePlanningMenuPage preplanningmenupage;
    public SubscriptionPage subsciptionpage;

    TestContextSetup testContextSetup;
	IOSDriver driver;
	public PageObjectManager(IOSDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage getLoginPage() {
		return loginpage = new LoginPage(driver);
	}
	
	public HomePage getHomePage() {
		return homepage = new HomePage(driver);
	}
	
	public PrePlanningPage getPrePlanningPage() {
		return preplanningpage = new PrePlanningPage(driver);
	}
	
	public PrePlanningMenuPage getPrePlanningMenuPage() {
		return preplanningmenupage = new PrePlanningMenuPage(driver);
	}
	
	public SubscriptionPage getSubscriptionPage() {
		return subsciptionpage = new SubscriptionPage(driver);
	}
	
}
