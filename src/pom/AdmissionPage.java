package pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdmissionPage extends BasePage {
	
	//Verify Admission page Title
	@FindBy(id="ModuleName")
	private WebElement AdmissionModule;
	
	//Find UHID text field
	@FindBy(id = "cpBody_txtUHID")
	private WebElement UHIDField;
	
	//Find Primary Introducing Source Drop down
	@FindBy(id="cpBody_cmbPInSource_chosen")
	private WebElement PISourceDropdown;
	
	//Find AM Studio in Primary Introducing Source Drop down
	@FindBy(xpath = "//li[text()='A.M. STUDIO OZZ LTD']")
	private WebElement AMStudioInPIS;
	
	//Find Attending Physican Drop down
	@FindBy(id="cpBody_cmbAttPhy_chosen")
	private WebElement AttendingPhysicanDD;
	
	//Find text field in attending physican drop down
	@FindBy(xpath = "//div[@id='cpBody_cmbAttPhy_chosen']//input[@class='chosen-search-input']")
	private WebElement TextfieldAttendPhy;
	
	//Fin PIC drop down
	@FindBy(id = "cpBody_cmbPIC_chosen")
	private WebElement PICDropdown;
	
	//Find Reason for Admission text field
	@FindBy(id="cpBody_txtRAdmission")
	private WebElement ReasonForAdmission;
	
	//Find Bed View Icon
	@FindBy(id="iconBed")
	private WebElement BedViewicon;
	
    //Find Avaliable Radio button in bed view
	@FindBy(id="cpBody_chkAvl")
	private WebElement AvailableRadiobutton;
	
	//Find first available bed in bed view drop down
	@FindBy(xpath = "(//div[@class='col-md-2 rounded-pill btn btn-success p-2 m-2'])[1]")
	private WebElement AvailableBed;
	
	//Find Ward Name drop down
	@FindBy(id="cpBody_usrWard_cmbWard_chosen")
	private WebElement WardNameDropdown;
	
	//Find Save Button
	@FindBy(id = "btnSaveAd")
	private WebElement SaveinAdm;
	
	//Find Print Button in Admission Saved pop up
	@FindBy(xpath = "//button[text()='Print']")
	private WebElement PrintBtn;
	
	//Find close button in Admission Report
	@FindBy(id="btnmodalClose")
	private WebElement CloseAdmReport;
	
	
	
	
	
	public AdmissionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Click on UHID text field
	public void clickUHID() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDField)).click();
	}

	//Enter UHID or Name
	public void SetUHID(String UHID) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDField)).sendKeys(UHID);
		
	}
	
	//Verify Admission page is displayed
	public void VerifyAdmissionPage() {
		
		String actual = AdmissionModule.getText();
		String expected = "ModuleName";
		Assert.assertEquals(expected, actual);
		
	}
	
	//Click on Primary Introducing drop down
	public void ClickPISourceDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PISourceDropdown)).click();
	}
	
	//Click on Am Studio in Primary Introducing source Drop down
	public void ClickAMStudioInPIS() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AMStudioInPIS)).click();
	}
	
	//Click on Attending Physician drop down
	public void ClickAttendingPhysicanDD() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AttendingPhysicanDD)).click();
		
	}
	
	//Click on Text field in attending physian drop down
	public void setTextfieldAttendPhy(String Phyname) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TextfieldAttendPhy)).sendKeys(Phyname,Keys.ENTER);
		
	}
	

	
	//Send Text for Reason For Admission text field
	public void SetReasonForAdmission(String Text) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReasonForAdmission)).sendKeys(Text);
		
	}
	
	//Click on  PIC drop down 
	public void clickPICDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PICDropdown)).click();
		
	}
	
	//Click on Bed View Icon
	public void clickBedViewicon() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BedViewicon)).click();
	}
	
	//Click on Available radio button
	public void clickAvailableRadiobutton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AvailableRadiobutton)).click();
		
	}
	
	//Click on First Available drop down in Bed View page
	public void clickAvailableBed() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AvailableBed)).click();
		
	}
	
	//Click on Ward Name Drop down
	public void clickWardNameDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(WardNameDropdown)).click();
		
	}
	//Click on Save Button in Admission
	public void clickSaveinAdm() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SaveinAdm)).click();
		
	}
	
	//Click on Print button in Admission Saved pop up
	public void clickPrintbtn() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrintBtn)).click();
		
	}
	
	//Click close button in admission report
	public void clickCloseAdmReport() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CloseAdmReport)).click();
		
	}

}
