package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PrePlanningPage;
import utils.TestContextSetup;

public class PrePlanningStepDefinitions {

	PrePlanningPage preplanningpage;
	TestContextSetup testcontextsetup;

	public PrePlanningStepDefinitions(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@Then("User clicks on Frac Sequence Planning in menu tab")
	public void user_clicks_on_frac_sequence_planning_in_menu_tab() throws InterruptedException {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Thread.sleep(2000);

		preplanningpage.clickFracSequencePlanningArrow();
	}

	@Then("User should be able to see the title {string}")
	public void user_should_be_able_to_see_the_title(String string) {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertEquals(preplanningpage.fracSequenceTitle(), string);

	}

	@Then("User should be able to see the {int}-bar menu icon")
	public void user_should_be_able_to_see_the_bar_menu_icon(Integer int1) {

	}

	@Then("User should be able to see a slider for intervals.")
	public void user_should_be_able_to_see_a_slider_for_intervals() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertTrue(preplanningpage.sliderDisplayed());
	}

	@Then("User should be able to slide at {double}%, {double}%, {double}% and {double}% andshould be able to see corresponding interval is displayed on top of the dot.")
	public void user_should_be_able_to_slide_at_and_andshould_be_able_to_see_corresponding_interval_is_displayed_on_top_of_the_dot(
			Double double1, Double double2, Double double3, Double double4) throws InterruptedException {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		preplanningpage.sliderValues(double1, double2, double3, double4);
	}

	@Then("User should be able to see the well and stage schematic")
	public void user_should_be_able_to_see_the_well_and_stage_schematic() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertTrue(preplanningpage.wellSchematicDisplay());
	}

	@Then("User should see the display for Elapsed Time")
	public void user_should_see_the_display_for_elapsed_time() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertTrue(preplanningpage.elapsedtimedisplay());

	}

	@Then("User should be able to see the display for Avg. Pumping Hours per Day")
	public void user_should_be_able_to_see_the_display_for_avg_pumping_hours_per_day() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertTrue(preplanningpage.avgPumpingHoursDisplay());
	}

	@Then("User should be able to see the Avg Volume per Day")
	public void user_should_be_able_to_see_the_avg_volume_per_day() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertTrue(preplanningpage.avgVolumePerDayDisplay());
	}

	@Then("User should be able to see the frac sequence display")
	public void user_should_be_able_to_see_the_frac_sequence_display() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		Assert.assertTrue(preplanningpage.fracSequenceDisplay());
	}

	@Then("User should be able to scroll down to see the entire content of the page")
	public void user_should_be_able_to_scroll_down_to_see_the_entire_content_of_the_page() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		preplanningpage.scrollable(192, 836, 191, 125);
	}

	@When("tapped on the right corner of the plot")
	public void tapped_on_the_right_corner_of_the_plot() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
		preplanningpage.tapLandscape();
	}

	@Then("the well should be displayed in landscape mode")
	public void the_well_should_be_displayed_in_landscape_mode() {
       Assert.assertTrue(preplanningpage.verifyWellLandscapeMode());
	}

	@Then("The Avg.Pumping Hours should be in hours and should have 1 decimal point")
	public void the_avg_pumping_hours_should_be_in_hours_and_should_not_have_decimal_point() {
         Assert.assertTrue(preplanningpage.avgPumpingHoursValidation());
	}

	@Then("User should see the pre-job planning tab.")
	public void user_should_see_the_pre_job_planning_tab() throws InterruptedException {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
         Assert.assertTrue(preplanningpage.prePlanningTabDisplayed());
	}

	@Then("The Elapsed Time should be in hours and should not have decimal point")
	public void the_elapsed_time_should_be_in_hours_and_should_not_have_decimal_point() {
         Assert.assertTrue(preplanningpage.elapsedTimeValidation());
	}

	@Then("User Check for Navigation cart > on right side of the title")
	public void user_check_for_navigation_cart_on_right_side_of_the_title() {
       // Assert.assertEquals(preplanningpage.navigationCaretDisplay(),"true");
	}

	@Then("The Avg Volume per Day value should not have decimals and should be in bbls")
	public void the_avg_volume_per_day_value_should_not_have_decimals_and_should_be_in_bbls() {
        Assert.assertTrue(preplanningpage.avgvolumeperdayvalidation());

	}
	
	@Then("Tap on the icon to close landscape mode then it should display the portrait mode")
	public void tap_on_the_icon_to_close_landscape_mode_then_it_should_display_the_portrait_mode() {
	    Assert.assertTrue(preplanningpage.closeLandscapeMode());
	}
	@Then("verify the elapsed time label and elapsed time value to be {int} days")
	public void verify_the_elapsed_time_label_and_elapsed_time_value_to_be_days(Integer int1) {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
       Assert.assertTrue(preplanningpage.verifyelapsedtime()); 
	}
	@Then("User should be able to see the metric are displayed as two tiles. Tile one with Elapsed time with original and express fiber. Tile two with stages measured by express fiber")
	public void user_should_be_able_to_see_the_metric_are_displayed_as_two_tiles_tile_one_with_elapsed_time_with_original_and_express_fiber_tile_two_with_stages_measured_by_express_fiber() {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
        Assert.assertTrue(preplanningpage.metricdisplay());

	}
	@Then("Screenshot will be captured for the well landscape mode")
	public void screenshot_will_be_captured_for_the_well_landscape_mode() {
	   
	}
	@Then("The screenshot captured currently will be compared pixel by pixel with the original screenshot")
	public void the_screenshot_captured_currently_will_be_compared_pixel_by_pixel_with_the_original_screenshot() throws InterruptedException, IOException {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
        preplanningpage.imagecomparison();
	}
	
	@Given("Image Validation")
	public void image_validation() throws InterruptedException, IOException {
		preplanningpage = testcontextsetup.pageobjectmanager.getPrePlanningPage();
       Assert.assertTrue(preplanningpage.imagecomparison());
	}

}
