package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.homePage;
import pages.loginPage;
import pages.statusMasterPage;

public class statusMasterTest extends baseClass{

	
	@Test
	public void statusMaster() throws FileNotFoundException, IOException, InterruptedException{
		
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		statusMasterPage smp = new statusMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get(p.toReadDataFromPropertyFile("url"));
		Thread.sleep(2000);
		
		lp.emailAddress().sendKeys(p.toReadDataFromPropertyFile("userName"));
		Thread.sleep(2000);
		
		lp.password().sendKeys(p.toReadDataFromPropertyFile("password"));
		Thread.sleep(2000);
		
		lp.login().click();
		Thread.sleep(2000);
		
		hp.masters().click();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", hp.statusMaster());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "statusMasterPage");
		Thread.sleep(2000);
		
		//addbutton is clickable or not
		smp.addBtn().isEnabled();
		System.out.println("add button is clickable");
		
		smp.addBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "addStatusPage");
		Thread.sleep(2000);
		
		smp.labelEnterStatus().isDisplayed();
		System.out.println("Label is: " +smp.labelEnterStatus().getText());
		Thread.sleep(2000);
		
		smp.enterStatus().sendKeys(p.toReadDataFromPropertyFile("enterStatus"));
		Thread.sleep(2000);
		
		smp.labelEnterRemark().isDisplayed();
		System.out.println("label is: " +smp.labelEnterRemark().getText());
		Thread.sleep(2000);
		
		smp.enterRemark().sendKeys(p.toReadDataFromPropertyFile("enterRemark"));
		Thread.sleep(2000);
		
		//smp.labelSelectStatus().isDisplayed();
		if(smp.labelSelectStatus().isDisplayed()){
			System.out.println("radio button is displayed");
		}else{
			System.out.println("radio button not display");
		}
		Thread.sleep(2000);
		
		smp.yesRadioBtn().click();
		Thread.sleep(2000);
		
		//cancel button
				
		if(smp.cancelBtn().isDisplayed()){
			System.out.println("cancel button is displayed");
		}else{
			System.out.println("cancel button not display");
		}
		
		//update button 
		
		if(smp.updateBtn().isDisplayed()){
			System.out.println("button is present");
		}else{
			System.out.println("button not present");
		}
		Thread.sleep(2000);
		
		if(smp.updateBtn().isEnabled()){
			System.out.println("update button is clickable");
		}else{
			System.out.println("update button not clickable");
		}
		Thread.sleep(2000);
		
		smp.updateBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "addRecord");
		Thread.sleep(2000);
		
		
		
	}
}
