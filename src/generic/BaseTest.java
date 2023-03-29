package generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest implements AutoConst {
	public static WebDriver driver;
//	
	//open the browser in chrome
//	@BeforeTest
//	public void openChrome() {
//		System.setProperty(CHROME_KEY,CHROME_VALUE);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("192.168.1.160:8090/eBiosLite/(S())/eBiosFiles/CommonForms/frmLogin.aspx");
//		}
//	
	//open the browser in Firefox
	@BeforeTest
	public void openFirefox() {
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver = new FirefoxDriver(); //Upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("localhost:8090/eBiosLite/(S())/eBiosFiles/CommonForms/frmLogin.aspx");
	}
	
//	//Close the current browser
//	@AfterMethod
//	public void closeApp() {
//		driver.quit();
//		
//	}
	
	
	@AfterMethod//AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	if(ITestResult.FAILURE==result.getStatus()){
	try{
	// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	// Copy files to specific location
	// result.getName() will return name of test case so that screenshot name will be same as test case name
	FileUtils.copyFile(src, new File("D:\\Screenshot"+result.getName()+".png"));
	System.out.println("Successfully captured a screenshot");
	}
	catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
	}
	

	

	
	public void scrollpage(String element) {
		int x =driver.findElement(By.xpath(element)).getLocation().getX();
		int y = driver.findElement(By.xpath(element)).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver; //Type casting
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");    
		}
	

	
	
	
}
