package WaterfallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtility.WaterfallBase;

public class LoginPageLocator extends WaterfallBase {
	

		public LoginPageLocator (){
		    PageFactory.initElements(driver, this);



		}

		    @FindBy(id="loginusername")
		    public WebElement UserName;
		    @FindBy(id="loginpassword")
		    public WebElement Password;
		    @FindBy(xpath="//button[text()='Log in']")
		    public WebElement LoginButton;
		    
		    
		    
  
		}	    
		    
 
		    
		    
		    
		


