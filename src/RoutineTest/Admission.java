package RoutineTest;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.AdmissionPage;
import pom.HomePage;

public class Admission extends BaseTest {
	
	@Test(enabled = false)
	public void TestAdmission() throws InterruptedException, AWTException {
		String Username = Excel.getCellData(INPUT, "UserReg", 3, 1);
		String Phyname = Excel.getCellData(INPUT, "Admission", 1, 1);
		
		
		HomePage hp = new HomePage(driver);
		hp.SideBar();
		hp.ModuleTextfield();
		hp.ModuleSearchfield("Admission");
		WebElement We = driver.findElement(By.xpath("//a[text()='Admission']"));//You can use xpath, ID or name whatever you like
		We.sendKeys(Keys.TAB);
		We.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		AdmissionPage adm = new AdmissionPage(driver);
		adm.clickUHID();
		adm.SetUHID(Username);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		//adm.ClickPISourceDropdown();
		//adm.ClickAMStudioInPIS();
		//adm.ClickAttendingPhysicanDD();
		//adm.setTextfieldAttendPhy(Phyname);
		Thread.sleep(2000);
		adm.SetReasonForAdmission("Test");
		adm.clickBedViewicon();
		adm.clickAvailableBed();
		Thread.sleep(2000);
		adm.clickSaveinAdm();
		Thread.sleep(2000);
		adm.clickPrintbtn();
		Thread.sleep(2000);
		adm.clickCloseAdmReport();
		hp.clickCompanyLogo();
	    
		
		
	}

}
