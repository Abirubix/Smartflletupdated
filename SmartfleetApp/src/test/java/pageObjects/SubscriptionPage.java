package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utils.CommonMethods;

public class SubscriptionPage extends CommonMethods{

		public 	IOSDriver driver;
		public SubscriptionPage(IOSDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
			
		}
		
		@iOSXCUITFindBy(accessibility = "No" )
		private WebElement noalert;
		@iOSXCUITFindBy(accessibility   ="Subscriptions" )
		private WebElement subscriptionicon;
		
		@iOSXCUITFindBy(accessibility   ="What kind of subscription would you like?" )
		private WebElement subscriptionupdatedtext;
		
		@iOSXCUITFindBy(accessibility   ="Annual" )
		private WebElement annualsubscriptionlabel;
		
		@iOSXCUITFindBy(accessibility   ="Covers all well pads for 12 months from the date of purchase" )
		private WebElement annualsubdescription;
		
		@iOSXCUITFindBy(accessibility   ="Pad" )
		private WebElement padsubscriptionlabel;
		
		@iOSXCUITFindBy(accessibility   ="Covers specified well pad for the duration of the project" )
		private WebElement padsubdescription;
		
		@iOSXCUITFindBy(accessibility   ="Test customer" )
		private WebElement testcustomersmartfleetnearwell;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther" )
		private WebElement padsubnearwelloption;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther" )
		private WebElement padsubcrosswelloption;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeButton[@name=\"Continue\"]" )
		private WebElement padsubcontinuelabel;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther" )
		private WebElement testmappingtreadfednosublabel;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeButton[@name=\"Send Purchase Request\"]" )
		private WebElement sendpurchaserequest;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther" )
		private WebElement twinjune23testcrosswelllabel;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther" )
		private WebElement northbeningtoncompletelabel;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeStaticText[@name=\"Read more about subscription options\"]" )
		private WebElement readmoresublink;
		
		@iOSXCUITFindBy(xpath   ="//XCUIElementTypeApplication[@name=\"SmartFleet\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton" )
		private WebElement smartfleetusericon;
		
		
		public void subscriptionUpdatedText() {
			//noalert.click();
			subscriptionicon.click();
			Assert.assertTrue(subscriptionupdatedtext.isDisplayed());
		}
		public void verifyKindofSubscription() {
			//noalert.click();
			subscriptionicon.click();
            Assert.assertTrue(annualsubscriptionlabel.isDisplayed());
            Assert.assertTrue(annualsubdescription.isDisplayed());
            Assert.assertTrue(padsubscriptionlabel.isDisplayed());
            Assert.assertTrue(padsubdescription.isDisplayed());

		}
		public void verifyeditfunctionalitywithsubscription() throws InterruptedException {
			//noalert.click();
			subscriptionicon.click();
			padsubscriptionlabel.click();
			Thread.sleep(3000);
			for(int i=0; i<7;i++) {
			swipe(187, 831, 195, 221);
			}
			testcustomersmartfleetnearwell.click();
			padsubcrosswelloption.click();
			padsubnearwelloption.click();
			padsubcontinuelabel.click();
		}
		public void verifyeditfunctionalitynosubscription() throws InterruptedException {
			//noalert.click();
			subscriptionicon.click();
			padsubscriptionlabel.click();
			Thread.sleep(3000);
			testmappingtreadfednosublabel.click();
			tap(padsubcrosswelloption);
			tap(padsubnearwelloption);

			tap(padsubcontinuelabel);

//			padsubcrosswelloption.click();
//			padsubnearwelloption.click();
//			padsubcontinuelabel.click();
			sendpurchaserequest.isDisplayed();
		}
		public void verifysubscriptionoption() throws InterruptedException {
			//noalert.click();
			subscriptionicon.click();
			padsubscriptionlabel.click();
			Thread.sleep(3000);
			testmappingtreadfednosublabel.isDisplayed();
			for(int i=0; i<7;i++) {
				swipe(187, 831, 195, 221);
				}
				testcustomersmartfleetnearwell.isDisplayed();
				swipe(187, 831, 195, 221);
                twinjune23testcrosswelllabel.isDisplayed();
                northbeningtoncompletelabel.isDisplayed();
			

		}
		public void verifylinkforreadmoresub() throws InterruptedException {
			//noalert.click();
			subscriptionicon.click();
			padsubscriptionlabel.click();
			Thread.sleep(3000);
			for(int i=0; i<7;i++) {
				swipe(187, 831, 195, 221);
				}
				testcustomersmartfleetnearwell.click();
				Thread.sleep(1000);
				readmoresublink.click();
				
		}
		public void verifylistofpads() throws InterruptedException {
			//noalert.click();
			subscriptionicon.click();
			padsubscriptionlabel.click();
			Thread.sleep(3000);
			testmappingtreadfednosublabel.click();
			padsubcrosswelloption.isDisplayed();
			padsubnearwelloption.isDisplayed();

		}
		public void verifylistofsunbscriptions() throws InterruptedException {
			//noalert.click();
			Thread.sleep(1000);
			smartfleetusericon.click();
		}
		
		
}
