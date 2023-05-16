package WaterfallPageAction;

import WaterfallPageLocator.LoginPageLocator;
import WaterfallUtility.WaterfallBase;

public class LoginPageAction extends WaterfallBase {
   LoginPageLocator loginPageLocator=new LoginPageLocator();
   public void usercard(String u, String p)  {
	   loginPageLocator.UserName.sendKeys(u);
	   loginPageLocator.Password.sendKeys(p);
	   loginPageLocator.LoginButton.click();


   
   }  
   
   
   
}  
   
