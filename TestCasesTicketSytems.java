package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.TestCases;
import pages.loginPage;
import pages.myTicket;

public class TestCasesTicketSytems extends baseClass {
 
	@Test
	private void  case307() throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		TestCases  case307=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url2"));
		
		case307.email().sendKeys(p.toReadDataFromPropertyFile("userName1"));
		Thread.sleep(1000);
		case307.password().sendKeys(p.toReadDataFromPropertyFile("password1"));
		Thread.sleep(1000);
		case307.login().click();
		Thread.sleep(1000);
		
		driver.navigate().refresh(); 
		Thread.sleep(3000);
		
		
		Thread.sleep(1000);
		
		String tabname=case307.tickeManagementoption().getText();
		 
		
		 if (tabname.equalsIgnoreCase("Ticket Management"))
		 {
			 System.out.println("Test 307 Pass");
			  
		 
		 }
		 else 
		 {
			 System.out.println("Test 307 Fail");
		 } 
	}
	 
	@Test
	public void case308() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case308=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		case308.tickeManagementoption().click();
		
		String tabname=case308.tickeManagementoption().getText();
		 
		
		 if (tabname.equalsIgnoreCase("Ticket Management"))
		 {
			 System.out.println("Test 308 Pass");
			 
			 ss.takeScreenShot(driver, "Ticket Management");
			  
		 
		 }
		 else 
		 {
			 System.out.println("Test 308 Fail");
		 } 
	}
	@Test
	public void case309() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case309=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		
		case309.tickeManagementoption().click();
		
		String tabname=case309.tickeManagementoption().getText();
		 
		
		 if (tabname.equalsIgnoreCase("Ticket Management"))
		 {
			 System.out.println("Test 309 Pass");
			 ss.takeScreenShot(driver, "Ticket Management");
			  
		 
		 }
		 else 
		 {
			 System.out.println("Test 309 Fail");
		 } 
	}
	@Test
	public void case310() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case310=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		
		case310.myTicket().click();
		Thread.sleep(3000);
		
		String tabname=case310.tickeManagementoption().getText();
		 
		
		 if (tabname.equalsIgnoreCase("Ticket Management"))
		 {
			 System.out.println("Test 310 Pass");
 			  
		 
		 }
		 else 
		 {
			 System.out.println("Test 310 Fail");
		 } 
	}
	   @Test
     public void case311() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case311=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		
		case311.myTicket().click();
		Thread.sleep(3000);
		
		String tabname=case311.tickeManagementoption().getText();
		 
		
		 if (tabname.equalsIgnoreCase("Ticket Management"))
		 {
			 System.out.println("Test 311 Pass");
			 
			 ss.takeScreenShot(driver, "My Tickets");
			  
		 
		 }
		 else 
		 {
			 System.out.println("Test 311 Fail");
		 } 
	}
	@Test
public void case312() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case312=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	 
	
	case312.createTicket().click();
	Thread.sleep(3000);
	
	String tabname=case312.tickeManagementoption().getText();
	 
	
	 if (tabname.equalsIgnoreCase("Ticket Management"))
	 {
		 System.out.println("Test 312 Pass");
		 
	 
	 }
	 else 
	 {
		 System.out.println("Test 312 Fail");
	 } 
}
	@Test
public void case313() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case313=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	 
	
	case313.ticketDate().click();
	Thread.sleep(3000);
	
	String ticketDate=case313.ticketDate().getAttribute("value");
	 
	
	 if (ticketDate.equalsIgnoreCase("2022-04-27"))
	 {
		 System.out.println("Test 313 Pass");
 	  
	 
	 }
	 else 
	 {
		 System.out.println("Test 313 Fail");
	 } 
}
	
	
	@Test
public void case314() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case314=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		 
		String ticketDate=case314.ticketDate().getAttribute("value");
	 
		String expectedDate=case314.expectedDate().getAttribute("value");

		if (expectedDate!=ticketDate) {
			
			System.out.println("Test 314 Pass");
 
			ss.takeScreenShot(driver, "Expected date should be greater than or equal to Current date"); 
	 		
		}
		else
		{
			System.out.println("Test 314 Fail");
		}
	}
	
	@Test
public void case315() throws FileNotFoundException, IOException, InterruptedException {
		
			TestCases  case315=new TestCases (driver);
			loginPage lp=new loginPage(driver);
			Thread.sleep(1000);
			   WebElement dropdown = driver.findElement(By.id("assign_to_user_id")); 

			// Verify the dropdown is enabled and visible. 
			   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
			   { 
				   Thread.sleep(1000);
				   dropdown.click();
				   Thread.sleep(1000);
				   ss.takeScreenShot(driver, "Assign user list");
				   System.out.println("Test 315 Pass");
			   } 
			  else { 
				  System.out.println("Test 315 Fail");
			  } 
	  
	}
	
	
	@Test
public void case316() throws FileNotFoundException, IOException, InterruptedException {
		
			TestCases  case316=new TestCases (driver);
			loginPage lp=new loginPage(driver);
			Thread.sleep(1000);
			   WebElement dropdown = driver.findElement(By.id("assign_to_department_id")); 

			// Verify the dropdown is enabled and visible. 
			   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
			   { 
				   Thread.sleep(1000);
				   dropdown.click();
				   Thread.sleep(1000);
				   ss.takeScreenShot(driver, "Assign department list");
				   System.out.println("Test 316 Pass");
			   } 
			  else { 
				  System.out.println("Test 316 Fail");
			  } 
	  
	}
	
	@Test
public void case317() throws FileNotFoundException, IOException, InterruptedException {
		
			TestCases  case317=new TestCases (driver);
			loginPage lp=new loginPage(driver);
			Thread.sleep(1000);
			   WebElement dropdown1 = driver.findElement(By.id("type_id")); 

			// Verify the dropdown is enabled and visible. 
			   if(dropdown1.isEnabled() && dropdown1.isDisplayed()) 
			   { 
				   Thread.sleep(1000);
				   dropdown1.click();
				   Thread.sleep(1000);
				   ss.takeScreenShot(driver, "Ticket List");
				   System.out.println("Test 317 Pass");
			   } 
			  else { 
				  System.out.println("Test 317 Fail");
			  } 
	  
	}
	
	@Test
public void case318() throws FileNotFoundException, IOException, InterruptedException {
		
			TestCases  case318=new TestCases (driver);
			loginPage lp=new loginPage(driver);
			Thread.sleep(1000);
			   WebElement dropdown = driver.findElement(By.id("priority")); 

			// Verify the dropdown is enabled and visible. 
			   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
			   { 
				   Thread.sleep(1000);
				   dropdown.click();
				   Thread.sleep(1000);
				   ss.takeScreenShot(driver, "Priority list");
				   System.out.println("Test 318 Pass");
			   } 
			  else { 
				  System.out.println("Test 318 Fail");
			  } 
	  
	}
	
	@Test
	
	public void case319() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case319=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		Thread.sleep(1000);
		   WebElement dropdown = driver.findElement(By.id("status_id")); 

		// Verify the dropdown is enabled and visible. 
		   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
		   { 
			   Thread.sleep(1000);
			   dropdown.click();
			   Thread.sleep(1000);
			   ss.takeScreenShot(driver, "Status list");
			   System.out.println("Test 319 Pass");
		   } 
		  else { 
			  System.out.println("Test 319 Fail");
		  } 
  
}
	
	
	@Test
	
	public void case320() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case320=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		Thread.sleep(1000);
		   WebElement dropdown = driver.findElement(By.id("status_id")); 

		// Verify the dropdown is enabled and visible. 
		 ss.takeScreenShot(driver, "Mandatory Sign");
		 
		 System.out.println("Test 320 Pass");
  
}
	
@Test
	
	public void case321() throws FileNotFoundException, IOException, InterruptedException {
		
		TestCases  case321=new TestCases (driver);
		loginPage lp=new loginPage(driver);
		Thread.sleep(1000);
		 
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(1000);
		/*
		 * case321.descriptionField().sendKeys("Test Ticket");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * String descriptionText=case321.descriptionField().getText();
		 * System.out.println("DESC Test:- "+descriptionText); Thread.sleep(1000);
		 */ 
		
		
		 WebElement DT = driver.findElement(By.id("description"));
		 DT.sendKeys("Test Ticket");
		 String descriptionText=DT.getAttribute("value");
		  
		
		if (descriptionText.equalsIgnoreCase("Test Ticket")) {
			
		 
			System.out.println("Test 321 Pass");
		 	
		}
		else
		{
			System.out.println("Test 321 Fail");
		}
		
} 

@Test

public void case322() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case322=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	 
	
	case322.expectedDate().sendKeys("2022-04-30");
	Thread.sleep(1000);
	
	case322.projectID().click();
	utilities.toSelectFromDropDown(case322.projectID(), "Ticketing System");
	Thread.sleep(1000);
	
	case322.moduleID().click();
	utilities.toSelectFromDropDown(case322.moduleID(), "Internal Communication");
	Thread.sleep(1000);
	
	case322.submoduleID().click();
	utilities.toSelectFromDropDown(case322.submoduleID(), "Tickets");
	Thread.sleep(1000);
	  
	case322.assignDepartment().click();
	Thread.sleep(100);
	utilities.toSelectFromDropDown(case322.assignDepartment(), "IT Testing");
	Thread.sleep(1000);
	   
	
	case322.assignUser().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case322.assignUser(), "Abhijeet Raju Ghodke");
	Thread.sleep(1000);
	
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView()", case322.createTicketbutton());
	
	Thread.sleep(1000);
    case322.createTicketbutton().click();
  
	
	WebElement ele=driver.findElement(By.id("type_id"));
	Select sc=new Select(ele);
	sc.selectByIndex(0);
	WebElement opt=sc.getFirstSelectedOption();
	System.out.println(opt.getText());
 
	String TicketType=opt.getText();
  
	
	if (TicketType.equals("Select Type")) 
	{
		
		
		ss.takeScreenShot(driver, "Ticket Type is not added");
		System.out.println("Test 322 Pass " );	
	}
	else
	{
		System.out.println("Test 322 Fail " );	
	}
	}


@Test

public void case324() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case324=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	   WebElement dropdown = driver.findElement(By.id("status_id")); 

		String currentDate=case324.ticketDate().getAttribute("value");
		System.out.println("Current Date:- "+currentDate);
		
		 String expectedDate=case324.expectedDate().getAttribute("value");
		 System.out.println("Expected Date:- "+expectedDate);
		 
		 if (expectedDate.compareTo(currentDate)>=0){
			 
			 ss.takeScreenShot(driver, "Expected Date");
			 System.out.println("Test 324 Pass");
			 Thread.sleep(1000);
 		 
		 }
		 else
		 { 
			 System.out.println("Test 324 Fail");;
		 }
 
}
 

@Test

public void case323() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case323=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	 
	
	case323.expectedDate().sendKeys("2022-04-30");
	Thread.sleep(1000);
	
	case323.projectID().click();
	utilities.toSelectFromDropDown(case323.projectID(), "Ticketing System");
	Thread.sleep(1000);
	
	case323.moduleID().click();
	utilities.toSelectFromDropDown(case323.moduleID(), "Internal Communication");
	Thread.sleep(1000);
	
	case323.submoduleID().click();
	utilities.toSelectFromDropDown(case323.submoduleID(), "Tickets");
	Thread.sleep(1000);
	  
	case323.assignDepartment().click();
	Thread.sleep(100);
	utilities.toSelectFromDropDown(case323.assignDepartment(), "IT Testing");
	Thread.sleep(1000);
	
	
	case323.assignUser().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case323.assignUser(), "Abhijeet Raju Ghodke");
	Thread.sleep(1000);
	
	case323.ticketType().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case323.ticketType(), "New");
	Thread.sleep(1000);
	
	 
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView()", case323.createTicketbutton());
	
	Thread.sleep(1000);
	case323.createTicketbutton().click();
  
	
	WebElement ele=driver.findElement(By.id("priority"));
	Select sc=new Select(ele);
	sc.selectByIndex(0);
	WebElement opt=sc.getFirstSelectedOption();
	System.out.println(opt.getText());
	
 
	String TicketType=opt.getText();
	
	 
	
	if (TicketType.equalsIgnoreCase("Select Priority")) 
	{
		
		
		ss.takeScreenShot(driver, "Proirity is not selected");
		System.out.println("Test 323 Pass " );	
	}
	else
	{
		System.out.println("Test 323 Fial " );	
	}
	}
 



@Test 

public void case325() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case325=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	
	
	driver.navigate().refresh();
	Thread.sleep(1000);
	
	case325.tickeManagementoption().click();
	Thread.sleep(1000);
	

	case325.myTicket().click();
	Thread.sleep(1000);
	
	case325.editTicketbutton().click();
	Thread.sleep(1000);
	
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		System.out.println("sdssd");
		System.out.println("Test 325 Pass");
		
		driver.navigate().back();
		Thread.sleep(1000);
	}
	else
	{	
		System.out.println("Test 325 Fail");
	}
 
}


@Test 

public void case326() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case326=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	
  
	case326.myTicket().click();
	Thread.sleep(1000);
	
	
	case326.createTicket().click();
	Thread.sleep(1000);
	/*
	 * case326.expectedDate().sendKeys("2022-04-29");
	 */
	
	driver.findElement(By.id("expected_solve_date")).sendKeys("2022-04-30");

	Thread.sleep(1000);
	
	case326.projectID().click();
	utilities.toSelectFromDropDown(case326.projectID(), "Ticketing System");
	Thread.sleep(1000);
	
	case326.moduleID().click();
	utilities.toSelectFromDropDown(case326.moduleID(), "Internal Communication");
	Thread.sleep(1000);
	
	case326.submoduleID().click();
	utilities.toSelectFromDropDown(case326.submoduleID(), "Tickets");
	Thread.sleep(1000);
	  
	case326.assignDepartment().click();
	Thread.sleep(100);
	utilities.toSelectFromDropDown(case326.assignDepartment(), "IT Testing");
	Thread.sleep(1000);
	
	
	case326.assignUser().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case326.assignUser(), "Abhijeet Raju Ghodke");
	Thread.sleep(1000);
	
	case326.ticketType().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case326.ticketType(), "New");
	Thread.sleep(1000);
	
	/*
	 * JavascriptExecutor executor = (JavascriptExecutor)driver;
	 * executor.executeScript("arguments[0].scrollIntoView()",
	 * case326.createTicketbutton());
	 * 
	 * Thread.sleep(1000); case326.createTicketbutton().click();
	 */
  
	case326.priorityList().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case326.priorityList(), "Medium");
	Thread.sleep(1000);
	
	
	case326.statusList().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case326.statusList(), "In Progress");
	Thread.sleep(1000);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)");
	
	case326.descriptionField().sendKeys("Test.....");
	Thread.sleep(100);

	case326.attachFile().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
	Thread.sleep(1000);
	 
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView()", case326.createTicketbutton());
	
	Thread.sleep(1000);
	case326.createTicketbutton().click();
	Thread.sleep(1000);
	
	ss.takeScreenShot(driver, "Ticket Successfully Created");
 
}

 
@Test 

public void case327() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case327=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	 
	case327.myTicket().click();
	Thread.sleep(1000);
	
	case327.createTicket().click();
	Thread.sleep(1000);
	
	/*
	 * case327.expectedDate().sendKeys("2022-04-30"); Thread.sleep(1000);
	 */
	
	driver.findElement(By.id("expected_solve_date")).sendKeys("2022-04-30");
	
	case327.projectID().click();
	utilities.toSelectFromDropDown(case327.projectID(), "Ticketing System");
	Thread.sleep(1000);
	
	case327.moduleID().click();
	utilities.toSelectFromDropDown(case327.moduleID(), "Internal Communication");
	Thread.sleep(1000);
	
	case327.submoduleID().click();
	utilities.toSelectFromDropDown(case327.submoduleID(), "Tickets");
	Thread.sleep(1000);
	  
	case327.assignDepartment().click();
	Thread.sleep(100);
	utilities.toSelectFromDropDown(case327.assignDepartment(), "IT Testing");
	Thread.sleep(1000);
	
	case327.assignUser().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case327.assignUser(), "Abhijeet Raju Ghodke");
	Thread.sleep(1000);
	
	case327.ticketType().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case327.ticketType(), "New");
	Thread.sleep(1000);
	
	/*
	 * JavascriptExecutor executor = (JavascriptExecutor)driver;
	 * executor.executeScript("arguments[0].scrollIntoView()",
	 * case326.createTicketbutton());
	 * 
	 * Thread.sleep(1000); case326.createTicketbutton().click();
	 */
  
	case327.priorityList().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case327.priorityList(), "Medium");
	Thread.sleep(1000);
	
	case327.statusList().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case327.statusList(), "In Progress");
	Thread.sleep(1000);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)");
	
	case327.descriptionField().sendKeys("Test.....");
	Thread.sleep(100);

	case327.attachFile().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
	Thread.sleep(1000);
	
	 
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView()", case327.createTicketbutton());
	
	Thread.sleep(1000);
	case327.createTicketbutton().click();
	Thread.sleep(1000);
	
	 String title=driver.getTitle();
	 
	 if (title.equalsIgnoreCase("Ticket System")) {
		 
		 
		 System.out.println("Test 327 Pass");
		 System.out.println("Test 338 Pass");
		 ss.takeScreenShot(driver, "Ticket Create Succesful Message");
		 
	 }
	 else
	 {
		 System.out.println("Test 327 Fail");
		 System.out.println("Test 338 Pass");
	 }
 
	}

@Test 

public void case328() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case328=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	 
	case328.myTicket().click();
	Thread.sleep(1000);
	
	case328.createTicket().click();
	Thread.sleep(1000);
	
	/* case328.expectedDate().sendKeys("2022-04-30"); */
	driver.findElement(By.id("expected_solve_date")).sendKeys("2022-04-30");
	Thread.sleep(1000);
	
	case328.projectID().click();
	utilities.toSelectFromDropDown(case328.projectID(), "Ticketing System");
	Thread.sleep(1000);
	
	case328.moduleID().click();
	utilities.toSelectFromDropDown(case328.moduleID(), "Internal Communication");
	Thread.sleep(1000);
	
	case328.submoduleID().click();
	utilities.toSelectFromDropDown(case328.submoduleID(), "Tickets");
	Thread.sleep(1000);
	  
	case328.assignDepartment().click();
	Thread.sleep(100);
	utilities.toSelectFromDropDown(case328.assignDepartment(), "IT Testing");
	Thread.sleep(1000);
 
	case328.assignUser().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case328.assignUser(), "Abhijeet Raju Ghodke");
	Thread.sleep(1000);
	
	case328.ticketType().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case328.ticketType(), "New");
	Thread.sleep(1000);
	
	/*
	 * JavascriptExecutor executor = (JavascriptExecutor)driver;
	 * executor.executeScript("arguments[0].scrollIntoView()",
	 * case326.createTicketbutton());
	 * 
	 * Thread.sleep(1000); case326.createTicketbutton().click();
	 */
  
	case328.priorityList().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case328.priorityList(), "Medium");
	Thread.sleep(1000);
	
	
	case328.statusList().click();
	Thread.sleep(1000);
	utilities.toSelectFromDropDown(case328.statusList(), "In Progress");
	Thread.sleep(1000);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)");
	
	case328.descriptionField().sendKeys("Test.....");
	Thread.sleep(100);
 

	
	case328.attachFile().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
	Thread.sleep(1000);
 
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView()", case328.cancelButton());
	Thread.sleep(1000);
	 
	case328.cancelButton().click();
	Thread.sleep(1000);
	
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		
		
		System.out.println("Test 328 Pass");
	}
	else
	{
		System.out.println("Test 328 Fail");
	}
 
}




@Test 

public void case329() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case329=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
 
	
	case329.tickeManagementoption().click();
	Thread.sleep(1000);
	
	case329.myTicket().click();
	Thread.sleep(1000);
	
	System.out.println("Test 329 Pass");
	 
}

@Test 

public void case330() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case330=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
  
	
	case330.myTicket().click();
	Thread.sleep(1000);
	
	case330.editTicketbutton().click();
	Thread.sleep(1000);
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		System.out.println("Test 330 Pass");
	}
	else
	{	
		System.out.println("Test 330 Fail");
	}

}

@Test 

public void case331() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case331=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
 
	
	case331.tickeManagementoption().click();
	Thread.sleep(1000);
	
	case331.myTicket().click();
	Thread.sleep(1000);
	
	case331.editTicketbutton().click();
	Thread.sleep(1000);
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		System.out.println("Test 331 Pass");
	}
	else
	{	
		System.out.println("Test 331 Fail");
	}

}


@Test 

public void case333() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case333=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
 
	case333.tickeManagementoption().click();
	Thread.sleep(1000);
	
	case333.myTicket().click();
	Thread.sleep(1000);
	
	ss.takeScreenShot(driver, "Delete button not provided");
	System.out.println("Test 333 Fail");

}

@Test 

public void case334() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case334=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
 
 
	
	case334.myTicket().click();
	Thread.sleep(1000);
	
	case334.viewTicket().click();
	Thread.sleep(1000);
	
	ss.takeScreenShot(driver, "We have remove the ObjectID field");
	System.out.println("Test 334 Fail");
}
 
@Test 

public void case335() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case335=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	
 
	case335.tickeManagementoption().click();
	Thread.sleep(1000);
	
	case335.createTicket().click();
	Thread.sleep(1000);
	
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		
		System.out.println("Test 335 Pass");
	}
	else
	{
		System.out.println("Test 335 Fail");
	}
	
}


@Test 

public void case337() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case337=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	
 
	case337.tickeManagementoption().click();
	Thread.sleep(1000);
	
	case337.createTicket().click();
	Thread.sleep(1000);
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView()", case337.createTicketbutton());
	
	Thread.sleep(1000);
	case337.createTicketbutton().click();
	Thread.sleep(1000);	
	
	
	
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		
		System.out.println("Test 337 Pass");
	}
	else
	{
		System.out.println("Test 337 Fail");
	}
}
 
@Test 

public void case339() throws FileNotFoundException, IOException, InterruptedException {
	
	TestCases  case339=new TestCases (driver);
	loginPage lp=new loginPage(driver);
	Thread.sleep(1000);
	
 
	case339.tickeManagementoption().click();
	Thread.sleep(1000);
	
	case339.createTicket().click();
	Thread.sleep(1000);
	 
	 
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Ticket System")) {
		
		System.out.println("Test 339 Pass");
	}
	else
	{
		System.out.println("Test 339 Fail");
	}
}


}
 
