package WaterfallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtility.WaterfallBase;

public class ProfilePageLocator extends WaterfallBase {

	public ProfilePageLocator (){
	    PageFactory.initElements(driver, this);


	}

	@FindBy(xpath ="//a[text()='Welcome bangladesh']")
		
	public WebElement Profile;


}