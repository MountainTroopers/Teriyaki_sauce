package WaterfallUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WaterfallBase {


    public static WebDriver driver;
    public static Properties wpro;

    public WaterfallBase ()  {


    try {
		FileInputStream waterfallFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\WaterfallConfig\\WaterfallConfigFile.properties");
		  wpro = new Properties();
		 wpro.load(waterfallFile);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("Please check your code");
		e.printStackTrace();
	}

    }
    public void waterFallBrowser()   {

    	String Browser = wpro.getProperty("WaterFallBrowser1");

    	if(Browser.equalsIgnoreCase("Chrome"))    {

    		
     		 System.setProperty("webdriver.Edge.driver",(System.getProperty("user.dir")+"\\EdgeDriver\\msedgedriver.exe") );
    		  driver = new EdgeDriver();
   		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaterfallTestData.implicityWait));
   		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaterfallTestData.pageloadTimeout));
   		driver.manage().window().maximize();          //maximize window
 	  	  driver.manage().deleteAllCookies();           //deleting all history
 	   
   	  	  
   		 
   	   


    	}                                                                                
    	else if(Browser.equalsIgnoreCase("FF"));

    	}
       public static void waterfallURL(String URL)   { 
         driver.get(wpro.getProperty("URLQA"));
       
    
    }   
    
}   
    
    
