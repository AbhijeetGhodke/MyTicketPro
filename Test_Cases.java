package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.TestCases;
import pages.loginPage;

public class Test_Cases extends baseClass {
	 
	@Test 	
	public void TestCase260() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case260=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url2"));


		case260.email().sendKeys(p.toReadDataFromPropertyFile("userName1"));
		Thread.sleep(1000);
		case260.password().sendKeys(p.toReadDataFromPropertyFile("password1"));
		Thread.sleep(1000);
		case260.login().click();
		Thread.sleep(1000);
		driver.navigate().refresh(); 
		Thread.sleep(3000);
		String tabname=case260.tickeManagementoption().getText();
		 
		
		 if (tabname.equalsIgnoreCase("Ticket Management")) {
			 System.out.println("Test 260 Pass");
		 }
		 else {
			 System.out.println("Test 260 Fail");
		 }
	}

	@Test
public void TestCase261() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case261=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case261.tickeManagementoption().click();
		
		String myticket=case261.myTicket().getText();
		String createticket=case261.createTicket().getText();
		 
		
		if (myticket.equalsIgnoreCase("My Tickets")|| createticket.equalsIgnoreCase("Create Ticket")) {
			
			System.out.println("Test 261 Pass");
		}
		else {
			System.out.println("Test 261 Fail");
		}
		
	}	
	
	@Test
public void TestCase262() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case262=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case262.tickeManagementoption().click();
		Thread.sleep(1000);
		
		case262.myTicket().click();
		Thread.sleep(1000);

		String pagetitle=driver.getTitle();
  
		if (pagetitle.equalsIgnoreCase("Ticket System")){
			
			System.out.println("Test 262 Pass");
		}
		else {
			System.out.println("Test 262 Fail");
		}
 	
	}
	
	@Test
public void TestCase263() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case263=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case263.tickeManagementoption().click();
		Thread.sleep(1000);
		
		case263.myTicket().click();
		Thread.sleep(1000);

		String pagetitle=driver.getTitle();
		  
		if (pagetitle.equalsIgnoreCase("Ticket System")){
			
			System.out.println("Test 263 Pass");
			ss.getAshot(driver, "All my tickets");
		}
		else {
			System.out.println("Test 263 Fail");
		}
 	
	}
	
	@Test
public void TestCase264() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case264=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case264.tickeManagementoption().click();
		Thread.sleep(1000);
		
		case264.myTicket().click();
		Thread.sleep(1000);
		
		case264.addProductLink().click();

		String pagetitle=driver.getTitle();
		  
		if (pagetitle.equalsIgnoreCase("Ticket System")){
			
			System.out.println("Test 264 Pass");
			 
		}
		else {
			System.out.println("Test 264 Fail");
		}
 	
	}
	
	@Test
public void TestCase265() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case265=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case265.tickeManagementoption().click();
		Thread.sleep(1000);
		
		case265.myTicket().click();
		Thread.sleep(1000);
		
		case265.addProductLink().click();

		String ticketDate=case265.ticketDate().getAttribute("value");
		 
		  
		if (ticketDate.equals("2022-05-15")){
			
			System.out.println("Test 265 Pass");
			 
		}
		else {
			System.out.println("Test 265 Fail");
		}
 	
	}
	
	@Test
public void TestCase266() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case266=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		String ticketDate=case266.ticketDate().getAttribute("value");
	 
		String expectedDate=case266.expectedDate().getAttribute("value");

		if (expectedDate!=ticketDate) {
			
			System.out.println("Test 266 Pass");
	 		
		}
		else
		{
			System.out.println("Test 266 Fail");
		}
   
	}
	
	@Test
public void TestCase267() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case267=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		
		case267.projectID().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(case267.projectID(), "Ticketing System");
		
		case267.moduleID().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(case267.moduleID(), "Internal Communication");
		
		case267.submoduleID().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(case267.submoduleID(), "Tickets");
		
		case267.assignUser().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(case267.assignDepartment(), "IT Testing");
		ss.getAshot(driver, "Assign users list");
		
  
	}
	
	@Test
public void TestCase268() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case268=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case268.assignDepartment().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(case268.assignUser(),"Monika Dilip Kolpe");
		
		ss.getAshot(driver, "Assign Department list");
		
  
	}
	
	@Test
public void TestCase269() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case269=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case269.ticketType().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(case269.ticketType(), "New");
		
		ss.getAshot(driver, "Ticket list");
  
	}
	
	
	@Test
public void TestCase270() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case270=new TestCases (driver);
		loginPage lp=new loginPage(driver);
	 
		/* case270.priorityList().click(); */
		Thread.sleep(1000);
		/*
		 * utilities.toSelectFromDropDown(case270.priorityList(), "Medium");
		 * ss.getAshot(driver, "Priority list");
		 */
		
		Select drpCountry = new Select(driver.findElement(By.name("priority")));
		drpCountry.selectByValue("Medium");
		System.out.println("Test 276 Pass"); 
 
} 
	
	@Test
public void TestCase271() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case271=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		/*
		 * case271.statusList().click(); Thread.sleep(1000);
		 * utilities.toSelectFromDropDown(case271.statusList(), "In Progress");
		 */
		Thread.sleep(1000);
		Select drpCountry = new Select(driver.findElement(By.id("status_id")));
		drpCountry.selectByValue("2");
		ss.getAshot(driver, "Status list");
} 
	@Test
public void TestCase272() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case272=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case272.statusList().click();
		Thread.sleep(1000);
		
		ss.getAshot(driver, "Mandatory Sign screenshot");
} 
	
	@Test
public void TestCase273() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case273=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		
		case273.descriptionField().sendKeys("Test.....");
		Thread.sleep(1000);
		
		case273.descriptionField().clear();
		Thread.sleep(1000);

		 WebElement m = driver.findElement(By.id("description"));
		 m.sendKeys("Tested.....");
		 String abc=m.getAttribute("value");
		 System.out.println("ABC:- "+abc);
		 
		 
 
} 
	@Test
public void TestCase274() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case274=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		Thread.sleep(1000);
		
		case274.attachFile().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
		Thread.sleep(1000);
 
} 
	
	@Test
public void TestCase275() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case275=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		
		Thread.sleep(1000);
	  
 		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView()", case275.createTicketbutton());
		Thread.sleep(1000);
		case275.createTicketbutton().click();
	   
		} 
	 
public void TestCase278() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case278=new TestCases (driver);
		loginPage lp=new loginPage(driver);
	
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,450)");
		 * case278.editTicketbutton().click();
		 */
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView()", case278.editTicketbutton());
		case278.editTicketbutton().click();
		
		Thread.sleep(1000); 
		ss.getAshot(driver, "Edit page data");
		
	}	

public void TestCase277() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case277=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	
	String currentDate=case277.ticketDate().getAttribute("value");
	System.out.println(currentDate);
	
	 String expectedDate=case277.expectedDate().getAttribute("value");
	 System.out.println(expectedDate);
	 
	 if (expectedDate.compareTo(currentDate)>=0){
		 
		 System.out.println("Test 277 Pass");
		 Thread.sleep(1000);
		 case277.expectedDate().sendKeys("2022-05-25");
		 
	 }
	 else { 
		 System.out.println("Test 277 Fail");
	 }
  
}
public void TestCase281() throws FileNotFoundException, IOException, InterruptedException, Exception {
	
	TestCases  case281=new TestCases (driver);
	loginPage lp=new loginPage(driver);
  
}

}
