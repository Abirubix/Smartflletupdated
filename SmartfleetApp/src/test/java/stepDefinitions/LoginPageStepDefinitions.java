package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginPageStepDefinitions {
	 LoginPage loginpage;
	 IOSDriver driver;
	TestContextSetup testcontextsetup;
	public LoginPageStepDefinitions(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}

	
	@Given("User launches the mobile application")
	public void user_launches_the_mobile_application() throws MalformedURLException {
		
	}
	@When("User logs in with username {string} and password {string}")
	public void user_logs_in_with_username_and_password(String string, String string2) throws InterruptedException {
		   loginpage = testcontextsetup.pageobjectmanager.getLoginPage();
           loginpage.login(string, string2);
	}
	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
	  
	}

}
