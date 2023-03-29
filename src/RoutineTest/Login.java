package RoutineTest;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.HomePage;
import pom.LogInPage;

public class Login extends BaseTest {
	
	@Test
	public void TestValidLogin() throws InterruptedException  {
		String un = Excel.getCellData(INPUT, "Credentials", 0, 1);
		String pwd = Excel.getCellData(INPUT, "Credentials", 1, 1);
		
		LogInPage logIn = new LogInPage(driver);
				logIn.VerifyLoginPageTitle();
				logIn.setUsername(un);
				logIn.setPassword(pwd);
				logIn.clickLogin();
				Thread.sleep(2000);
				logIn.VerifyHomeTitle();
				
	}
	

}
