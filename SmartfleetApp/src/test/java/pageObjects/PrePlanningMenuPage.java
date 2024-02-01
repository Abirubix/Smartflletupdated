package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utils.CommonMethods;

public class PrePlanningMenuPage extends CommonMethods {

	public IOSDriver driver;

	public PrePlanningMenuPage(IOSDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(accessibility = "Select Preferred Units:")
	private WebElement selectunitslabel;

	@iOSXCUITFindBy(accessibility = "API")
	private WebElement apilabel;

	@iOSXCUITFindBy(accessibility = "radioEnable")
	private WebElement apiradiobtn1;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	private WebElement apiradiobtn;

	@iOSXCUITFindBy(accessibility = "SI")
	private WebElement silabel;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	private WebElement siradiobtn;

	@iOSXCUITFindBy(accessibility = "Single Well Count")
	private WebElement singlewellcountlabel;

	@iOSXCUITFindBy(accessibility  = "WellCount_z")
	private WebElement singlewellcountslider;

	@FindBy(xpath = "//XCUIElementTypeSlider[@name=\"WellCount_z\"]")
	private WebElement singlewellcountslider1;

	@iOSXCUITFindBy(accessibility = "Simulfrac Well Count")
	private WebElement simulfracwellcountlabel;

	@FindBy(xpath = "//XCUIElementTypeSlider[@name=\"WellCount_s\"]")
	private WebElement simulfracwellcountslider;

	@iOSXCUITFindBy(accessibility = "Express Fiber Well (s)")
	private WebElement expressfiberwelllabel;

	@iOSXCUITFindBy(accessibility = "Single Well Lateral Length (ft)")
	private WebElement singlewelllatlengthlabel;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SingleWellLateralLengthEntry\"]")
	private WebElement singlewelllatlengthfield;

	@iOSXCUITFindBy(accessibility = "Value must be between 1000 and 20000")
	private WebElement singlewelllatlengthalert;

	@iOSXCUITFindBy(accessibility = "Value must be between 300 and 6000")
	private WebElement singlewelllatlengthSIalert;

	@iOSXCUITFindBy(accessibility = "Simulfrac Well Lateral Length (ft)")
	private WebElement simulfracwelllatlengthlabel;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SimulFracLateralLengthEntry\"]")
	private WebElement simulfracwelllatlengthfield;

	@iOSXCUITFindBy(accessibility = "Value must be between 1000 and 20000")
	private WebElement simulfracwelllatlengthAPIalert;

	@iOSXCUITFindBy(accessibility = "Value must be between 300 and 6000")
	private WebElement simulfracwelllatlengthSIalert;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"StagesPerSingleWellEntry\"]")
	private WebElement stagespersinglewellfield;

	@iOSXCUITFindBy(accessibility = "Value must be between 1 and 150")
	private WebElement stagespersinglewellAPISIalert;

	@iOSXCUITFindBy(accessibility = "Stages per Single Well")
	private WebElement stagespersinglewelllabel;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"StagesPerSimulFracWellEntry\"]")
	private WebElement stagespersimulfracwellfield ;

	@iOSXCUITFindBy(accessibility = "Value must be between 1 and 150")
	private WebElement APSIIalertstagepersimulfracwell;

	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SingleWellStageVolumeEntry\"]")
	private WebElement singlewellstagevolumefield;

	@iOSXCUITFindBy(accessibility = "Value must be between 100 and 30000")
	private WebElement APIalertsinglewellstagevolume;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 20 and 4500")
	private WebElement SIalertsinglewellstagevolume;
	
	
	@iOSXCUITFindBy(accessibility = "Stages per simulfrac Well")
	private WebElement stagespersimulfracwelllabel;

	@iOSXCUITFindBy(accessibility = "Single well Stage Volume (bbl)")
	private WebElement APIsinglewellstagewellvlmlabel;
	
	@iOSXCUITFindBy(accessibility = "Simulfrac well Stage Volume (bbl)")
	private WebElement APIsimulfracwellstagewellvlmlabel;
	
	@iOSXCUITFindBy(accessibility = "Single well Target Rate (bpm)")
	private WebElement APIsinglewelltargetratelabel;
	
	@iOSXCUITFindBy(accessibility = "Simulfrac Target Rate (bpm)")
	private WebElement APIsimulfracwelltargetratelabel;
	
	@iOSXCUITFindBy(accessibility = "Single Well Lateral Length (m)")
	private WebElement SIsinglewelllatlengthlabel;
	
	@iOSXCUITFindBy(accessibility = "Simulfrac Well Lateral Length (m)")
	private WebElement SIsimulfracwelllatlengthlabel;
	
	@iOSXCUITFindBy(accessibility = "Single well Stage Volume (m3)")
	private WebElement SIsinglewellstagevollabel;
	
	@iOSXCUITFindBy(accessibility = "Simulfrac well Stage Volume  (m3)")
	private WebElement SIsimulfracwellstagevollabel;
	
	@iOSXCUITFindBy(accessibility = "Single well Target Rate (m3/min)")
	private WebElement SIsinglewelltargetratelabel;
	
	@iOSXCUITFindBy(accessibility = "Simulfrac Target Rate (m3/min)")
	private WebElement SIsimulfracwelltargetratelabel;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SimulfracWellStageVolumeEntry\"]")
	private WebElement simulfracwellstagevolfield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 100 and 30000")
	private WebElement  APIalertsimulfracwellstagevol;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 20 and 4500")
	private WebElement  SIalertsimulfracwellstagevol;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SingleWellTargetRateEntry\"]")
	private WebElement  singlewelltargetratefield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 5 and 200")
	private WebElement  APIalertsinglewelltargetrate;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 1 and 30")
	private WebElement  SIalertsinglewelltargetrate;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SimulfracTargetRateEntry\"]")
	private WebElement  simulfractargetratefield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 5 and 200")
	private WebElement  APIalertsimulfractargetrate;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 0 and 30")
	private WebElement  SIalertsimulfractargetrate;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SingleHydraulicEfficiencyEntry\"]")
	private WebElement  singlehydraulicefficiancyfield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 0.1 and 1.0")
	private WebElement  APISIalertsinglehydraulicefficiancy;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SimulfracHydraulicEfficiencyEntry\"]")
	private WebElement  simulfrachydraulicefficiancyfield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 0.1 and 1.0")
	private WebElement  APISIalertsimulfrachydraulicefficiancy;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SingleStageYTransitionTimeEntry\"]")
	private WebElement  singlestagetransitiontimefield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 0.1 and 5.0")
	private WebElement  APISIalertsinglestagetransitiontime;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SimulfracStageTransitionEntry\"]")
	private WebElement  simulfracstagetransitiontimefield;
	
	@iOSXCUITFindBy(accessibility = "Value must be between 0.1 and 5.0")
	private WebElement  APISIalertsimulfracstagetransitiontime;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"WirelineEntry\"]")
	private WebElement  wirelessruntimefield;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Value must be between 0.1 and 5.0\"]")
	private WebElement  APISIalertwirelesstransitiontime;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"ExpressWell\"]")
	private WebElement  expressfiberwellfield;
	
	@iOSXCUITFindBy(accessibility = "SF1")
	private WebElement  sf1;
	
	@iOSXCUITFindBy(accessibility = "Z1")
	private WebElement  z1;
	
	@iOSXCUITFindBy(accessibility = "SF2")
	private WebElement  sf2;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear All\"]")
	private WebElement  claearall;
	

	public boolean checkLabels() {
		boolean flag = false;
		List<WebElement> list = Stream.of(selectunitslabel, apilabel, silabel, singlewellcountlabel,
				simulfracwellcountlabel, expressfiberwelllabel, singlewelllatlengthlabel, simulfracwelllatlengthlabel,
				stagespersinglewelllabel).collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isDisplayed())
				flag = true;
			else {
				flag = false;
				break;
			}
		}

		// List<WebElement>
		return flag;
	}

	public boolean singleWellCountLabel() {

		return singlewellcountlabel.isDisplayed();
	}

	public boolean singleWellCountSlider() {

		return singlewellcountslider.isDisplayed();
	}

	public void singleWellSliderValues(Integer int1, Double double1, Double double2, Double double3, Double double4) {
		singlewellcountslider1.sendKeys(int1 + "");
		singlewellcountslider1.sendKeys(double1 + "");
		singlewellcountslider1.sendKeys(double2 + "");
		singlewellcountslider1.sendKeys(double3 + "");
		singlewellcountslider1.sendKeys(double4 + "");

	}

	public boolean simulfracWellCountLabel() {
		return simulfracwellcountlabel.isDisplayed();
	}

	public boolean simulfracWellCountSlider() {
		return simulfracwellcountslider.isDisplayed();
	}

	public void simulfracSliderValues(Integer int1, Double double1, Double double2, Double double3, Double double4) {
		simulfracwellcountslider.sendKeys(int1 + "");
		simulfracwellcountslider.sendKeys(double1 + "");
		simulfracwellcountslider.sendKeys(double2 + "");
		simulfracwellcountslider.sendKeys(double3 + "");
		simulfracwellcountslider.sendKeys(double4 + "");

	}

	public boolean checkSelectPreferredUnitsLabel() {
		return selectunitslabel.isDisplayed();
	}

	public boolean checkAPILabel() {
		return apilabel.isDisplayed();
	}

	public boolean checkSILabel() {
		return silabel.isDisplayed();
	}

	public boolean verifyAPIradioBtn() {
		return apiradiobtn1.isEnabled();
	}

	public boolean checkSIradioBtn() {
		siradiobtn.click();
		return siradiobtn.isEnabled();
	}

	public boolean checkAPIradioBtn() {
		apiradiobtn.click();
		return apiradiobtn.isEnabled();
	}

	public void wrongValidationsSingleWellLateralLength(Integer int1, Integer int2, Integer int3, Integer int4,
			Integer int5) throws InterruptedException {
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int1 + "");
		singlewelllatlengthalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int2 + "");
		singlewelllatlengthalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int3 + "");
		singlewelllatlengthalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int4 + "");
		singlewelllatlengthalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int5 + "");
		Thread.sleep(1000);
		singlewelllatlengthalert.isDisplayed();
	}

	public void errormsgSingleWellLatLength() {
		singlewelllatlengthalert.isDisplayed();

	}

	public void wrongValidationSISingleWellLatLength(Integer int1, Double double1, Integer int2, Integer int3,
			Integer int4) {
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int1 + "");
		singlewelllatlengthSIalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int2 + "");
		singlewelllatlengthSIalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int3 + "");
		singlewelllatlengthSIalert.isDisplayed();
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int4 + "");
		singlewelllatlengthSIalert.isDisplayed();
	//	singlewelllatlengthfield.clear();
	//	singlewelllatlengthfield.sendKeys(double1 + "");
	//	singlewelllatlengthSIalert.isDisplayed();
	}

	public void errormsgSISingleWellLatLength() {
		singlewelllatlengthSIalert.isDisplayed();

	}

	public void checkDecimalAPISingleWellLatLngth(Double double1) throws InterruptedException {
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(double1 + "");
		Thread.sleep(2000);
		singlewelllatlengthalert.isDisplayed();

	}

	public String checkDefaultSingleWellLateralaAPI() {
		return singlewelllatlengthfield.getText();
	}

	public String checkDefaultSingleWellLateralSI() {
		return singlewelllatlengthfield.getText();

	}

	public void wrongValidationSimulfracWellLatLengthAPI(Integer int3, Integer int4) throws InterruptedException {
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int3 + "");
		simulfracwelllatlengthAPIalert.isDisplayed();
        Thread.sleep(2000);
        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		simulfracwelllatlengthfield.clear();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
        Thread.sleep(2000);
        simulfracwelllatlengthfield.sendKeys(int4 + "");

        WebElement simulfracwelllatlengthAPIalert = wait.ignoring(NoSuchElementException.class)
            .pollingEvery(Duration.ofSeconds(1))
            .until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Value must be between 1000 and 20000")));
        simulfracwelllatlengthAPIalert.click();

       wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Value must be between 1000 and 20000")));
        Thread.sleep(2000);
        
		System.out.println(simulfracwelllatlengthfield.getText());
		simulfracwelllatlengthAPIalert.isDisplayed();
	}

	public void errormsgAPIsimulfracWellLatLngth() {
		simulfracwelllatlengthAPIalert.isDisplayed();
	}

	public void wrongValidationSimulfracWellLatLengthSI(Integer int3, Integer int4) {
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int3 + "");
		simulfracwelllatlengthSIalert.isDisplayed();
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int4 + "");
		simulfracwelllatlengthSIalert.isDisplayed();
	}

	public void errormsgSIsimulfracWellLatLngth() {
		simulfracwelllatlengthSIalert.isDisplayed();

	}

	public void APISimulfracWellLatLengthFieldValidations(Integer int1, Integer int2, Integer int3) {
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int1 + "");
	//	Assert.assertFalse(simulfracwelllatlengthSIalert.isDisplayed());
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int2 + "");
	//	Assert.assertFalse(simulfracwelllatlengthSIalert.isDisplayed());
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int3 + "");
	//	Assert.assertFalse(simulfracwelllatlengthSIalert.isDisplayed());
	}

	public void SISimulfracWellLatLengthFieldValidations(Integer int1, Integer int2, Integer int3) {
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int1 + "");
	//	Assert.assertFalse(simulfracwelllatlengthSIalert.isDisplayed());
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int2 + "");
	//	Assert.assertFalse(simulfracwelllatlengthSIalert.isDisplayed());
		simulfracwelllatlengthfield.clear();
		simulfracwelllatlengthfield.sendKeys(int3 + "");
	//	Assert.assertFalse(simulfracwelllatlengthSIalert.isDisplayed());

	}

	public void SingleStagePerSingleWellFieldValidations(Integer int1, Integer int2, Integer int3) {
		swipe(176, 746, 181, 285);
		stagespersinglewellfield.clear();
		stagespersinglewellfield.sendKeys(int1 + "");
	//	Assert.assertFalse(stagespersinglewellAPISIalert.isDisplayed());
		stagespersinglewellfield.clear();
		stagespersinglewellfield.sendKeys(int2 + "");
	//	Assert.assertFalse(stagespersinglewellAPISIalert.isDisplayed());
		stagespersinglewellfield.clear();
		stagespersinglewellfield.sendKeys(int3 + "");
	//	Assert.assertFalse(stagespersinglewellAPISIalert.isDisplayed());
	}

	public void wrongSingleStagePerSingleWellFieldValidations(Integer int1, Integer int2, Integer int3) {
		stagespersinglewellfield.clear();
		stagespersinglewellfield.sendKeys(int1 + "");
		stagespersinglewellAPISIalert.isDisplayed();
		stagespersinglewellfield.clear();
		stagespersinglewellfield.sendKeys(int2 + "");
		stagespersinglewellAPISIalert.isDisplayed();
		stagespersinglewellfield.clear();
		stagespersinglewellfield.sendKeys(int3 + "");
		stagespersinglewellAPISIalert.isDisplayed();
	}

	public String defaultAPIStagePerSinglevalue() {
		return stagespersinglewellfield.getText();
	}

	public String defaultSIStagePerSinglevalue() {
		return stagespersinglewellfield.getText();

	}

	public void StagePerSimulfracWellFieldValidations(Integer int1, Integer int2, Integer int3, Integer int4,
			Integer int5) {
		swipe(176, 746, 181, 285);
		stagespersimulfracwellfield.clear();
		stagespersimulfracwellfield.sendKeys(int1+"");
	//	Assert.assertFalse(APSIIalertstagepersimulfracwell.isDisplayed());
		stagespersimulfracwellfield.clear();
		stagespersimulfracwellfield.sendKeys(int2+"");
	//	Assert.assertFalse(APSIIalertstagepersimulfracwell.isDisplayed());
		stagespersimulfracwellfield.clear();
		stagespersimulfracwellfield.sendKeys(int3+"");
	//	Assert.assertFalse(APSIIalertstagepersimulfracwell.isDisplayed());
		stagespersimulfracwellfield.clear();
		stagespersimulfracwellfield.sendKeys(int4+"");
	//	Assert.assertFalse(APSIIalertstagepersimulfracwell.isDisplayed());
		stagespersimulfracwellfield.clear();
		stagespersimulfracwellfield.sendKeys(int5+"");
	//	Assert.assertFalse(APSIIalertstagepersimulfracwell.isDisplayed());
	}

	public void wrongStagesPerSimulfracWellFieldValidations(Integer int1, Integer int2, Integer int3) {
		stagespersimulfracwellfield.clear();
		stagespersimulfracwellfield.sendKeys(int1+"");
		APSIIalertstagepersimulfracwell.isDisplayed();
		stagespersimulfracwellfield.sendKeys(int2+"");
		APSIIalertstagepersimulfracwell.isDisplayed();
		stagespersimulfracwellfield.sendKeys(int3+"");
		APSIIalertstagepersimulfracwell.isDisplayed();
	}

	public String defaultAPIStagePerSimulfracValue() {

		return stagespersimulfracwellfield.getText();
	}

	public String defaultSIStagePerSimulfracValue() {
		return stagespersimulfracwellfield.getText();
	}

	public void errorValidationSingleWellStageVolumeAPI(Integer int1, Integer int2, Integer int3) throws InterruptedException {
		swipe(207, 434, 192, 99);
		swipe(207, 434, 192, 99);
		Thread.sleep(2000);
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int1+"");
		APIalertsinglewellstagevolume.isDisplayed();
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int2+"");
		APIalertsinglewellstagevolume.isDisplayed();
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int3+"");
		APIalertsinglewellstagevolume.isDisplayed();
	}
	
	public void errorValidationSingleWellStageVolumeSI(Integer int1, Integer int2, Integer int3) {
		swipe(207, 434, 192, 99);
		swipe(207, 434, 192, 99);
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int1+"");
		SIalertsinglewellstagevolume.isDisplayed();
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int2+"");
		SIalertsinglewellstagevolume.isDisplayed();
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int3+"");
		SIalertsinglewellstagevolume.isDisplayed();
	}

	public void APISingleWellLatLngthLabel() {
		singlewelllatlengthlabel.isDisplayed();
	}

	public void APISimulfracWellLatLngthLabel() {
		simulfracwelllatlengthlabel.isDisplayed();
	}

	public void APISingleWellStageVolumeLabel() {
		swipe(176, 746, 181, 285);
		swipe(176, 746, 181, 285);

		APIsinglewellstagewellvlmlabel.isDisplayed();
	}

	public void APISimulfracWellStageVolumeLabel() {
		APIsimulfracwellstagewellvlmlabel.isDisplayed();
	}

	public void APISingleWellTargetRateLabel() {

		APIsinglewelltargetratelabel.isDisplayed();
	}

	public void APISimulfracWellTargetRateLabel() {
		APIsimulfracwelltargetratelabel.isDisplayed();
	}

	public void SISingleWellLatLngthLabel() {
		SIsinglewelllatlengthlabel.isDisplayed();
	}

	public void SISimulfracWellLatLngthLabel() {
		SIsimulfracwelllatlengthlabel.isDisplayed();
	}

	public void SISingleWellStageVolumeLabel() {
		swipe(176, 746, 181, 285);
		swipe(176, 746, 181, 285);
		SIsinglewellstagevollabel.isDisplayed();
	}

	public void SISimulfracWellStageVolumeLabel() {
		SIsimulfracwellstagevollabel.isDisplayed();
	}

	public void SISingleWellTargetRateLabel() {
		SIsinglewelltargetratelabel.isDisplayed();
	}

	public void SISimulfracWellTargetRateLabel() {
		SIsimulfracwelltargetratelabel.isDisplayed();
		}

	public void APISingleWellLatLngthvaliadtion(Integer int1, Integer int2) {
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int1 + "");
	//	Assert.assertFalse(singlewelllatlengthalert.isDisplayed());
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int2 + "");
	//	Assert.assertFalse(singlewelllatlengthalert.isDisplayed());
		
	}

	public void SISingleWellLatLngthvaliadtion(Integer int1, Integer int2) {
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int1 + "");
		//Assert.assertFalse(singlewelllatlengthSIalert.isDisplayed());
		singlewelllatlengthfield.clear();
		singlewelllatlengthfield.sendKeys(int2 + "");
		//Assert.assertFalse(singlewelllatlengthSIalert.isDisplayed());
	}

	public void errorvalidationsimulfracwellstagevolumeAPI(Integer int1, Integer int2) {
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int1+"");
		APIalertsimulfracwellstagevol.isDisplayed();
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int2+"");
		APIalertsimulfracwellstagevol.isDisplayed();
	}

	public boolean errormsgAPIsimulfracwellstagevolume() {
		return 	APIalertsimulfracwellstagevol.isDisplayed();

	}

	public boolean errormsgSIsimulfracwellstagevolume() {
		return   SIalertsimulfracwellstagevol.isDisplayed();

	}

	public void errorvalidationsimulfracwellstagevolumeSI(Integer int1, Integer int2) {
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int1+"");
		SIalertsimulfracwellstagevol.isDisplayed();
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int2+"");
		SIalertsimulfracwellstagevol.isDisplayed();
	}

	public String simulfracwellstagevoldefaultSI() {
		
		return simulfracwellstagevolfield.getText();
	}

	public void SIsimulfracwellstagevolume(Integer int1, Integer int2) {
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int1+"");
	//	Assert.assertFalse(SIalertsimulfracwellstagevol.isDisplayed());
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int2+"");
	//	Assert.assertFalse(SIalertsimulfracwellstagevol.isDisplayed());
	}

	public String simulfracwellstagevoldefaultAPI() {
		return simulfracwellstagevolfield.getText();
	}

	public void APIsimulfracwellstagevolume(Integer int1, Integer int2) {
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int1+"");
	//	Assert.assertFalse(APIalertsimulfracwellstagevol.isDisplayed());
		simulfracwellstagevolfield.clear();
		simulfracwellstagevolfield.sendKeys(int2+"");
	//	Assert.assertFalse(APIalertsimulfracwellstagevol.isDisplayed());
	}

	public void APIerrorvalidationsinglewelltargetrate(Integer int1, Integer int2, Integer int3) {
       singlewelltargetratefield.clear();
       singlewelltargetratefield.sendKeys(""+int1);
       APIalertsinglewelltargetrate.isDisplayed();
       singlewelltargetratefield.clear();
       singlewelltargetratefield.sendKeys(""+int2);
       APIalertsinglewelltargetrate.isDisplayed();
	}

	public boolean APIerrormsgsinglewelltargetrate() {
		return  APIalertsinglewelltargetrate.isDisplayed();
	}

	public void SIerrorvalidationsinglewelltargetrate(Integer int1, Integer int2, Integer int3) {
		singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int1);
	       SIalertsinglewelltargetrate.isDisplayed();
	       singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int2);
	       SIalertsinglewelltargetrate.isDisplayed();
	}

	public boolean SIerrormsgsinglewelltargetrate() {
		return	SIalertsinglewelltargetrate.isDisplayed();

	}

	public String SIdefaultsinglewelltargetrate() {
		return singlewelltargetratefield.getText();
	}

	public void SIsinglewelltargetratevalidations(Integer int1, Integer int2, Integer int3, Integer int4) {
		   singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int1);
	  //     Assert.assertFalse(SIalertsinglewelltargetrate.isDisplayed());
	       singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int2);
	   //    Assert.assertFalse(SIalertsinglewelltargetrate.isDisplayed());
	       singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int3);
	    //   Assert.assertFalse(SIalertsinglewelltargetrate.isDisplayed());
	       singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int4);
	   //    Assert.assertFalse(SIalertsinglewelltargetrate.isDisplayed());
	}

	public String APIdefaultsinglewelltargetrate() {
		return  singlewelltargetratefield.getText();

	}

	public void APIsinglewelltargetratevalidations(Integer int1, Integer int2, Integer int3) {
		 singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int1);
	  //     Assert.assertFalse(APIalertsinglewelltargetrate.isDisplayed());
	       singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int2);
	 //      Assert.assertFalse(APIalertsinglewelltargetrate.isDisplayed());
	       singlewelltargetratefield.clear();
	       singlewelltargetratefield.sendKeys(""+int3);
	//       Assert.assertFalse(APIalertsinglewelltargetrate.isDisplayed());
	      
	}

	public String SIdefaultsimulfracwelltargetrate() {
		return simulfractargetratefield.getText() ;
	}

	public void SIsimulfracwelltargetratevalidations(Integer int1, Integer int2, Integer int3, Integer int4) {
		simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int1+"");
	//    Assert.assertFalse(SIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int2+"");
//	    Assert.assertFalse(SIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int3+"");
//	    Assert.assertFalse(SIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int4+"");
	//    Assert.assertFalse(SIalertsimulfractargetrate.isDisplayed());

	}

	public String APIdefaultsimulfracwelltargetrate() {
		return 	simulfractargetratefield.getText();

	}

	public void APIsimulfracwelltargetratevalidations(Integer int1, Integer int2, Integer int3, Integer int4) {
		simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int1+"");
//	    Assert.assertFalse(APIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int2+"");
//	    Assert.assertFalse(APIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int3+"");
//	    Assert.assertFalse(APIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int4+"");
//	    Assert.assertFalse(APIalertsimulfractargetrate.isDisplayed());
	}

	public void APIerrorvalidationsimulfracwelltargetrate(Integer int1, Integer int2, Integer int3) {
		simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int1+"");
//	    Assert.assertTrue(APIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int2+"");
//	    Assert.assertTrue(APIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int3+"");
//	    Assert.assertTrue(APIalertsimulfractargetrate.isDisplayed());
	}

	public boolean APIerrormsgsimulfracwelltargetrate() {
		return APIalertsimulfractargetrate.isDisplayed() ;
	}

	public void SIerrorvalidationsimulfracwelltargetrate(Integer int1, Integer int2) {
		simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int1+"");
//	    Assert.assertTrue(SIalertsimulfractargetrate.isDisplayed());
	    simulfractargetratefield.clear();
		simulfractargetratefield.sendKeys(int2+"");
//	    Assert.assertTrue(SIalertsimulfractargetrate.isDisplayed());
	}

	public boolean SIerrormsgsimulfracwelltargetrate() {
		return SIalertsimulfractargetrate.isDisplayed();
	}

	public void errormsghydraulicefficiancy(Double double1, Double double2, Double double3, Double double4) {
      		singlehydraulicefficiancyfield.clear();
      		singlehydraulicefficiancyfield.sendKeys(double1+"");
      		APISIalertsinglehydraulicefficiancy.isDisplayed();
      		singlehydraulicefficiancyfield.clear();
      		singlehydraulicefficiancyfield.sendKeys(double2+"");
      		APISIalertsinglehydraulicefficiancy.isDisplayed();
      		singlehydraulicefficiancyfield.clear();
      		singlehydraulicefficiancyfield.sendKeys(double3+"");
      		APISIalertsinglehydraulicefficiancy.isDisplayed();
      		singlehydraulicefficiancyfield.clear();
      		singlehydraulicefficiancyfield.sendKeys(double4+"");
      		APISIalertsinglehydraulicefficiancy.isDisplayed();
	}

	public void acceptdecimalsinglehydraulicefficiancy(Double double1, Double double2) {
		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double1+"");
  //		Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double2+"");
  //		Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
	}

	public void notacceptintegersinglehydraulicefficiancy(Integer int1, Integer int2) {
		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(int1+"");
  		APISIalertsinglehydraulicefficiancy.isDisplayed();
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(int2+"");
  		APISIalertsinglehydraulicefficiancy.isDisplayed();
	}

	public String checkdefaultsinglehydrauliceffAPI() {
		return singlehydraulicefficiancyfield.getText();
	}

	public void singlehydraulicefficiancyvalidationAPI(Double double1, Double double2, Double double3, Double double4) {
		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double1+"");
  	//	Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double2+"");
  	//	Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double3+"");
  	//	Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double4+"");
  //		Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());

	}

	public String checkdefaultsinglehydrauliceffSI() {
		return singlehydraulicefficiancyfield.getText();
	}

	public void singlehydraulicefficiancyvalidationSI(Double double1, Double double2, Double double3, Double double4) {
		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double1+"");
  	//	Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double2+"");
  //		Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double3+"");
  	//	Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
  		singlehydraulicefficiancyfield.clear();
  		singlehydraulicefficiancyfield.sendKeys(double4+"");
  	//	Assert.assertFalse(APISIalertsinglehydraulicefficiancy.isDisplayed());
	}

	public void errormsgsimulfrachydraulicefficiancy(Double double1, Double double2, Double double3, Double double4) {
		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double1+"");
  		APISIalertsimulfrachydraulicefficiancy.isDisplayed();
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double2+"");
  		APISIalertsimulfrachydraulicefficiancy.isDisplayed();
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double3+"");
  		APISIalertsimulfrachydraulicefficiancy.isDisplayed();
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double4+"");
  		APISIalertsimulfrachydraulicefficiancy.isDisplayed();
	}

	public String checkdefaultsimulfrachydrauliceffAPI() {
		return simulfrachydraulicefficiancyfield.getText();
	}

	public void simulfrachydraulicefficiancyvalidationAPI(Double double1, Double double2, Double double3,
			Double double4) {
		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double1+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double2+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double3+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double4+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
	}

	public String checkdefaultsimulfrachydrauliceffSI() {
		return simulfrachydraulicefficiancyfield.getText();
	}

	public void simulfrachydraulicefficiancyvalidationSI(Double double1, Double double2, Double double3,
			Double double4) {
		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double1+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double2+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double3+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double4+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
	}

	public void acceptdecimalsimulfrachydraulicefficiancy(Double double1, Double double2) {
		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double1+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(double2+"");
	//	Assert.assertFalse(APISIalertsimulfrachydraulicefficiancy.isDisplayed());

	}

	public void notacceptintegersimulfrachydraulicefficiancy(Integer int1, Integer int2) {
		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(int1+"");
  		APISIalertsimulfrachydraulicefficiancy.isDisplayed();
  		simulfrachydraulicefficiancyfield.clear();
		simulfrachydraulicefficiancyfield.sendKeys(int2+"");
  		APISIalertsimulfrachydraulicefficiancy.isDisplayed();
	}

	public void acceptdecimalsinglestagetransitiontime(Double double1, Double double2) {
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double1);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double2);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
	}

	public void notacceptintegersinglestagetransitiontime(Integer int1, Integer int2) {
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+int1);
		APISIalertsinglestagetransitiontime.isDisplayed();
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+int1);
		APISIalertsinglestagetransitiontime.isDisplayed();
	}

	public String checkdefaultsinglestagetransitionAPI() {
		String val =  singlestagetransitiontimefield.getText();
		double n = Double.parseDouble(val);
		Double d = (double) (Math.round(n*10.0)/10.0);
	    System.out.println(d);
		return d.toString();
	}

	public void singlestagetransitionvalidationAPI(Double double1, Double double2, Double double3, Double double4) {
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double1);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double2);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double3);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double4);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
	}

	public void errormsgsinglestagetransitiontime(Double double1, Double double2, Double double3, Double double4) {
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double1);
		APISIalertsinglestagetransitiontime.isDisplayed();
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double2);
		APISIalertsinglestagetransitiontime.isDisplayed();
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double3);
		APISIalertsinglestagetransitiontime.isDisplayed();
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double4);
		APISIalertsinglestagetransitiontime.isDisplayed();
	}

	public String checkdefaultsinglestagetransitionSI() {
		String val = singlestagetransitiontimefield.getText();
		double n = Double.parseDouble(val);
		Double d = (double) (Math.round(n*10.0)/10.0);
	    System.out.println(d);
		return d.toString();
	}

	public void singlestagetransitionvalidationSI(Double double1, Double double2, Double double3, Double double4) {
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double1);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double2);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double3);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
		singlestagetransitiontimefield.clear();
		singlestagetransitiontimefield.sendKeys(""+double4);
	//	Assert.assertFalse(APISIalertsinglestagetransitiontime.isDisplayed());
	}

	public String checkdefaultsimulfracstagetransitionSI() {
		String val= simulfracstagetransitiontimefield.getText();
		double n = Double.parseDouble(val);
		Double d = (double) (Math.round(n*10.0)/10.0);
	    System.out.println(d);
		return d.toString();
		
	}

	public void simulfracstagetransitionvalidationSI(Double double1, Double double2, Double double3, Double double4) {
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double1);
	//	Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double2);
	//	Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double3);
	//	Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double4);
	//	Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
	}

	public String checkdefaultsimulfracstagetransitionAPI() {
		String val =  simulfracstagetransitiontimefield.getText();
		double n = Double.parseDouble(val);
		Double d = (double) (Math.round(n*10.0)/10.0);
	    System.out.println(d);
		return d.toString();
	}

	public void simulfracstagetransitionvalidationAPI(Double double1, Double double2, Double double3, Double double4) {
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double1);
//		Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double2);
//		Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double3);
//		Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double4);
//		Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
	}

	public void acceptdecimalsimulfracstagetransitiontime(Double double1, Double double2) {
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double1);
//		Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double2);
//		Assert.assertFalse(APISIalertsimulfracstagetransitiontime.isDisplayed());
	}

	public void notacceptintegersimulfracstagetransitiontime(Integer int1, Integer int2) {
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+int1);
		APISIalertsimulfracstagetransitiontime.isDisplayed();
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+int2);
		APISIalertsimulfracstagetransitiontime.isDisplayed();
	}

	public void errormsgsimulfractagetransitiontime(Double double1, Double double2, Double double3, Double double4) {
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double1);
		APISIalertsimulfracstagetransitiontime.isDisplayed();
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double2);
		APISIalertsimulfracstagetransitiontime.isDisplayed();
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double3);
		APISIalertsimulfracstagetransitiontime.isDisplayed();
		simulfracstagetransitiontimefield.clear();
		simulfracstagetransitiontimefield.sendKeys(""+double4);
		APISIalertsimulfracstagetransitiontime.isDisplayed();
	}

	public void errormsgwirelessruntime(Double double1, Double double2, Double double3, Double double4) {
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double1+"");
		APISIalertwirelesstransitiontime.isDisplayed();
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double2+"");
		APISIalertwirelesstransitiontime.isDisplayed();
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double3+"");
		APISIalertwirelesstransitiontime.isDisplayed();
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double4+"");
		APISIalertwirelesstransitiontime.isDisplayed();
	}

	public String checkdefaultwirelineruntimeSI() {
		String val =  wirelessruntimefield.getText();
		double n = Double.parseDouble(val);
		Double d = (double) (Math.round(n*10.0)/10.0);
	    System.out.println(d);
		return d.toString();
	}

	public void wirelinerunvalidationSI(Double double1, Double double2, Double double3, Double double4) {
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double1+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double2+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double3+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double4+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
 	}

	

	public void wirelinerunvalidationAPI(Double double1, Double double2, Double double3, Double double4) {
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double1+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double2+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double3+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double4+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
	}

	public String checkdefaultwirelineruntimeAPI() {
		String val = wirelessruntimefield.getText();
		
		double n = Double.parseDouble(val);
		Double d = (double) (Math.round(n*10.0)/10.0);
	    System.out.println(d);
		return d.toString();
		
	//	return wirelessruntimefield.getText();
	}

	public void acceptdecimalwirelineruntime(Double double1, Double double2) {
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double1+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(double2+"");
	//	Assert.assertFalse(APISIalertwirelesstransitiontime.isDisplayed());
	}

	public void notacceptintegerwirelineruntime(Integer int1, Integer int2) {
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(int1+"");
		APISIalertwirelesstransitiontime.isDisplayed();
		wirelessruntimefield.clear();
		wirelessruntimefield.sendKeys(int2+"");
		APISIalertwirelesstransitiontime.isDisplayed();		
	}

	public void slidesimulfracsliderto100() {
		simulfracwellcountslider.sendKeys("1%");
	}

	public void clickexpressfiberwell() {
		//expressfiberwellfield.click();
		tap(expressfiberwellfield);
	}

	public void clickoptionsexpressfiberwell() {
		tap(sf1);
		tap(sf2);
		tap(z1);

//		sf1.click();
//		sf2.click();
//		z1.click();
	}

	public void clickonclearallexpressfiberwell() {
		claearall.click();	
	}

	public String checkdefaultsinglewellstagevolAPI() {
		return singlewellstagevolumefield.getText();
		
		}

	public void APIsinglewellstagevolvalidation(Integer int1, Integer int2, Integer int3) {
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int1+"");
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int2+"");
		singlewellstagevolumefield.clear();
		singlewellstagevolumefield.sendKeys(int3+"");
		
	}
	
	

}
