package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookSingleFlight 
{
	WebDriver driver;
	public BookSingleFlight(WebDriver driver)
	{
		this.driver=driver;
	}
	private By bookNow = By.xpath("(//button[contains(text(),'Book Now')])[1]");
	 public void testBookNow() throws InterruptedException   // to select multi-city option on home page
	    {
		 Thread.sleep(3000);   
		 driver.findElement(bookNow).click();
	        System.out.println("Succfesfully Clicked on Book Now");
	    }
}
