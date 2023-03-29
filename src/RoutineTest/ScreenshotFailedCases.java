package RoutineTest;

import java.io.File;
import java.io.IOException;

import javax.swing.text.TabableView;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class ScreenshotFailedCases {
	// Create Webdriver reference
	static WebDriver driver;
	@Test(enabled = false)
	public static void captureScreenMethod() throws Exception{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.1.150:8060/(S(hhh5m1jae2i4b1qb5fbwojrz))/eBiosFiles/CommonForms/frmLogin.aspx");
	driver.navigate().refresh();
	//driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
	driver.findElement(By.id("inputUser")).sendKeys("nem");; //Statement with incorrect Xpath
	driver.findElement(By.id("inputPassword")).sendKeys("n2est");
	driver.findElement(By.id("btnLogIn")).click();
	driver.switchTo().alert().accept();
	//driver.findElement(By.id("imgLogo")).sendKeys("1234");
	}
	@Test(enabled = false) //AfterMethod annotation - This method executes after every test execution
	public static void screenShot(ITestResult result){
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
	}catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
	
	
	
	//driver.quit();
	}
}
	
