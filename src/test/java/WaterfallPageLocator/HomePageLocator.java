package WaterfallPageLocator;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtility.WaterfallBase;

public class HomePageLocator extends WaterfallBase {



public HomePageLocator(){
    PageFactory.initElements(driver, this);

}
@FindBy(id="login2")
public WebElement loginLink;




}


