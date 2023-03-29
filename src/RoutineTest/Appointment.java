package RoutineTest;

import java.awt.AWTException;
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import pom.AppointmentsPage;
import pom.HomePage;

public class Appointment extends BaseTest {
	
	@Test(enabled = false)
	public void TestAppointment() throws InterruptedException, AWTException {
		
		String Phyname = Excel.getCellData(INPUT, "Appointments", 0, 1);
		String Username = Excel.getCellData(INPUT, "UserReg", 3, 1);
		String PChartID = "";
		
		HomePage hp = new HomePage(driver);
		hp.SideBar();
		hp.ModuleTextfield();
		hp.ModuleSearchfield("Appoint");
		WebElement We = driver.findElement(By.xpath("//a[text()='Appointments']"));//You can use xpath, ID or name whatever you like
		We.sendKeys(Keys.TAB);
		We.sendKeys(Keys.ENTER);
		
		AppointmentsPage app = new AppointmentsPage(driver);
		Thread.sleep(2000);
		//app.clickPhysicanTextfield();
		app.setPhysicanTextfield(Phyname);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		//app.ClickEightTimeslot();
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//th[text()='08:00']"));
		act.doubleClick(ele).perform();
		driver.switchTo().alert().accept();
		app.VerifyAppoinmentBookingpopup();
		app.setUHIDinAppointmentBooking(Username);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		PChartID = app.GetPChartID();
		
		app.clickResourceDDinAppBook();
		app.clickDPUinResourceDD();
		driver.switchTo().alert().accept();
		app.clickSaveinAppBook();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		//app.ClickCloseReport();
		System.out.println("Pch"+PChartID);
		app.ClickFirstPatient(PChartID);
		app.ClickRevisit();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		hp.clickCompanyLogo();
		

		
		
		
	}

}
