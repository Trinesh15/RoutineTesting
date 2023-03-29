package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillEstimatePage extends BasePage {
	
	//Find UHID Text field
	@FindBy(id = "cpBody_txtUHID")
	private WebElement UHID;
	
	//Find Services text field
	@FindBy(id = "cpBody_txtService")
	private WebElement SrvProTextfield;
	
	//Find Service and Product Slider
	@FindBy(id="ProductSwitch")
	private WebElement SrvSlider;
	
	
	public BillEstimatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	//Send Data to UHID Text field
	public void setUHID(String uhid) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).sendKeys(uhid);
		
	}
	
	//Send Data to Service Text field
	public void setSrvProTextfield(String SrvPro) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SrvProTextfield)).sendKeys(SrvPro);
		
	}
	
	//Click on Servicer and Product slider
	public void clickSrvSlider() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SrvSlider)).click();
		
	}

}