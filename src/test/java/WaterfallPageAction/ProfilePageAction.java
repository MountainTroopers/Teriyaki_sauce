package WaterfallPageAction;

import org.testng.Assert;

import WaterfallPageLocator.ProfilePageLocator;
import WaterfallUtility.WaterfallBase;

public class ProfilePageAction extends WaterfallBase {
	ProfilePageLocator profilePageLocator=new ProfilePageLocator();
   public void Verifyuserloginsuccessfully() {

	   boolean profilevalidation=profilePageLocator.Profile.isDisplayed();
	   Assert.assertTrue(profilevalidation);

}

}
