package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegistrationPage extends BasePage {
	
	//Find UHID field
	@FindBy(xpath="//input[@id='cpBody_txtHospIdNo']")
	private WebElement UHID;
	
	//Find Title drop down
	@FindBy(xpath = "//div[@id='cpBody_cmbFirstName_chosen']")
	private WebElement TitleDD;
	
	//Click on Mr in Title drop down
	@FindBy(xpath = "//li[text()='Mr']")
	private WebElement Mr;
	
	//Find first name text field
	@FindBy(xpath = "//input[@id='cpBody_txtFirstName']")
	private WebElement FirstName;
	
	//Find last Name text field
	@FindBy(xpath = "//input[@id='cpBody_txtSurName']")
	private WebElement LastName;
	
	//Find Payment Source drop down
	@FindBy(xpath = "//div[@id='cpBody_cmbStatus_chosen']")
	private WebElement PaymentSource;
	
	
	//Find Local Patient drop down in Payment Source 
	@FindBy(xpath = "//li[text()='LOCAL PATIENT']")
	private WebElement LocalPatient;
	
	//Find Mobile Number text field
	@FindBy(xpath = "//input[@id='cpBody_txtPhone']")
	private WebElement MobileNum;
	
	//Find Department drop down
	@FindBy(xpath = "//div[@id='cpBody_cmbDepartment_chosen']")
	private WebElement DepartmentDD;
	
	//Find 24/7 Depart Statement store
	@FindBy(xpath = "//li[text()='CLINICAL LABORATORY']")
	private WebElement Deptstore;
	
	//Find Primary Introducing Source
	@FindBy(xpath = "//div[@id='cpBody_drpRefList_chosen']")
	private WebElement PrimaryIntroSource;
	
	//Find AM Studio Ozz Ltd
	@FindBy(xpath = "//li[text()='A.M. STUDIO OZZ LTD']")
	private WebElement AMSTUDIO;
	
	//Find Save Button
	@FindBy(xpath = "//button[@id='btnSaveRegistration']")
	private WebElement Save;
	
	//Find OK Button in Patient Registered Sucessfully pop up
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement OKButton;
	
	
	
	

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	

	
	//Verify UHID text field
	public void veriifyUHIDfield() throws InterruptedException {
		Thread.sleep(2000);
		String actualmsg = UHID.getText();
		String expectedmsg = "";
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	
	//Copy UHID from UHID text field
	public void CopyUHID() {
	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).getText();
		
	}
	
	//Click on Title drop down
	public void clickTitle() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TitleDD)).click();
	}
	
	//Click on Mr in Title drop down
	public void ClickMr() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Mr)).click();
		
	}
	
	//Send data to first name text field
	public void setFirstName(String FN) throws InterruptedException {
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys(FN);
		
	}
	
	//Send Data to Last Name text field
	public void setLastName(String LN) throws InterruptedException {
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LastName)).sendKeys(LN);
		
	}
	
	//Click on Payment Source text field 
	public void clickPaymentSource() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PaymentSource)).click();
		
	}
	
	//Click on Local Patient in Payment Source drop down
	public void clickLocalPatient() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LocalPatient)).click();
		
	}
	
	//Send data to mobile number text field
	public void setMobileNum(String MobileNo) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MobileNum)).sendKeys(MobileNo);
		
	}
	
	//Click on Department drop down
	public void clickDepartmentDD() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DepartmentDD)).click();
		
	}
	
	//Click on 24/7 department store
	public void clickClinicalLab() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Deptstore)).click();
		
	}
	
	//Click on Primary Introducing Source
	public void clickPrimaryIntroSource() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrimaryIntroSource)).click();
		
	}
	
	//Click on AM Studio Ozz Ltd
	public void clickAMSTUDIO() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AMSTUDIO)).click();
		
	}
	
	//Click on Save button
	public void clickSave() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		
	}
	
	//Click on OK button
	public void clickOKBtn() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OKButton)).click();
		
	}
}
