package WaterfallStepdeff;

import WaterfallPageAction.HomePageAction;
import WaterfallPageAction.LoginPageAction;
import WaterfallPageAction.ProfilePageAction;
import WaterfallUtility.WaterfallBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WaterFallLogin extends WaterfallBase {
    HomePageAction homePageAction=new HomePageAction();
    LoginPageAction loginPageAction=new LoginPageAction(); 
    ProfilePageAction profilePageAction=new ProfilePageAction();
	@Given("^Open Demoblaze \"([^\"]*)\" Application$")
	public void open_Demoblaze_Application(String URL) throws Throwable {
	   waterfallURL(URL);
	}
	@Then("^Click Login$")
	public void click_Login() throws Throwable {
	 homePageAction.ClickLogin();  
	}

	@Then("^Enter username and password and Click Login(\\d+)$")
	public void enter_username_and_password_and_Click_Login(int arg1) throws Throwable {
	  loginPageAction.usercard(wpro.getProperty("Username"), wpro.getProperty("Password")); 
	}

	@Then("^Verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		 profilePageAction.Verifyuserloginsuccessfully();
	}










}
