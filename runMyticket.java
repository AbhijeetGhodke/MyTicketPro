package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.loginPage;
import pages.myTicket;

public class runMyticket extends baseClass {
	@Test
	
	public void RunMyTicket() throws FileNotFoundException, IOException, InterruptedException {
		
		myTicket mt=new myTicket(driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url"));
		
		mt.email().sendKeys(p.toReadDataFromPropertyFile("userName"));
		Thread.sleep(1000);
		mt.password().sendKeys(p.toReadDataFromPropertyFile("password"));
		Thread.sleep(1000);
		mt.login().click();
		Thread.sleep(1000);
		 
		mt.tickeManagementoption().click();
		Thread.sleep(1000);
		
		mt.myTicketoption().click();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
	 
		 
		mt.ticketId().sendKeys("TT2187"); Thread.sleep(1000);
		 
		mt.searchOption().click(); Thread.sleep(1000);
		 
		String TicketID=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[3]/span")).getText();
		System.out.println("Ticket ID:- s"+TicketID);
		
		if (TicketID.equals("TT2187")) {
			
			System.out.println("Ticket Already Added, please go through a add procedure..");
			ss.getAshot(driver, "Duplicate Ticket ID TT2187 Not Allow");
			
			if (!TicketID.equals("T20223")) {
				
				System.out.println("You are here...........");
				Thread.sleep(1000);
				
				mt.tickeManagementoption().click();
				Thread.sleep(1000);
				
				mt.myTicketoption().click();
				Thread.sleep(1000);
				
				mt.createTickets().click();
				Thread.sleep(1000);
				
				String currentDate=mt.ticketDate().getAttribute("value");
				
				System.out.println(currentDate);
				
				if (currentDate.equalsIgnoreCase("2022-04-09")) {
					
					mt.expectedDate().sendKeys("15/04/2022");
					Thread.sleep(1000);
					
					mt.cuID().sendKeys("CU1278");
					Thread.sleep(1000);
					
					mt.projectId().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.projectId(),"Ticketing System" );
					
					mt.moduleId().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.moduleId(),"Internal Communication" );
					
					mt.submoduleId().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.submoduleId(),"Tickets" );
					
					Thread.sleep(1000);
		 
					mt.assignDepartment().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.assignDepartment(),"IT Testing" );
					
					
					mt.assignUser().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.assignUser(),"Monika Dilip Kolpe" );
					
					mt.typeId().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.typeId(),"New" );
					
					mt.priority().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.priority(),"Medium" );
					

					mt.statusId().click();
					Thread.sleep(1000);
					utilities.toSelectFromDropDown(mt.statusId(),"In Progress" );
					
					JavascriptExecutor js1= (JavascriptExecutor) driver;
					js1.executeScript("window.scrollBy(0,250)");
					Thread.sleep(2000);
					
					mt.description().sendKeys("Test Ticket, please ignore. ");
					Thread.sleep(1000);
					
					
					JavascriptExecutor Js=(JavascriptExecutor) driver;
					Js.executeScript("arguments[0].scrollIntoView();", mt.attachment());
					
					mt.attachment().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
					
					Thread.sleep(1000);
					 
					
					mt.createButton().click();
					
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
		else {
			
			System.out.println("There is something went wrong");
		}
	}
	
	
}
