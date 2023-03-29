package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChargesheetPage extends BasePage{
	
	//Find UHID field
	@FindBy(id = "cpBody_txtPChartCode")
	private WebElement UHIDfield;
	
	//Find Department drop down
	@FindBy(id = "cpBody_cmbDepartment_chosen")
	private WebElement DepartmentDropdown;
	
	//Find general ward drop down
	@FindBy(xpath = "//li[text()='GENERAL WARD']")
	private WebElement GeneralWard;
	
	//Find Service Text field
	@FindBy(xpath = "//input[@id='cpBody_txtService']")
	private WebElement Servicetextfield;
	
	//Find Clear button
	@FindBy(id="cpBody_btnBillClose")
	private WebElement ClearButton;
	
	//Find Save button
	@FindBy(id="btnSave")
	private WebElement SaveButton;
	
	//Find Advance Search button
	@FindBy(id="btnPatSearch")
	private WebElement AdvanceSearch;
	
	//Find Search through result field
	@FindBy(id = "txtAdSearch")
	private WebElement SearchTextfield;
	
	//Find Service and Product Slider
	@FindBy(xpath = "//span[@class='slider round']")
	private WebElement SrvProSlider;
	
	//Find Product Department drop down
	@FindBy(id = "cpBody_drpDept_chosen")
	private WebElement ProdDropdown;
	
	//Find Hospital Main Stores in Department drop down
	@FindBy(xpath = "//li[text()='HOSPITAL MAIN STORES']")
	private WebElement Hospmainstore;
	
	//Find General Ward in Department drop down for products
	@FindBy(xpath = "//li[text()='GENERAL WARD']")
	private WebElement GeneralWardProd;
	
	//Find OK button in Select Store Department
	@FindBy(id = "btnCloseDept")
	private WebElement OKinDepdd;
	
	//Find Add button to Add Products to Grid
	@FindBy(id = "btnAddProducts")
	private WebElement AddProduct;
	
	//Find the Batch drop down for the products
	@FindBy(id = "cpBody_cmbBatchList_chosen")
	private WebElement ProductBatch;
	
	//Find Remarks Text field
	@FindBy(id = "cpBody_txtRemarks")
	private WebElement Remarks;
	
	
	
	
	
	
	

	public ChargesheetPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	//Send data to UHID text field
	public void setUHIDfield(String UHID) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDfield)).sendKeys(UHID);
		
	}
	
	//Click on Department drop down
	public void clickDepartmentDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DepartmentDropdown)).click();
		
	}
	
	//Click General Ward drop down
	public void ClickGeneralWard() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GeneralWard)).click();
		
	}
	
	//Send data to service text field
	public void setServicetextfield(String Service) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Servicetextfield)).sendKeys(Service);
		
	}
	
	//Click on Clear button 
	public void clickClearButton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClearButton)).click();
		
	}
	
	//Click on Save button
	public void clickSaveButton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
		
	}
	
	//Click on Advance Search
	public void clickAdvanceSearch() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdvanceSearch)).click();
		
	}
	
	//Verify Advanced Search tab is displayed
	public void VerifyAdvanceSearchtab() {
		String Actual = driver.findElement(By.id("h3PatientSearch")).getText();
		String Expected = "Advanced Search";
		Assert.assertEquals(Expected, Actual);
		
	}
	
	//Send data to Search text field in advanced search tab
	public void setSearchTextfield(String UHID) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchTextfield)).sendKeys(UHID);
		
	}
	
	//Click on Service Product Slider
	public void ClickSrvProSlid() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SrvProSlider)).click();
	
	}
	
	//Verify Select Store Department pop up
	public void VerifyStoreDepPopup() {
		String Actual = driver.findElement(By.xpath("//h5[text()='Select Store Department']")).getText();
		String Expected = "Select Store Department";
		Assert.assertEquals(Expected, Actual);
		
	}
	
	//Click on Product Drop down
	public void ClickProdDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ProdDropdown)).click();
		
	}
	
	//Click Hospital Main Store Drop down for Products
	public void clickHospmainstore() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Hospmainstore)).click();
		
	}
	
	//Click General Ward drop down in Department drop down for Products
	public void name() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GeneralWardProd)).click();
	}
	
	//Click on OK in Department Drop down for Products
	public void clickOKinDepdd() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OKinDepdd)).click();
		
	}
	
	//Click on Add button to Add the selected products
	public void ClickAddProduct() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddProduct)).click();
		
	}
	
	//CLick on Product Batch drop down to select batch for the Product
	public void clickProductBatchdd() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ProductBatch)).click();
		
	}
	
	//Send Data to Remarks text field
	public void setRemarks(String remarks) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Remarks)).sendKeys(remarks);
		
	}

}
