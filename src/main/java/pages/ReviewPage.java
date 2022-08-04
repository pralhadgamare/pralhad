package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LIbraryFiles.Utility_Class;

public class ReviewPage 
{
	WebDriver driver;
	public ReviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 private By emailaddress = By.xpath("//input[@id='txtEmailId']");
	 private By continueBookingButton = By.xpath("(//span[contains(text(), 'Continue Booking')])[2]");
	 
	 public void testemailaddress(String email) throws InterruptedException // to enter email id
	    {
	      Thread.sleep(3000);	 
		  driver.findElement(emailaddress).sendKeys(email);
	       //WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'"+city1+"')])[1]"));
	       //e.click();
	       System.out.println("Entered mail id: "+email);
	    }
	 
	 
	 
	 
	 public void testContinueBookingButton() throws InterruptedException   // to click on continue Booking Button
	    {
	     Thread.sleep(3000);   
		 driver.findElement(continueBookingButton).click();
	        System.out.println("Succfesfully Clicked on continue Booking Button");
	    }
	 

}
