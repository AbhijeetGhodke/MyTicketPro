package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.addTicket;
import pages.editTicket;
import pages.loginPage;

public class runEditTicket extends baseClass {

	@Test
	
	public void editticket() throws FileNotFoundException, IOException, InterruptedException {
		
		
		editTicket et=new editTicket(driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url2"));
		
		et.email().sendKeys(p.toReadDataFromPropertyFile("userName1"));
		Thread.sleep(1000);
		et.password().sendKeys(p.toReadDataFromPropertyFile("password1"));
		Thread.sleep(1000);
		et.login().click();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		 
		et.tickeManagementoption().click();
		Thread.sleep(1000);
		
		et.myTicketoption().click();
		Thread.sleep(1000);
		
		et.editOption().click();
		Thread.sleep(1000);

		
		et.projectId().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(et.projectId(),"Connect-Us" );
		
		et.moduleId().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(et.moduleId(),"Billing" );
		
		et.submoduleId().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(et.submoduleId(),"plan" );
		
		et.priority().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(et.priority(),"Low" );
		

		et.statusId().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(et.statusId(),"In Progress" );
		
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		
		et.description().sendKeys("Test Ticket, please ignore. ");
		Thread.sleep(1000);
		
		
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView();", et.attachment());
		
		et.attachment().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
		
		Thread.sleep(1000);
		 
		
		et.updateButton().click();
		Thread.sleep(1000);
		
		 String MyTitle=driver.getTitle();
		 
		 System.out.println("My title:- "+MyTitle);
		 
		 if (MyTitle.equalsIgnoreCase("Ticket System")) {
			 
			 System.out.println("Test Case Pass");
		 }
		 else
		 {
			 System.out.println("Test Case Fail");
		 }
 
	}
}
