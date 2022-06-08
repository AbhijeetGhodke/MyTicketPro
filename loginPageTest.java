package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import generic.baseClass;
import pages.homePage;
import pages.loginPage;

public class loginPageTest extends baseClass{
		
		@Test
		public void test() throws FileNotFoundException, IOException, InterruptedException{
			
			homePage hp = new homePage(driver);
			loginPage lp = new loginPage(driver);
			
			driver.get(p.toReadDataFromPropertyFile("url"));
			Thread.sleep(2000);
			
			lp.logo().isDisplayed();
			System.out.println("logo is present" +lp.logo());
			Thread.sleep(3000);
			
			lp.emailAddress().sendKeys(p.toReadDataFromPropertyFile("userName"));
			Thread.sleep(2000);
			
			lp.password().sendKeys(p.toReadDataFromPropertyFile("password"));
			Thread.sleep(2000);
			
			lp.login().click();
			Thread.sleep(2000);
			
			ss.takeScreenShot(driver, "homePage");
			Thread.sleep(2000);
			
			hp.profile().isDisplayed();
			System.out.println("profile is displayed" +hp.profile());
			Thread.sleep(2000);
			
			hp.masters().isDisplayed();
			System.out.println("click on:" +hp.masters());
			Thread.sleep(2000);
		}
	
}
