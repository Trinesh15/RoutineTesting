package RoutineTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.ChargesheetPage;
import pom.HomePage;

public class Chargesheet extends BaseTest {
	
	@Test(priority = 4)
	public void TestChargesheet() throws InterruptedException, AWTException {
		String Username = Excel.getCellData(INPUT, "UserReg", 3, 1);
		String Servicename = Excel.getCellData(INPUT, "Chargesheet", 0, 1);
		String Productname = Excel.getCellData(INPUT, "Chargesheet", 0, 2);
		
		HomePage hp = new HomePage(driver);
		hp.SideBar();
		hp.ModuleTextfield();
		hp.ModuleSearchfield("Chargesheet");
		WebElement We = driver.findElement(By.xpath("//a[text()='Chargesheet']"));//You can use xpath, ID or name whatever you like
		We.sendKeys(Keys.TAB);
		We.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		ChargesheetPage charge = new ChargesheetPage(driver);
		
		charge.setUHIDfield(Username);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		charge.setServicetextfield(Servicename);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_ENTER);
		
//		Thread.sleep(5000);
//	charge.ClickSrvProSlid();
//		charge.VerifyStoreDepPopup();
//		charge.ClickProdDropdown();
//		charge.clickHospmainstore();
//		charge.clickOKinDepdd();
//		
//		Thread.sleep(2000);
//		charge.setServicetextfield(Productname);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		charge.ClickAddProduct();
		
		
		
		
	}

}
