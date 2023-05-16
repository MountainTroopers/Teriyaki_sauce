package WaterfallPageAction;

import WaterfallPageLocator.HomePageLocator;
import WaterfallUtility.WaterfallBase;

public class HomePageAction extends WaterfallBase {
     HomePageLocator homePageLocator = new HomePageLocator(); 
    public void ClickLogin() {
        homePageLocator.loginLink.click();
}


}
