package RoutineTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.HomePage;
import pom.RegistrationPage;
import generic.Excel1;

public class Registration extends BaseTest {
	
	@Test(enabled = false)
	public void TestRegistration() throws InterruptedException, IOException {
		
	String fname = Excel.getCellData(INPUT, "UserReg", 0, 1);
	String lname = Excel.getCellData(INPUT, "UserReg", 1, 1);
	String Mobname = Excel.getCellData(INPUT, "UserReg", 2, 1);
	HomePage hp = new HomePage(driver);
	
	hp.SideBar();
	hp.ModuleTextfield();
	hp.ModuleSearchfield("Regis");
	WebElement We = driver.findElement(By.xpath("//a[text()='Registration']"));//You can use xpath, ID or name whatever you like
	We.sendKeys(Keys.TAB);
	We.sendKeys(Keys.TAB);
	We.sendKeys(Keys.ENTER);
	
	RegistrationPage Reg = new RegistrationPage(driver);
	Thread.sleep(2000);
	
	WebElement element = driver.findElement(By.id("cpBody_txtHospIdNo"));
	String text = element.getAttribute("value");
	//System.out.println(text);
	Excel1.setCellData(INPUT, "UserReg", 3, 1, text);
	Reg.clickTitle();
	Reg.ClickMr();
	Reg.setFirstName(fname);
	Reg.setLastName(lname);
	Reg.clickPaymentSource();
	Reg.clickLocalPatient();
	Reg.setMobileNum(Mobname);
	Thread.sleep(2000);
	scrollpage("//button[@id='cpBody_LblLinkDetails']");
	Reg.clickDepartmentDD();
	Reg.clickClinicalLab();
	Reg.clickPrimaryIntroSource();
	Reg.clickAMSTUDIO();
	Reg.clickSave();
	Reg.clickOKBtn();
//	Thread.sleep(3000);
//	String alert= driver.switchTo().alert().getText();
//	System.out.println(alert);
//	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	hp.clickCompanyLogo();
	Select select = new Select(We);
	//String data = Reg.CopyUHID();
	//Excel1.setCellData(INPUT, "UserReg", 3, 1, data);
	
	
			
	} 

}
