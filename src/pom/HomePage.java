package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	//Find User Name 
	@FindBy(id="navbarDropdownMenuLink")
	public WebElement Userid;
	
	//Find Logout Button
	@FindBy(id = "btnlog")
	public WebElement logout;
	
	//Click on Menu Slider
	@FindBy(xpath = "//button[@class = 'btn']")
	public WebElement SideBar;
	
	//Click on Module Text field
	@FindBy(id="txtSearchModule")
	public WebElement ModuleTextfield;
	
	//Go to Home Page
	@FindBy(id = "imgLogo")
	public WebElement CompanyLogo;

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	public void UserName() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Userid)).click();
	}
	
	public void logout () {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(logout)).click();
	}
	
	public void SideBar() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SideBar)).click();
	}
	
	public void ModuleTextfield() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ModuleTextfield)).click();
	}
	
	public void ModuleSearchfield(String ModuleNames) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ModuleTextfield)).sendKeys(ModuleNames);
	}
	
	public void clickCompanyLogo() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CompanyLogo)).click();
	}

}
