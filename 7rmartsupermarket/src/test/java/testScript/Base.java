package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenShotUtility;
import utilities.WaitUtility;
public class Base {


	
	public WebDriver driver;
	 
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
public void browserIntialization(String browser) throws Exception
{
          //driver=new ChromeDriver();
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			
		}
		else
		{
			throw new Exception("invalid");
		}
		
		
         driver.get("https://groceryapp.uniqassosiates.com/admin");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
         driver.manage().window().maximize();
        
}
	@AfterMethod(alwaysRun=true)
  // public void driverQuitAndClose()
   
   //{
	   //driver.quit();
      // driver.close(); 
   //}
	 public void browserQuit(ITestResult iTestResult) throws IOException {  
	 		if (iTestResult.getStatus() == ITestResult.FAILURE) {  
	 			ScreenShotUtility scrShot = new ScreenShotUtility();  
	 			scrShot.getScreenShot(driver, iTestResult.getName());  
	 		} 
	  
	 	}
         
}

