package pom;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AppointmentsPage extends BasePage{
	
	//Find Physician Text field
	@FindBy(id="cpBody_txtSrchHrPhyRes1")
	private WebElement physicianTextfield;
	
	//Find Time Slot 8'o clock
	@FindBy(xpath = "//th[text()='08:30']")
	private WebElement EightTimeslot;
	
	//Find Appointment Booking pop up
	@FindBy(id="cpBody_usrAppAvailable_H2")
	private WebElement AppointmentBookingpopup;
	
	//find UHid text field in appointment booking pop up
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppUhid")
	private WebElement UHIDinAppointmentBooking;
	
	//Find Resource drop down
	@FindBy(id="cpBody_usrAppAvailable_usrOTBooking_cmbAppResource_chosen")
	private WebElement ResourceDDinAppBook;
	
	//Find General Operating Theater in Resource Drop down
	@FindBy(xpath = "//li[text()='Day Procedure Unit']")
	private WebElement DPUinResourceDD;
	
	//Find Save Button in Appointment Booking pop up
	@FindBy(id="cpBody_usrAppAvailable_btnAppointmentSave1")
	private WebElement SaveinAppBook;
	
	@FindBy(id="cpBody_usrAppAvailable_usrOTBooking_txtAppUhid")
	private WebElement PChartID;
	
	//Find Close Button in Appointment report
	@FindBy(id = "btnmodalClose")
	private WebElement CloseReport;
	
	//Select the Appointed patient
	@FindBy(xpath = "(//div[contains (text(),'EVAN0')])")
	private WebElement FirstPatient;
	
	//Find Revisit Patient Button
	@FindBy(id="cpBody_btnPatRevisit")
	private WebElement Revisit;

	public AppointmentsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void clickPhysicanTextfield() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(physicianTextfield)).click();
		
	}
	 public void setPhysicanTextfield(String Phyname) {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(physicianTextfield)).sendKeys(Phyname);
	 }
	 
	 public void ClickEightTimeslot() {
		 
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(EightTimeslot)).click();
		
	}
	 
	 public void VerifyAppoinmentBookingpopup() {
		 String actual = AppointmentBookingpopup.getText();
		 String expected = "Appointment Booking";
		 Assert.assertEquals(expected, actual);
	 }
	 
	 public void clickUHIDinAppointmentBooking() {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDinAppointmentBooking)).click();
	 }
	 
	 public void setUHIDinAppointmentBooking(String Name) {
		 
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDinAppointmentBooking)).sendKeys(Name);
		
	}
	 
	 public void clickResourceDDinAppBook() {
		 
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ResourceDDinAppBook)).click();
	 }
	 
	 public void clickDPUinResourceDD() {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DPUinResourceDD)).click();
		 
	 }
	 
	 public void clickSaveinAppBook()  {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SaveinAppBook)).click();
	 }
	 public String GetPChartID() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;  

		 WebElement inpElement = driver.findElement(By.id("cpBody_usrAppAvailable_usrOTBooking_txtAppUhid"));
		 String UHID = (String) js.executeScript("return arguments[0].value", inpElement);
		 return UHID;
	 }
	 
	 public void ClickCloseReport() {
		 
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CloseReport)).click();
	 }
	 
	 public void ClickFirstPatient(String PChartID) throws InterruptedException {
		 Thread.sleep(2000);
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@title, '"+PChartID+"')])"))).click();
	 }

	 
	 public void ClickRevisit() {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Revisit)).click();
	 }

}
