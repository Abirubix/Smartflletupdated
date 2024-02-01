package stepDefinitions;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SubscriptionPage;
import utils.TestContextSetup;

public class SubscriptionPageStepDefinition {
	SubscriptionPage subscriptionpage;
	 IOSDriver driver;
	TestContextSetup testcontextsetup;
	public SubscriptionPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@Given("Verify the updated text in subscription tab")
	public void verify_the_updated_text_in_subscription_tab() {
		   subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
		   subscriptionpage.subscriptionUpdatedText();
	}
	
	

	@Given("Verify two options are presented under the kind of subscription")
	public void verify_two_options_are_presented_under_the_kind_of_subscription() {
		   subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
		   subscriptionpage.verifyKindofSubscription();
	}
	@Then("Verify the editing functionality for pads with  subscription\\(Near well, cross Well or Complete)")
	public void verify_the_editing_functionality_for_pads_with_subscription_near_well_cross_well_or_complete() throws InterruptedException {
		   subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
		   subscriptionpage.verifyeditfunctionalitywithsubscription();
	}
	@Then("Verify the editing functionality for pads with no subscription")
	public void verify_the_editing_functionality_for_pads_with_no_subscription() throws InterruptedException {
		   subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
		   subscriptionpage.verifyeditfunctionalitynosubscription();
	}

@Then("Verify the subscription options for the pad")
public void verify_the_subscription_options_for_the_pad() throws InterruptedException {
	   subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
	   subscriptionpage.verifysubscriptionoption();
}
@Then("Verify the selection option and display of checked icons in the pad subscription screen while came through pad subscription")
public void verify_the_selection_option_and_display_of_checked_icons_in_the_pad_subscription_screen_while_came_through_pad_subscription() {
   
}
@Then("Verify the presence of link for Read more about subscription options while came through pad subscription")
public void verify_the_presence_of_link_for_read_more_about_subscription_options_while_came_through_pad_subscription() throws InterruptedException {
	subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
	   subscriptionpage.verifylinkforreadmoresub();
}
@Then("Verify the list of pads presented in pad subscription screen")
public void verify_the_list_of_pads_presented_in_pad_subscription_screen() throws InterruptedException {
	subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
	subscriptionpage.verifylistofpads();
}
@Then("Verify the list of subscriptions")
public void verify_the_list_of_subscriptions() throws InterruptedException {
	subscriptionpage = testcontextsetup.pageobjectmanager.getSubscriptionPage();
	subscriptionpage.verifylistofsunbscriptions();
}

@Then("Verify the details in user icon page for pad subscription")
public void verify_the_details_in_user_icon_page_for_pad_subscription() {
    
}

@Then("Verify the link presented for no subscription page in user icon page")
public void verify_the_link_presented_for_no_subscription_page_in_user_icon_page() {
   
}

}
