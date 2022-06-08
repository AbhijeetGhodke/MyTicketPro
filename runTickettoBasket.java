package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import generic.baseClass;
import pages.addTicket;
import pages.loginPage;
import pages.ticketTobasket;

public class runTickettoBasket extends baseClass {
	
	@Test
	
	public void  BasketTicket() throws FileNotFoundException, IOException, InterruptedException {
		
		
		ticketTobasket tb=new ticketTobasket(driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url2"));
		
		tb.email().sendKeys(p.toReadDataFromPropertyFile("userName1"));
		Thread.sleep(1000);
		tb.password().sendKeys(p.toReadDataFromPropertyFile("password1"));
		Thread.sleep(1000);
		tb.login().click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		tb.tickeManagementoption().click();
		Thread.sleep(1000);
		tb.myTicketoption().click();

		Thread.sleep(1000);
		
		tb.addBasketoption().click();
		Thread.sleep(1000);		
		
		String basketTitle=driver.getTitle();
		
		System.out.println(basketTitle);
		
		if (basketTitle.equalsIgnoreCase("Ticket System")) {
			
			
			tb.basketName().sendKeys("Testing");
			Thread.sleep(1000);
			
			
			tb.basketOwner().click();
			Thread.sleep(1000);
			utilities.toSelectFromDropDown(tb.basketOwner(),"Abhijeet Raju Ghodke" );
			
			Thread.sleep(1000);
			
			tb.startDate().sendKeys("10/04/2022");
			Thread.sleep(1000);
			
			tb.endDate().sendKeys("18/04/2022");
			Thread.sleep(1000);
			
			tb.submitButton().click();
			
			Thread.sleep(1000);
			
			driver.navigate().to("http://15.207.120.175/TechTicket/");
			Thread.sleep(3000);
			
			tb.emailA().sendKeys("abhijeet.ghodke@techneai.com");
			Thread.sleep(1000);
			tb.passwordA().sendKeys("abcd123");
			Thread.sleep(1000);
			tb.loginA().click();
			Thread.sleep(1000);
			tb.pendingTask().click();
			ss.getAshot(driver, "Pending Task");
	 
		}
		else
		{
			System.out.println("Test Case Fail");
			
		}
		
	}

}
