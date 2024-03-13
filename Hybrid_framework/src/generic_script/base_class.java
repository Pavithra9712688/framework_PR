package generic_script;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Fetch_property;

public class base_class implements framework_constant 
{
	public WebDriver driver;
	 @BeforeMethod
	 public void openApps() throws FileNotFoundException, IOException
	 {
		 System.setProperty(g_key, g_value);
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(Fetch_property.get_Pro());
		 
	 }
	 
	 @AfterMethod
		 public void closeApps(ITestResult res)
		 {
		     if(ITestResult.FAILURE==res.getStatus())
		     {
		    	 capture_screenshot.get_photo(driver);
		     }
			 driver.close();
		 }
}
