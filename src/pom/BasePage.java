package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {


	 WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;
	}

	

	public void verifyTitle(String eTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 010);

		try {
			wait.until(ExpectedConditions.titleContains(eTitle));
			Reporter.log("Title is matching : PASS", true);
		} catch (Exception e) {
			Reporter.log("Title is not  matching : PASS", true);
			Assert.fail();
		}
	}
}
