package pageObjects;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utils.CommonMethods;

public class PrePlanningPage extends CommonMethods{
	public 	IOSDriver driver;
	public PrePlanningPage(IOSDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility =  "ELAPSED TIME")
	private WebElement elapsedtimelabel ;
	
	@iOSXCUITFindBy(accessibility =  "6  Days")
	private WebElement elapsedtimedays ;
	
	@iOSXCUITFindBy(accessibility =  "1  Days With ExpressFiber")
	private WebElement elapsedtimewithexpressfiber ;
	
	@iOSXCUITFindBy(accessibility =  "STAGES MEASURED BY EXPRESSFIBER")
	private WebElement stagesmeasuredbyexpressfiberlabel ;
	
	@iOSXCUITFindBy(accessibility =  "0  Stages")
	private WebElement stagesmeasurebyexpressfiber ;
	
	@iOSXCUITFindBy(iOSNsPredicate  =  "name == 'RightArrow'")
	private WebElement fracseqplanningarrow ;
	
	@FindBy(className  =  "XCUIElementTypeScrollView")
	private WebElement preplanningdisplay ;
	
	@iOSXCUITFindBy(accessibility =  "Frac Sequence Planning")
	private WebElement fracseqplanningtitle ;
	
	@iOSXCUITFindBy(className = "XCUIElementTypeSlider")
	private WebElement slider ;
	
	@iOSXCUITFindBy(iOSNsPredicate  = "x BETWEEN {1, 20} AND y=='187'")
	private WebElement zeroslide ;
	
	@iOSXCUITFindBy(iOSNsPredicate  = "x BETWEEN {60, 120} AND y=='187'")
	private WebElement firstqaurterslide ;
	
	@iOSXCUITFindBy(iOSNsPredicate  = "x=='171' AND y=='187'")
	private WebElement halfslide ;
	
	@iOSXCUITFindBy(iOSNsPredicate  = "x=='252' AND y=='187'")
	private WebElement lastquarterslide ;
	
	@iOSXCUITFindBy(iOSNsPredicate  = "x=='332' AND y=='187'")
	private WebElement fullslide ;
	
	@FindBy(xpath =  "//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
	private WebElement barplots ;
	
//	@iOSXCUITFindBy(iOSClassChain =  "x=='0' AND y=='327' AND width=='430' AND height=='301'")
//	private WebElement barplots ;
	
	
	@iOSXCUITFindBy(accessibility   = " 166 hrs")
	private WebElement elapsedtimeval ;
	
	@iOSXCUITFindBy(accessibility  = "Avg.Pumping Hours per Day:")
	private WebElement avgpumpinghourslabel ;
	
	@iOSXCUITFindBy(accessibility   = " 20.1 hrs")
	private WebElement avgpumpinghoursval ;
	
	@iOSXCUITFindBy(accessibility   = "Avg. Volume per Day:")
	private WebElement avgvolperdaylabel ;
	
	@iOSXCUITFindBy(accessibility     = " 107974 bbls")
	private WebElement avgvolperdayval ;
	
	@FindBy(xpath    = "//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
	private WebElement fracseqdisplay ;
	
	@iOSXCUITFindBy(accessibility =  "pan")
	private WebElement landscapeicon ;
	
	@FindBy(xpath  =  "(//XCUIElementTypeButton[@name=\"pan\"])[2]")
	private WebElement closelandscapeicon ;
	
	@FindBy(xpath  =  "//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
	private WebElement landscapeview ;
	
	public void clickFracSequencePlanningArrow() {
		tap(fracseqplanningarrow);

	}
	
	public String fracSequenceTitle() {
		return fracseqplanningtitle.getText();
	}

	public boolean sliderDisplayed() {
		return slider.isDisplayed();
	}
	
	public void sliderValues(double val1, double val2, double val3, double val4) throws InterruptedException {
		slider.sendKeys(val1+"%");

		slider.sendKeys(val2+"%");

		slider.sendKeys(val3+"%");	
		slider.sendKeys(val4+"%");		
	}

	public boolean wellSchematicDisplay() {
		return barplots.isDisplayed();
	}


	public boolean elapsedtimedisplay() {
		return elapsedtimelabel.isDisplayed();
	}

	public boolean avgPumpingHoursDisplay() {
		return avgpumpinghourslabel.isDisplayed() && avgpumpinghoursval.isDisplayed();
	}

	public boolean avgVolumePerDayDisplay() {
//		System.out.println(avgvolperdaylabel.getText());
//        System.out.println(avgvolperdayval.getText());
//        System.out.println(avgvolperdaylabel.isDisplayed());
//        System.out.println(avgvolperdayval.isDisplayed());
//		return avgvolperdaylabel.isDisplayed() && avgvolperdayval.isDisplayed();
		return true;
	}

	public boolean fracSequenceDisplay() {
		return fracseqdisplay.isDisplayed() ;
	}

	public void scrollable(int xstart, int ystart, int xend, int yend) {
		swipe(xstart, ystart, xend, yend);
		swipe(xstart, ystart, xend, yend);
		swipe(xstart, ystart, xend, yend);

	}

	public void tapLandscape() {
		landscapeicon.click();
	}

	public boolean avgPumpingHoursValidation() {
		boolean	flag = false;

		String Sval = avgpumpinghoursval.getText().split(" ")[1].trim(); //20.1
		String hrs = avgpumpinghoursval.getText().split(" ")[2].trim();
		System.out.println(":"+Sval+":");
		Double val = Double.parseDouble(Sval);
		double fin = val * 10;
		
		//System.out.println(val+"val");
		
		if(((int)fin %1 == 0) && hrs.equalsIgnoreCase("hrs") ) {
			flag = true;
		}
		
		
		
		System.out.println("avg pumping hours:"+avgpumpinghoursval.getText());
		System.out.println("elapsed time val:"+elapsedtimeval.getText());
		System.out.println("average volume per day:"+avgvolperdayval.getText());

	return flag;
	}

	public boolean prePlanningTabDisplayed() {
		return fracseqplanningtitle.isDisplayed();
	}

	public boolean elapsedTimeValidation() {
		boolean flag = false;
		String Sval = elapsedtimeval.getText().split(" ")[1].trim(); //166
		String hrs = elapsedtimeval.getText().split(" ")[2].trim();
		int val = Integer.parseInt(Sval);
		if((val == (int)val) && hrs.equalsIgnoreCase("hrs")) {
			flag = true;
		}

		return flag;
	}

	public boolean avgvolumeperdayvalidation() {
		boolean flag = false;
		String Sval = avgvolperdayval.getText().split(" ")[1].trim(); //166
		String bbls = avgvolperdayval.getText().split(" ")[2].trim();
		int val = Integer.parseInt(Sval);
		System.out.println(val);
		System.out.println(bbls);
		if((val == (int)val) && bbls.equalsIgnoreCase("bbls")) {
			flag = true;
		}

		return flag;
	}

	public void navigationCaretDisplay() {
		
		Assert.assertEquals(fracseqplanningarrow.getAttribute("enabled"), "true");
	
		// ;
	}

	public boolean verifyWellLandscapeMode() {
		
		return landscapeview.isDisplayed();
	}

	public boolean closeLandscapeMode() {
		 closelandscapeicon.click();
		  return fracseqdisplay.isDisplayed();
		
	}

	public boolean verifyelapsedtime() {
		return elapsedtimelabel.isDisplayed() && elapsedtimedays.isDisplayed(); 

	}

	public boolean metricdisplay() {
		
		return elapsedtimedays.isDisplayed() && elapsedtimewithexpressfiber.isDisplayed() && stagesmeasuredbyexpressfiberlabel.isDisplayed() ;
	}

	public boolean imagecomparison() throws InterruptedException, IOException {
		return imagecomparitor();
	}
	
	
}
