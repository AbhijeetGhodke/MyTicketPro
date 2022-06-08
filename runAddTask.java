package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.addTask;
import pages.loginPage;

public class runAddTask extends baseClass {
	@Test
	
	public void AddTask() throws FileNotFoundException, IOException, InterruptedException {
		
		addTask as=new addTask(driver);
		loginPage lp=new loginPage(driver);
		driver.get(p.toReadDataFromPropertyFile("url2"));
		

		as.email().sendKeys(p.toReadDataFromPropertyFile("userName1"));
		Thread.sleep(1000);
		as.password().sendKeys(p.toReadDataFromPropertyFile("password1"));
		Thread.sleep(1000);
		as.login().click();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	 
		
		as.tickeManagementoption().click();
		
		as.myTicketoption().click();
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		as.ticketID().click();
		Thread.sleep(1000);
		as.addTask().click();
		Thread.sleep(1000);

		as.taskName().sendKeys("Test Task");
		Thread.sleep(1000);
		as.startDate().sendKeys("09/04/2022");
		
		as.endDate().sendKeys("15/04/2022");
		
		as.taskHours().sendKeys("4");
		
		as.priority().click();
		Thread.sleep(1000);
		utilities.toSelectFromDropDown(as.priority(),"Low");
		
		as.taskDesc().sendKeys("Test Description");
		Thread.sleep(1000);
		
		/*
		 * as.depenetTask().click(); Thread.sleep(1000);
		 * utilities.toSelectFromDropDown(as.depenetTask(),"Tickets" );
		 * as.depenetTask().sendKeys("None");
		 */
		/*
		 * List<WebElement> optionList = driver.findElements(By.xpath(
		 * "/html/body/div[3]/div/div/div[2]/form/div[6]/div/div[1]/div[1]/div[2]"));
		 * 
		 * JavascriptExecutor je = (JavascriptExecutor) driver;
		 * je.executeScript("arguments[0].scrollIntoView(true);", optionList.get(17) );
		 * Thread.sleep(250);
		 */
			/*
			 * JavascriptExecutor je = (JavascriptExecutor) driver;
			 * je.executeScript("window.scrollBy [0,350]");
			 * 
			 * driver.findElement(By.xpath(
			 * "/html/body/div[3]/div/div/div[2]/form/div[6]/label")).click();
			 */
		
		
		/* /html/body/div[3]/div/div/div[2]/form/div[6]/label
		 * JavascriptExecutor je = (JavascriptExecutor) driver;
		 * je.executeScript("window.scrollBy [0,350]");
		 */

		JavascriptExecutor Js1=(JavascriptExecutor) driver;
		Js1.executeScript("arguments[0].scrollIntoView();", as.assignUserlebel());
		Thread.sleep(1000);
			
		
		as.assignUser().click(); 
		Thread.sleep(1000); 
		utilities.toSelectFromDropDown(as.assignUser(),"Monika Kolpe");
		Thread.sleep(1000);
	   
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView();", as.attachFile());
		
		as.attachFile().sendKeys("C:\\Users\\user\\Desktop\\sample(Draft).pdf");
		
		as.doneButton().click();
		
		
	}

}
