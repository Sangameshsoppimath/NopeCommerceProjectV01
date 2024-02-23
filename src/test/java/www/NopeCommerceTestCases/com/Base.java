package www.NopeCommerceTestCases.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeClass
	public void setup()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Sangamesh\\eclipse-workspace\\Training\\report");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester Name","Sangamesh");

	}
	
	WebDriver driver;
	@BeforeMethod
	public void IntializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{  
		// Log the result of the test
        if (result.getStatus()==ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test skipped");
        }
        
        extent.flush();
        
		
		  if (ITestResult.FAILURE == result.getStatus()) 
		  {
			  captureScreenshot(result.getName());
	      }
		driver.close();
		
	}
	
	public void captureScreenshot(String testName) throws IOException
	{
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		String screenshotdirectory = "src/test/resources/screenshots/";
        String fileName = testName+getCurrentTimestamp()+" "+ "_screenshot.png";
        Path targetPath = Paths.get(screenshotdirectory, fileName);
        Files.copy(srcfile.toPath(), targetPath);
		 
        
	}

	 private String getCurrentTimestamp() {
	        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(0));
	    }

	
}




