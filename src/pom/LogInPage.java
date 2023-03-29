package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogInPage extends BasePage {

	// Username
	@FindBy(xpath = "//input[@id='inputUser']")
	private WebElement Username;

	// Password
	@FindBy(xpath = "//input[@id='inputPassword']")
	private WebElement Password;

	// Choose module
	@FindBy(xpath = "//div[@id='drpModule_chosen']")
	private WebElement ChooseModule;

	// Home module
	@FindBy(xpath = "//div//li[text()='Home']")
	private WebElement Home;

	// Edit NHS claim module
	@FindBy(xpath = "//div//li[text()='Edit NHS Claim']")
	private WebElement Edit_NHS_Claim;

	// Laboratory
	@FindBy(xpath = "//div//li[text()='Laboratory Results']")
	private WebElement Laboratory_Results;

	// Chargesheet
	@FindBy(xpath = "//div//li[text()='Chargesheet']")
	private WebElement Chargesheet;

	// Receipts
	@FindBy(xpath = "//div//li[text()='Receipts']")
	private WebElement Receipts;

	// Statement of account
	@FindBy(xpath = "//div//li[text()='Statement of Account']")
	private WebElement StatementOfAccount;

	// Billing
	@FindBy(xpath = "//div//li[text()='Billing']")
	private WebElement Billing;

	// Debit invoice
	@FindBy(xpath = "//div//li[text()='Debit Invoice']")
	private WebElement Debit_Invoice;

	// Registration
	@FindBy(xpath = "//div//li[text()='Registration']")
	private WebElement Registration;

	// Appointment
	@FindBy(xpath = "//div//li[text()='Appointments']")
	private WebElement Appointments;

	// Revisit
	@FindBy(xpath = "//div//li[text()='Re-Visit']")
	private WebElement Re_Visit;

	// Login button
	@FindBy(id="btnLogIn")
	private WebElement LoginBtn;

	// Intialize the element
	public LogInPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Verify Login page title
	public void VerifyLoginPageTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "eBios-Login";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

	// Enter User name
	public void setUsername(String Uname) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Username)).sendKeys(Uname);
		// Username.sendKeys(Uname);
	}

	// Enter password
	public void setPassword(String Pword) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Password)).sendKeys(Pword);
		// Password.sendKeys(Pword);
	}

	// Click on select module dropdown
	public void clickChooseModule() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ChooseModule)).click();
		// ChooseModule.click();
	}

	// Click Home
	public void clickHome() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Home)).click();
		// Home.click();
	}

	// Click on Edit nhs claim
	public void clickEditNHSClaim() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Edit_NHS_Claim)).click();
		// Edit_NHS_Claim.click();
	}

	// Click on Laboratory_Results
	public void clickLaboratory_Results() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Laboratory_Results)).click();
		// Laboratory_Results.click();
	}

	// Click on Chargesheet
	public void clickChargesheet() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Chargesheet)).click();
		// Chargesheet.click();
	}

	// Click on Receipts
	public void clickReceipts() {
		int x = Receipts.getLocation().getX();
		int y = Receipts.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Receipts)).click();
		// Receipts.click();
	}

	// Click on Statement of account
	public void clickStatementOfAccount() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StatementOfAccount)).click();
		// StatementOfAccount.click();
	}

	// Click on Billing
	public void clickBilling() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Billing)).click();
		// Billing.click();
	}

	// Click on debit invoice
	public void clickDebit_Invoice() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Debit_Invoice)).click();
		// Debit_Invoice.click();
	}

	// Click on Registration
	public void clickRegistration() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Registration)).click();
		// Registration.click();
	}

	// Click on Appointment
	public void clickAppointments() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Appointments)).click();
		// Appointments.click();
	}

	// Click on revisit
	public void clickRevisit() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Re_Visit)).click();
		// Re_Visit.click();
	}

	// Click on Login button
	public void clickLogin() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LoginBtn)).click();
		// LoginBtn.click();
	}

	public void UserNotFoundValidation() {
		String ActualResult = driver.switchTo().alert().getText();
		String ExpectedResult = "User not found";
		Assert.assertEquals(ExpectedResult, ActualResult);
	}

	// Verify the Home page title
	public void VerifyHomeTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Welcome";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Home page title
	public void VerifyEditNHSClaimTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Edit NHS Claim";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Appointment page title
	public void VerifyAppointmentsTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Appointments";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Billing page title
	public void VerifyBillingTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Billing";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Charge sheet page title
	public void VerifyChargesheetTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Chargesheet";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Debit Invoice page title
	public void VerifyDebitInvoiceTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Debit Invoice";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Laboratory Results page title
	public void VerifyLaboratoryTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Laboratory Results";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Re visit page title
	public void VerifyRe_VisitTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Re-Visit";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Re visit page title
	public void VerifyReceiptsTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Receipts";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Re visit page title
	public void VerifyRegistrationTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Registration";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Re visit page title
	public void VerifyStatementOfAccountTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Statement of Account";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	// Verify the Re visit page title
	public void VerifyMultiUserValidation() {
		String ActualTitle = driver.switchTo().alert().getText();
		String ExpectedTitle = "Multi-User is not alllowed. Please log out from the same link";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	// Verify the SOA page title
	public void VerifySOAInChooseModule() {
		String Actual = StatementOfAccount.getText();
		String Expected = "Statement of Account";
		Assert.assertEquals(Expected, Actual);
	}

}
