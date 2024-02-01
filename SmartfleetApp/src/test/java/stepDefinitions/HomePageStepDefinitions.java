package stepDefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class HomePageStepDefinitions {
	 HomePage homepage;
	 IOSDriver driver;
	TestContextSetup testcontextsetup;
	public HomePageStepDefinitions(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@Then("User clicks on the pre-planning icon in homepage")
	public void user_clicks_on_the_pre_planning_icon_in_homepage() throws InterruptedException {
	    homepage = testcontextsetup.pageobjectmanager.getHomePage();
	    Thread.sleep(2000);
	    homepage.clickPrePlanning();
	    
	}
	
	@Then("User clicks on the ActivePads icon in homepage")
	public void user_clicks_on_the_active_pads_icon_in_homepage() throws InterruptedException {
	    homepage = testcontextsetup.pageobjectmanager.getHomePage(); 
	    homepage.clickactivepad();

	}
}
