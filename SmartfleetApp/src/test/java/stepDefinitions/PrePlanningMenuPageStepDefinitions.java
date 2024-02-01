package stepDefinitions;

import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PrePlanningMenuPage;
import utils.CommonMethods;
import utils.TestContextSetup;

public class PrePlanningMenuPageStepDefinitions  {

	PrePlanningMenuPage preplanningmenupage;
	 IOSDriver driver;
	TestContextSetup testcontextsetup;
	public PrePlanningMenuPageStepDefinitions(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	
	@Then("User verifies if all the the labels are named correctly")
	public void user_verifies_if_all_the_the_labels_are_named_correctly() {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
		Assert.assertTrue(preplanningmenupage.checkLabels());
	}
	@Then("Check for single well count label")
	public void check_for_single_well_count_label() {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
		Assert.assertTrue(preplanningmenupage.singleWellCountLabel());

	}
	@Then("Check whether the single well count slider is displayed")
	public void check_whether_the_single_well_count_slider_is_displayed() {
		Assert.assertTrue(preplanningmenupage.singleWellCountSlider());

	}
	
	@Then("Check for the single well count slider with {int}%, {double}%, {double}%, {double}% and {double}%")
	public void check_for_the_single_well_count_slider_with_and(Integer int1, Double double1, Double double2, Double double3, Double double4) {
       preplanningmenupage.singleWellSliderValues(int1, double1, double2, double3, double4);
	}
	
	@Then("Check for simulfrac well count label")
	public void check_for_simulfrac_well_count_label() {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	  Assert.assertTrue(preplanningmenupage.simulfracWellCountLabel()); 
	}
	@Then("Check whether the simulfrac well count slider is displayed")
	public void check_whether_the_simulfrac_well_count_is_displayed() {
		Assert.assertTrue(preplanningmenupage.simulfracWellCountSlider());

	}
	@Then("Check for the simulfrac well count slider with {int}%, {double}%, {double}%,{double}% and {double}%")
	public void check_for_the_simulfrac_well_count_slider_with_and(Integer int1, Double double1, Double double2, Double double3, Double double4) {
	       preplanningmenupage.simulfracSliderValues(int1, double1, double2, double3, double4);

	}
	@Then("Check for Select Preferred Units label")
	public void check_for_select_preferred_units_label() {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
        Assert.assertTrue(preplanningmenupage.checkSelectPreferredUnitsLabel());
	}
	@Then("Check for API label")
	public void check_for_api_label() {
	   Assert.assertTrue(preplanningmenupage.checkAPILabel());
	}
	@Then("Check for SI label")
	public void check_for_si_label() {
		  Assert.assertTrue(preplanningmenupage.checkSILabel());

	}
	@Then("Check whether the API radio button is selected by default")
	public void check_whether_the_api_radio_button_is_selected_by_default() {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
		   Assert.assertTrue(preplanningmenupage.verifyAPIradioBtn());
	}
	@Then("Check whether SI radio button is selectable")
	public void check_whether_si_radio_button_is_selectable() {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();

		   Assert.assertTrue(preplanningmenupage.checkSIradioBtn());
	}
	@Then("Check wheteher the API radio button is selectable")
	public void chec_wheteher_the_api_radio_button_is_selectable() {
		   Assert.assertTrue(preplanningmenupage.checkAPIradioBtn());
	}
	
	@Then("Give the wrong value like {int}, {int}, {int}, {int} and {int}, by terminating condition")
	public void give_the_wrong_value_like_and_by_terminating_condition(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) throws InterruptedException {
		preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();

	       preplanningmenupage.wrongValidationsSingleWellLateralLength(int1, int2, int3, int4, int5);
	}
	@Then("It should throw error message as Value must be  {int} {double} {int}")
	public void it_should_throw_error_message_value_must_be() {
		   preplanningmenupage.errormsgSingleWellLatLength();
	}
	
	@Then("Give the wrong value like {int}, {double}, {int}, {int}, {int} by terminating condition")
	public void give_the_wrong_value_like_by_terminating_condition(Integer int1, Double double1, Integer int2, Integer int3, Integer int4) {
	   preplanningmenupage.wrongValidationSISingleWellLatLength(int1, double1, int2, int3, int4);
	}
	@Then("It should throw error message as Value must be  {int} {double} {int} when SI radio button is selected")
	public void it_should_throw_error_message_value_must_be_when_si_radio_button_is_selected(Double double1, Integer int1, Double double2, Integer int2) {
		   preplanningmenupage.errormsgSISingleWellLatLength();

	}

@Then("Check with value {double} in the Single Well Lateral Length field")
public void check_with_value_in_the_single_well_lateral_length_field(Double double1) throws InterruptedException {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    preplanningmenupage.checkDecimalAPISingleWellLatLngth(double1);
}
@Then("Verify the default value in  Single Well Lateral Length Tab\\(API Units) is {int}")
public void verify_the_default_value_in_single_well_lateral_length_tab_api_units_is(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkDefaultSingleWellLateralaAPI(), int1+"");
    
}

@Then("Verify the default value in  Single Well Lateral Length Tab\\(SI Units) is {int}")
public void verify_the_default_value_in_single_well_lateral_length_tab_si_units_is(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals( preplanningmenupage.checkDefaultSingleWellLateralSI(), int1+"");

   
}
@Then("Give values in Simulfrac Well Lateral Length. This value should be terminating condition. For API units, give values {int} and {int}")
public void give_values_in_simulfrac_well_lateral_length_this_value_should_be_terminating_condition_for_api_units_give_values_and(Integer int1, Integer int2) throws InterruptedException {
	   preplanningmenupage.wrongValidationSimulfracWellLatLengthAPI(int1, int2);

}

@Then("Error message should be displayed for Simulfrac Well Lateral Length when API unit is selected")
public void error_message_should_be_displayed_for_simulfrac_well_lateral_length_when_api_unit_is_selected() {
    preplanningmenupage.errormsgAPIsimulfracWellLatLngth();
}
@Then("Give values in Simulfrac Well Lateral Length. This value should be terminating condition. For SI units, give values {int} and {int}")
public void give_values_in_simulfrac_well_lateral_length_this_value_should_be_terminating_condition_for_si_units_give_values_under_and_above_such_as_and( Integer int3, Integer int4) {
	   preplanningmenupage.wrongValidationSimulfracWellLatLengthSI(int3, int4);

}
@Then("Error message should be displayed for Simulfrac Well Lateral Length when SI unit is selected")
public void error_message_should_be_displayed_for_simulfrac_well_lateral_length_when_si_unit_is_selected() {
    preplanningmenupage.errormsgSIsimulfracWellLatLngth();

}
@Then("Select preferred units as API Units, User have to give values as {int}, {int} and {int} in Simulfrac Well Lateral Length and the values should be accepted")
public void select_preferred_units_as_api_units_user_have_to_give_values_as_and_in_simulfrac_well_lateral_length_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage.APISimulfracWellLatLengthFieldValidations(int1, int2, int3);
}

@Then("Select preferred units as SI Units, Give values in Simulfrac Well Lateral Length as {int}, {int} and {int} in Simulfrac Well Lateral Length and the values should be accepted")
public void select_preferred_units_as_si_units_give_values_in_simulfrac_well_lateral_length_as_and_in_simulfrac_well_lateral_length_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage.SISimulfracWellLatLengthFieldValidations(int1, int2, int3);
}

@Then("Select preferred units as API Units, User have to give values as {int}, {int}, {int}, {int} and {int} in Stages per singleWell and the values should be accepted")
public void select_preferred_units_as_api_units_user_have_to_give_values_as_and_in_stages_per_single_well_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) {
	preplanningmenupage.SingleStagePerSingleWellFieldValidations(int1, int2, int3);
}
@Then("Give the value as {int}, {int} and {int} in Stages per singleWell and an alert message should be shown")
public void give_the_value_as_and_in_stages_per_single_well_and_an_alert_message_should_be_shown(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage.wrongSingleStagePerSingleWellFieldValidations(int1, int2, int3);

}
@Then("Select preferred units as SI Units, User have to give values as {int}, {int}, {int}, {int} and {int} in Stages per singleWell and the values should be accepted")
public void select_preferred_units_as_si_units_user_have_to_give_values_as_and_in_stages_per_single_well_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) {
    preplanningmenupage.SingleStagePerSingleWellFieldValidations(int1, int2, int3);
}
@Then("In API unit Verify the default value in Stages per Single Well tab is {int}")
public void api_unit_verify_the_default_value_in_stages_per_single_well_tab_is(Integer int1) {
	Assert.assertEquals(preplanningmenupage.defaultAPIStagePerSinglevalue(), int1+"");


}
@Then("In SI unit Verify the default value in Stages per Single Well tab  is {int}")
public void si_unit_verify_the_default_value_in_stages_per_single_well_tab_is(Integer int1) {
	Assert.assertEquals(preplanningmenupage.defaultSIStagePerSinglevalue(), int1+"");

}

@Then("Select preferred units as API Units, User have to give values as {int}, {int}, {int}, {int} and {int} in Stages per simulfrac Well and the values should be accepted")
public void select_preferred_units_as_api_units_user_have_to_give_values_as_and_in_stages_per_simulfrac_well_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) {
	preplanningmenupage.StagePerSimulfracWellFieldValidations(int1, int2, int3, int4, int5);

}

@Then("Give the value as {int}, {int} and {int} in Stages per simulfracWell and an alert message should be shown")
public void give_the_value_as_and_in_stages_per_simulfrac_well_and_an_alert_message_should_be_shown(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage.wrongStagesPerSimulfracWellFieldValidations(int1, int2, int3);

}
@Then("Select preferred units as SI Units, User have to give values as {int}, {int}, {int}, {int} and {int} in Stages per simulfrac Well and the values should be accepted")
public void select_preferred_units_as_si_units_user_have_to_give_values_as_and_in_stages_per_simulfrac_well_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) {
	preplanningmenupage.StagePerSimulfracWellFieldValidations(int1, int2, int3, int4, int5);

}
@Then("In API unit Verify the default value in Stages per simulfrac Well tab is {int}")
public void in_api_unit_verify_the_default_value_in_stages_per_simulfrac_well_tab_is(Integer int1) {
	Assert.assertEquals(preplanningmenupage.defaultAPIStagePerSimulfracValue(), int1+"");

}
@Then("In SI unit Verify the default value in Stages per Simulfrac  Well tab  is {int}")
public void in_si_unit_verify_the_default_value_in_stages_per_simulfrac_well_tab_is(Integer int1) {
	Assert.assertEquals(preplanningmenupage.defaultSIStagePerSimulfracValue(), int1+"");

}
@Then("Select the preferred units as API and give the value as {int}, {int} and {int} in Single well stage volume and an alert message should be shown")
public void select_the_preferred_units_as_api_and_give_the_value_as_and_in_single_well_stage_volume_and_an_alert_message_should_be_shown(Integer int1, Integer int2, Integer int3) throws InterruptedException {
    preplanningmenupage.errorValidationSingleWellStageVolumeAPI(int1, int2, int3);
}
@Then("Select the preferred units as SI and give the value as {int}, {int} and {int} in Single well stage volume and an alert message should be shown")
public void select_the_preferred_units_as_si_and_give_the_value_as_and_in_single_well_stage_volume_and_an_alert_message_should_be_shown(Integer int1, Integer int2, Integer int3) {
    preplanningmenupage.errorValidationSingleWellStageVolumeSI(int1, int2, int3);

}
@Then("Verify whether Single well Lateral Length  tab  is in \\(ft)")
public void verify_whether_single_well_lateral_length_tab_is_in_ft() {
   preplanningmenupage.APISingleWellLatLngthLabel();
}
@Then("verify whether  Simulfrac Well lateral length tab is in \\(ft)")
public void verify_whether_simulfrac_well_lateral_length_tab_is_in_ft() {
	   preplanningmenupage.APISimulfracWellLatLngthLabel();

}
@Then("verify whether Single well stage volume tab is in \\(bbl)")
public void verify_whether_single_well_stage_volume_tab_is_in_bbl() {
	   preplanningmenupage.APISingleWellStageVolumeLabel();

}
@Then("Verify whether Simulfrac well stage volume tab is in \\(bbl)")
public void verify_whether_simulfrac_well_stage_volume_tab_is_in_bbl() {
	   preplanningmenupage.APISimulfracWellStageVolumeLabel();

}
@Then("Verify whether Single well target rate tab is in \\(bpm)")
public void verify_whether_single_well_target_rate_tab_is_in_bpm() {
	   preplanningmenupage.APISingleWellTargetRateLabel();

}
@Then("Verify whether Simulfrac well target rate  tab is in \\(bpm)")
public void verify_whether_simulfrac_well_target_rate_tab_is_in_bpm() {
	   preplanningmenupage.APISimulfracWellTargetRateLabel();

}

@Then("Verify whether Single well Lateral Length  tab  is in \\(m)")
public void verify_whether_single_well_lateral_length_tab_is_in_m() {
	   preplanningmenupage.SISingleWellLatLngthLabel();

}
@Then("verify whether  Simulfrac Well lateral length tab is in \\(m)")
public void verify_whether_simulfrac_well_lateral_length_tab_is_in_m() {
	   preplanningmenupage.SISimulfracWellLatLngthLabel();

}
@Then("verify whether Single well stage volume tab is in \\(m3)")
public void verify_whether_single_well_stage_volume_tab_is_in_m3() {
	   preplanningmenupage.SISingleWellStageVolumeLabel();

}
@Then("Verify whether Simulfrac well stage volume tab is in \\(m3)")
public void verify_whether_simulfrac_well_stage_volume_tab_is_in_m3() {
	   preplanningmenupage.SISimulfracWellStageVolumeLabel();

}
@Then("Verify whether Single well target rate tab is in \\(m3\\/min)")
public void verify_whether_single_well_target_rate_tab_is_in_m3_min() {
	   preplanningmenupage.SISingleWellTargetRateLabel();

}
@Then("Verify whether Simulfrac well target rate  tab is in \\(m3\\/min)")
public void verify_whether_simulfrac_well_target_rate_tab_is_in_m3_min() {
	   preplanningmenupage.SISimulfracWellTargetRateLabel();

}
@Then("Preferred unit is in API, give values as {int} and {int} in  Single Well Lateral Length tab and the values should be accepted")
public void preferred_unit_is_in_api_give_values_as_and_in_single_well_lateral_length_tab_and_the_values_should_be_accepted(Integer int1, Integer int2) {
    preplanningmenupage.APISingleWellLatLngthvaliadtion(int1, int2);
}
@Then("Preferred unit is in SI, give values as {int} and {int} in  Single Well Lateral Length tab and the values should be accepted")
public void preferred_unit_is_in_si_give_values_as_and_in_single_well_lateral_length_tab_and_the_values_should_be_accepted(Integer int1, Integer int2) {
	preplanningmenupage.SISingleWellLatLngthvaliadtion(int1, int2);
}

@Then("Give the values {int} and {int} for API Units by terminating condition in  Simulfrac well stage volume tab")
public void give_the_values_and_for_api_units_by_terminating_condition_in_simulfrac_well_stage_volume_tab(Integer int1, Integer int2) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.errorvalidationsimulfracwellstagevolumeAPI(int1, int2);
}
@Then("Give the values {int} and {int} for SI Units by terminating condition in  Simulfrac well stage volume tab")
public void give_the_values_and_for_si_units_by_terminating_condition_in_simulfrac_well_stage_volume_tab(Integer int1, Integer int2) {
	preplanningmenupage.errorvalidationsimulfracwellstagevolumeSI(int1, int2);
}
@Then("Error message should throw to the user for Simulfrac well stage volume when API unit is selected")
public void error_message_should_throw_to_the_user_for_simulfrac_well_stage_volume_when_api_unit_is_selected() {
    Assert.assertTrue(preplanningmenupage.errormsgAPIsimulfracwellstagevolume());   
}
@Then("Error message should throw to the user for Simulfrac well stage volume when SI unit is selected")
public void error_message_should_throw_to_the_user_for_simulfrac_well_stage_volume_when_si_unit_is_selected() {
    Assert.assertTrue(preplanningmenupage.errormsgSIsimulfracwellstagevolume());   

}
@Then("Check whether the default value is {int} in Simulfrac well stage volume for SI")
public void check_whether_the_default_value_is_in_simulfrac_well_stage_volume_for_si(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
   Assert.assertEquals(preplanningmenupage.simulfracwellstagevoldefaultSI(), int1+"");
}
@Then("Select Preferred unit as SI and give values {int}, {int} and {int} in  Simulfrac well stage volume and the values should be accepted")
public void select_preferred_unit_as_si_and_give_values_and_in_simulfrac_well_stage_volume_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3) {
    preplanningmenupage.SIsimulfracwellstagevolume(int1, int2);
}
@Then("Verify whether the default value is {int} in Simulfrac well stage volume for API")
public void verify_whether_the_default_value_is_in_simulfrac_well_stage_volume_for_api(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	   Assert.assertEquals(preplanningmenupage.simulfracwellstagevoldefaultAPI(), int1+"");

}
@Then("Select preferred unit as API and give values as {int}, {int} and {int} in Simulfrac well stage volume and the values should be accepted")
public void select_preferred_unit_as_api_and_give_values_as_and_in_simulfrac_well_stage_volume_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3) {
    preplanningmenupage.APIsimulfracwellstagevolume(int1, int2);

}
@Then("Give the value by terminating condition in  Single well target rate tab for  API Units \\(bpm) such as {int}, {int} and {int}")
public void give_the_value_by_terminating_condition_in_single_well_target_rate_tab_for_api_units_bpm_such_as_and(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    preplanningmenupage.APIerrorvalidationsinglewelltargetrate(int1, int2, int3);

}
@Then("Error message should throw to the user for Single well target rate when API unit is selected")
public void error_message_should_throw_to_the_user_for_single_well_target_rate_when_api_unit_is_selected() {
   Assert.assertTrue(preplanningmenupage.APIerrormsgsinglewelltargetrate());
	
}
@Then("Give the value by terminating condition in  Single well target rate tab for  SI Units \\(bpm) such as {int}, {int} and {int}")
public void give_the_value_by_terminating_condition_in_single_well_target_rate_tab_for_si_units_bpm_such_as_and(Integer int1, Integer int2, Integer int3) {
    preplanningmenupage.SIerrorvalidationsinglewelltargetrate(int1, int2, int3);

}
@Then("Error message should throw to the user for Single well target rate when SI unit is selected")
public void error_message_should_throw_to_the_user_for_single_well_target_rate_when_si_unit_is_selected() {
	   Assert.assertTrue(preplanningmenupage.SIerrormsgsinglewelltargetrate());

}
@Then("Verify whether the default value is {int} in Single well target rate for SI")
public void verify_whether_the_default_value_is_in_single_well_target_rate_for_si(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    Assert.assertEquals(preplanningmenupage.SIdefaultsinglewelltargetrate(), int1+"");
}
@Then("Select preferred unit as SI and give values {int}, {int}, {int} and {int} in Single well target rate and the values should be accepted")
public void select_preferred_unit_as_si_and_give_values_and_in_single_well_target_rate_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4) {
	preplanningmenupage.SIsinglewelltargetratevalidations(int1, int2, int3, int4);
}
@Then("Verify whether the default value is {int} in Single well target rate for API")
public void verify_whether_the_default_value_is_in_single_well_target_rate_for_api(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    Assert.assertEquals(preplanningmenupage.APIdefaultsinglewelltargetrate(), int1+"");
}
@Then("Select preferred unit as API and give values {int}, {int} and {int} in Single well target rate and the values should be accepted")
public void select_preferred_unit_as_api_and_give_values_and_in_single_well_target_rate_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage.APIsinglewelltargetratevalidations(int1, int2, int3);

}
@Then("Verify whether the default value is {int} in Simulfrac well target rate for SI")
public void verify_whether_the_default_value_is_in_simulfrac_well_target_rate_for_si(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    Assert.assertEquals(preplanningmenupage.SIdefaultsimulfracwelltargetrate(), int1+"");

}
@Then("Select preferred unit as SI and give values {int}, {int}, {int} and {int} in Simulfrac well target rate and the values should be accepted")
public void select_preferred_unit_as_si_and_give_values_and_in_simulfrac_well_target_rate_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4) {
	preplanningmenupage.SIsimulfracwelltargetratevalidations(int1, int2, int3, int4);

}
@Then("Check if the default value is {int} for simulfrac well target rate in API unit")
public void check_if_the_default_value_is_for_simulfrac_well_target_rate_in_api_unit(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    Assert.assertEquals(preplanningmenupage.APIdefaultsimulfracwelltargetrate(), int1+"");

}
@Then("Select preferred unit as API and give values {int}, {int}, {int} and {int} in simulfrac well target rate and the values should be accepted")
public void select_preferred_unit_as_api_and_give_values_and_in_simulfrac_well_target_rate_and_the_values_should_be_accepted(Integer int1, Integer int2, Integer int3, Integer int4) {
	preplanningmenupage.APIsimulfracwelltargetratevalidations(int1, int2, int3, int4);

}
@Then("Give the value by terminating condition in  Simulfrac well target rate tab for  API Units \\(bpm) such as {int}, {int} and {int}")
public void give_the_value_by_terminating_condition_in_simulfrac_well_target_rate_tab_for_api_units_bpm_such_as_and(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
    preplanningmenupage.APIerrorvalidationsimulfracwelltargetrate(int1, int2, int3);

}
@Then("Error message should throw to the user for Simulfrac well target rate when API unit is selected")
public void error_message_should_throw_to_the_user_for_simulfrac_well_target_rate_when_api_unit_is_selected() {
	   Assert.assertTrue(preplanningmenupage.APIerrormsgsimulfracwelltargetrate());

}
@Then("Give the value by terminating condition in  Simulfrac well target rate tab for  SI Units \\(bpm) such as {int} and {int}")
public void give_the_value_by_terminating_condition_in_simulfrac_well_target_rate_tab_for_si_units_bpm_such_as_and(Integer int1, Integer int2) {
    preplanningmenupage.SIerrorvalidationsimulfracwelltargetrate(int1, int2);

}
@Then("Error message should throw to the user for Simulfrac well target rate when SI unit is selected")
public void error_message_should_throw_to_the_user_for_simulfrac_well_target_rate_when_si_unit_is_selected() {
	   Assert.assertTrue(preplanningmenupage.SIerrormsgsimulfracwelltargetrate());

}

@Then("Check the error message is displayed if values given are {double}, {double}, {double} and {double} in single hydraulic efficiency")
public void check_the_error_message_is_displayed_if_values_given_are_and_in_single_hydraulic_efficiency(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.errormsghydraulicefficiancy(double1, double2, double3, double4);
}
@Then("Give decimal values {double} and {double} in Single  hydraulic efficiency tab the values should be accepted")
public void give_decimal_values_and_in_single_hydraulic_efficiency_tab_the_values_should_be_accepted(Double double1, Double double2) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.acceptdecimalsinglehydraulicefficiancy(double1, double2);
}
@Then("Give integer values {int} and {int} in Single  hydraulic efficiency tab the values should not be accepted")
public void give_integer_values_and_in_single_hydraulic_efficiency_tab_the_values_should_not_be_accepted(Integer int1, Integer int2) {
	preplanningmenupage.notacceptintegersinglehydraulicefficiancy(int1, int2);
}
@Then("Check whether the default value is {double} in single hydraulic efficiancy for API units")
public void check_whether_the_default_value_is_in_single_hydraulic_efficiancy_for_api_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsinglehydrauliceffAPI(), double1+"");
}
@Then("Select units as API and Give values {double}, {double}, {double} and {double} in Single hydraulic efficiency Tab and the values should be accepted")
public void select_units_as_api_and_give_values_and_in_single_hydraulic_efficiency_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.singlehydraulicefficiancyvalidationAPI(double1, double2, double3, double4);
}
@Then("Check whether the default value is {double} in single hydraulic efficiancy for SI units")
public void check_whether_the_default_value_is_in_single_hydraulic_efficiancy_for_si_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsinglehydrauliceffSI(), double1+"");

}
@Then("Select units as SI and Give values {double}, {double}, {double} and {double} in Single hydraulic efficiency Tab and the values should be accepted")
public void select_units_as_si_and_give_values_and_in_single_hydraulic_efficiency_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.singlehydraulicefficiancyvalidationSI(double1, double2, double3, double4);

}
@Then("Check the error message is displayed if values given are {double}, {double}, {double} and {double} in simulfrac hydraulic efficiency")
public void check_the_error_message_is_displayed_if_values_given_are_and_in_simulfrac_hydraulic_efficiency(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.errormsgsimulfrachydraulicefficiancy(double1, double2, double3, double4);
}
@Then("Check whether the default value is {double} in simulfrac hydraulic efficiancy for API units")
public void check_whether_the_default_value_is_in_simulfrac_hydraulic_efficiancy_for_api_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsimulfrachydrauliceffAPI(), double1+"");
}
@Then("Select units as API and Give values {double}, {double}, {double} and {double} in simulfrac hydraulic efficiency Tab and the values should be accepted")
public void select_units_as_api_and_give_values_and_in_simulfrac_hydraulic_efficiency_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.simulfrachydraulicefficiancyvalidationAPI(double1, double2, double3, double4);

}
@Then("Check whether the default value is {double} in simulfrac hydraulic efficiancy for SI units")
public void check_whether_the_default_value_is_in_simulfrac_hydraulic_efficiancy_for_si_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsimulfrachydrauliceffSI(), double1+"");

}
@Then("Select units as SI and Give values {double}, {double}, {double} and {double} in simulfrac hydraulic efficiency Tab and the values should be accepted")
public void select_units_as_si_and_give_values_and_in_simulfrac_hydraulic_efficiency_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.simulfrachydraulicefficiancyvalidationSI(double1, double2, double3, double4);
}
@Then("Give decimal values {double} and {double} in simulfrac  hydraulic efficiency tab the values should be accepted")
public void give_decimal_values_and_in_simulfrac_hydraulic_efficiency_tab_the_values_should_be_accepted(Double double1, Double double2) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.acceptdecimalsimulfrachydraulicefficiancy(double1, double2);
}
@Then("Give integer values {int} and {int} in simulfrac  hydraulic efficiency tab the values should not be accepted")
public void give_integer_values_and_in_simulfrac_hydraulic_efficiency_tab_the_values_should_not_be_accepted(Integer int1, Integer int2) {
	preplanningmenupage.notacceptintegersimulfrachydraulicefficiancy(int1, int2);
}
@Then("Give decimal values {double} and {double} in Single stage transition time  tab the values should be accepted")
public void give_decimal_values_and_in_single_stage_transition_time_tab_the_values_should_be_accepted(Double double1, Double double2) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.acceptdecimalsinglestagetransitiontime(double1, double2);

}
@Then("Give integer values {int} and {int} in Single stage transition time  tab the values should not be accepted")
public void give_integer_values_and_in_single_stage_transition_time_tab_the_values_should_not_be_accepted(Integer int1, Integer int2) {
	preplanningmenupage.notacceptintegersinglestagetransitiontime(int1, int2);

}
@Then("Check whether the default value is {double} in Single stage transition time for API units")
public void check_whether_the_default_value_is_in_single_stage_transition_time_for_api_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsinglestagetransitionAPI(), double1+"");

}
@Then("Select units as API and Give values  {double}, {double}, {double} and {double} in Single stage transition time Tab and the values should be accepted")
public void select_units_as_api_and_give_values_and_in_single_stage_transition_time_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.singlestagetransitionvalidationAPI(double1, double2, double3, double4);

}
@Then("Check the error message is displayed if values given are {double}, {double}, {double} and {double} in Single stage transition time")
public void check_the_error_message_is_displayed_if_values_given_are_and_in_single_stage_transition_time(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.errormsgsinglestagetransitiontime(double1, double2, double3, double4);

}
@Then("Check whether the default value is {double} in Single stage transition time for SI units")
public void check_whether_the_default_value_is_in_single_stage_transition_time_for_si_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsinglestagetransitionSI(), double1+"");

}
@Then("Select units as SI and Give values  {double}, {double}, {double} and {double} in Single stage transition time Tab and the values should be accepted")
public void select_units_as_si_and_give_values_and_in_single_stage_transition_time_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.singlestagetransitionvalidationSI(double1, double2, double3, double4);

}

@Then("Check whether the default value is {double} in Simulfrac stage transition time for SI units")
public void check_whether_the_default_value_is_in_simulfrac_stage_transition_time_for_si_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsimulfracstagetransitionSI(), double1+"");

}
@Then("Select units as SI and Give values  {double}, {double}, {double} and {double} in Simulfrac stage transition time Tab and the values should be accepted")
public void select_units_as_si_and_give_values_and_in_simulfrac_stage_transition_time_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
   
	preplanningmenupage.simulfracstagetransitionvalidationSI(double1, double2, double3, double4);
}
@Then("Check whether the default value is {double} in Simulfrac stage transition time for API units")
public void check_whether_the_default_value_is_in_simulfrac_stage_transition_time_for_api_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsimulfracstagetransitionAPI(), double1+"");
}
@Then("Select units as API and Give values  {double}, {double}, {double} and {double} in Simulfrac stage transition time Tab and the values should be accepted")
public void select_units_as_api_and_give_values_and_in_simulfrac_stage_transition_time_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.simulfracstagetransitionvalidationAPI(double1, double2, double3, double4);
}
@Then("Give decimal values {double} and {double} in Simulfrac stage transition time  tab the values should be accepted")
public void give_decimal_values_and_in_simulfrac_stage_transition_time_tab_the_values_should_be_accepted(Double double1, Double double2) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.acceptdecimalsimulfracstagetransitiontime(double1, double2);
}
@Then("Give integer values {int} and {int} in Simulfrac stage transition time  tab the values should not be accepted")
public void give_integer_values_and_in_simulfrac_stage_transition_time_tab_the_values_should_not_be_accepted(Integer int1, Integer int2) {
	preplanningmenupage.notacceptintegersimulfracstagetransitiontime(int1, int2);

}
@Then("Check the error message is displayed if values given are {double}, {double}, {double} and {double} in Simulfrac stage transition time")
public void check_the_error_message_is_displayed_if_values_given_are_and_in_simulfrac_stage_transition_time(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.errormsgsimulfractagetransitiontime(double1, double2, double3, double4);
}
@Then("Check the error message is displayed if values given are {double}, {double}, {double} and {double} in Wireline Run time")
public void check_the_error_message_is_displayed_if_values_given_are_and_in_wireline_run_time(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.errormsgwirelessruntime(double1, double2, double3, double4);

}
@Then("Check whether the default value is {double} in Wireline Run time for SI units")
public void check_whether_the_default_value_is_in_wireline_run_time_for_si_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultwirelineruntimeSI(), double1+"");
}
@Then("Select units as SI and Give values  {double}, {double}, {double} and {double} in Wireline Run time Tab and the values should be accepted")
public void select_units_as_si_and_give_values_and_in_wireline_run_time_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.wirelinerunvalidationSI(double1, double2, double3, double4);

}
@Then("Check whether the default value is {double} in Wireline Run time for API units")
public void check_whether_the_default_value_is_in_wireline_run_time_for_api_units(Double double1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultwirelineruntimeAPI(), double1+"");

}
@Then("Select units as API and Give values  {double}, {double}, {double} and {double} in Wireline Run time Tab and the values should be accepted")
public void select_units_as_api_and_give_values_and_in_wireline_run_time_tab_and_the_values_should_be_accepted(Double double1, Double double2, Double double3, Double double4) {
	preplanningmenupage.wirelinerunvalidationAPI(double1, double2, double3, double4);
}
@Then("Give decimal values {double} and {double} in Wireline Run time  tab the values should be accepted")
public void give_decimal_values_and_in_wireline_run_time_tab_the_values_should_be_accepted(Double double1, Double double2) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.acceptdecimalwirelineruntime(double1, double2);
}
@Then("Give integer values {int} and {int} in Wireline Run time tab the values should not be accepted")
public void give_integer_values_and_in_wireline_run_time_tab_the_values_should_not_be_accepted(Integer int1, Integer int2) {
	preplanningmenupage.notacceptintegerwirelineruntime(int1, int2);

}

@Then("User slides the simulfrac well count slider to {int}%")
public void user_slides_the_simulfrac_well_count_slider_to(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	preplanningmenupage.slidesimulfracsliderto100();
}
@Then("clicks on Express Fiber Well dropdown")
public void clicks_on_express_fiber_well_dropdown() {
	preplanningmenupage.clickexpressfiberwell();

}
@Then("clicks on SF1, SF2 and Z1 in the dropdown and the values will be displayed in Express Fiber Well field")
public void clicks_on_sf1_sf2_and_z1_in_the_dropdown_and_the_values_will_be_displayed_in_express_fiber_well_field() {
	preplanningmenupage.clickoptionsexpressfiberwell();

}
@When("clicked on clear all, all the selected options will be deselected and cleared in Express Fiber Well field")
public void clicked_on_clear_all_all_the_selected_options_will_be_deselected_and_cleared_in_express_fiber_well_field() {
	preplanningmenupage.clickonclearallexpressfiberwell();

}
@Then("Select the preferred units as API  in Single well stage volume verify whether the default value is {int}")
public void select_the_preferred_units_as_api_in_single_well_stage_volume_verify_whether_the_default_value_is(Integer int1) {
	preplanningmenupage=testcontextsetup.pageobjectmanager.getPrePlanningMenuPage();
	Assert.assertEquals(preplanningmenupage.checkdefaultsinglewellstagevolAPI(), int1+"");

}
@Then("Give values {int}, {int} and {int}")
public void give_values_and(Integer int1, Integer int2, Integer int3) {
	preplanningmenupage.APIsinglewellstagevolvalidation(int1, int2, int3);
}
}
