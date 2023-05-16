package WaterfallTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import WaterfallUtility.WaterfallBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/WaterfallFolder"},
plugin = {"json:target/cucumber.json"},
glue = "WaterfallStepdeff")//tags = {"@Sanity"})


public class WaterFall_TestRunner extends AbstractTestNGCucumberTests {

	
@BeforeTest
public void WaterFallOpenURL()  {
     WaterfallBase test = new WaterfallBase();
     test.waterFallBrowser();


}
@AfterTest
public void WaterFallCloseURL()    {
  WaterfallBase test = new WaterfallBase();                 
  test.driver.quit();


}

}