package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.addTicket;
import pages.loginPage;
import pages.myTicket;

public class RunAddTicket extends baseClass {
	
	@Test
	public void RunAddTickets() throws FileNotFoundException, IOException, InterruptedException {
		
		
		addTicket at=new addTicket(driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url2"));
		
		at.email().sendKeys(p.toReadDataFromPropertyFile("userName1"));
		Thread.sleep(1000);
		at.password().sendKeys(p.toReadDataFromPropertyFile("password1"));
		Thread.sleep(1000);
		at.login().click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		 
		at.tickeManagementoption().click();
		Thread.sleep(1000);
		
		at.myTicketoption().click();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		at.addTicketoption().click();
		Thread.sleep(1000);
	 
		String currentDate=at.ticketDate().getAttribute("value");
		
		System.out.println(currentDate);
		
		if (currentDate.equalsIgnoreCase("2022-04-11")) {
			
			at.expectedDate().sendKeys("15/04/2022");
			Thread.sleep(1000);
			
			at.cuID().sendKeys("CU1234");
			Thread.sleep(1000);
			
			at.projectId().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.projectId(),"Ticketing System" );
			
			at.moduleId().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.moduleId(),"Internal Communication" );
			
			at.submoduleId().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.submoduleId(),"Tickets" );
			
			Thread.sleep(1000);
 
			at.assignDepartment().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.assignDepartment(),"IT Testing" );
			
			
			at.assignUser().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.assignUser(),"Monika Dilip Kolpe" );
			
			at.typeId().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.typeId(),"New" );
			
			at.priority().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.priority(),"Medium" );
			

			at.statusId().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(at.statusId(),"In Progress" );
			
			JavascriptExecutor js1= (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			
			at.description().sendKeys("Test Ticket, please ignore. ");
			Thread.sleep(1000);
			
			
			JavascriptExecutor Js=(JavascriptExecutor) driver;
			Js.executeScript("arguments[0].scrollIntoView();", at.attachment());
			
			at.attachment().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
			
			Thread.sleep(1000);
			 
			
			at.createButton().click();
			
			String PageTitle=driver.getTitle();
			
			System.out.println(PageTitle);
			
			if (PageTitle.equalsIgnoreCase("Ticket System")) {
				System.out.println("Test Case Pass");
			}
			
			else
			{
				System.out.println("Test Case Fail");
			}
		}
		
	}

}
