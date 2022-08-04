package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import LIbraryFiles.Utility_Class;

public class MultipleFlight {
	WebDriver driver;

	public MultipleFlight(WebDriver driver) {
		this.driver = driver;
	}

	private By multicity = By.xpath("//li[text()='Multi-City']");
	private By deptcity1click = By.id("FromSector-mul1_show");
	private By destcity1click = By.id("ToSector-mul1_show");
	private By deptdate1 = By.xpath("//input[@id='ddateMul1']");
	private By passengerClick = By.xpath("//span[@id='spnmulTRV']");
	private By adultSelect = By.xpath("(//input[@class='plus_box1'])[2]");
	private By childSelect = By.xpath("(//input[@class='plus_boxChd'])[2]");
	// private By classTraveller =
	// By.xpath("(//span[contains(@class,'chk_flt')])[6]");
	private By doneButton = By.xpath("(//a[@class='dn_btn'])[2]");
	// private By deptcity2 = By.id("FromSector-mul2_show");
	private By destcity2click = By.xpath("//input[@id='ToSector-mul2_show']");
	private By deptdate2 = By.xpath("//input[@id='ddateMul2']");
	private By search = By.xpath("(//input[@class='src_btn'])[2]");
	private By logoClick = By.xpath("//a[@class='emt_logo']");

	public void clickPath() // to select multi-city option on home page
	{
		driver.findElement(multicity).click();
	}

	public void source(String city1) // to select Departure-city
	{
		driver.findElement(deptcity1click).click();
		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'" + city1 + "')])[1]"));
		e.click();
		System.out.println("Departure City1: " + city1);
	}

	public void destination1(String city2) 
	{
		driver.findElement(destcity1click).click();
		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'" + city2 + "')])[2]"));
		e.click();
		System.out.println("Destination City1: " + city2);
	}

	public void destination2(String city4) throws InterruptedException 
	{
		// Thread.sleep(1000);
		driver.findElement(destcity2click).click();
		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'" + city4 + "')])[3]"));
		e.click();
		System.out.println("Destination City2: " + city4);
	}

	public void departuredate1(String sourceMonth, String sourceDate) throws InterruptedException 
	{
		driver.findElement(deptdate1).click();
		driver.findElement(By.xpath(
				"//span[contains(text(),'" + sourceMonth + "')]//following::a[contains(text(),'" + sourceDate + "')]"))
				.click(); // select from date
		// Thread.sleep(1000);
		System.out.println(sourceMonth + "  " + sourceDate);
	}

	public void departuredate2(String departureMonth2, String departureDate2) 
	{
		driver.findElement(deptdate2).click();
		driver.findElement(By.xpath("//span[contains(text(),'" + departureMonth2 + "')]//following::a[contains(text(),'"
				+ departureDate2 + "')]")).click(); // select from date
		System.out.println(departureMonth2 + "  " + departureDate2);

	}

	public void travellerEconomy(int i) throws FileNotFoundException, IOException, InterruptedException 
	{
		driver.findElement(passengerClick).click();
		String adult = Utility_Class.getpfdata(i, 7, "Flight");
		int x = Integer.parseInt(adult);
		for ( i = 0; i < x; i++) 
		{
			driver.findElement(adultSelect).click(); // adult count ++
			// driver.findElement(By.xpath("((//input[@class='plus_box1'])[2]")).click();
			// //adult
		}
		System.out.println("Adluts = " + x); // for printing on console

		String child = Utility_Class.getpfdata(i, 8, "Flight");
		int y = Integer.parseInt(child);
		for (int j = 0; j < y; j++) 
		{
			driver.findElement(childSelect).click(); // children count++
		}
		System.out.println("Children = " + y); // for printing on console
		Thread.sleep(1000);

		String classTraveller = Utility_Class.getpfdata(i, 9, "Flight");
		driver.findElement(By.xpath("(//label[contains(text(),'" + classTraveller + "')])[2]")).click();
		Thread.sleep(1000);
		System.out.println("Traveller Class = " + classTraveller); // for printing on console

		driver.findElement(doneButton).click(); // click on done
		Thread.sleep(1000);

	}

	public void searchFlight() throws InterruptedException // to click on Search Flight Button
	{
		driver.findElement(search).click();
		Thread.sleep(1000);
        System.out.println("Successfully Click on Search");

	}

	public void clickOnLogo() throws Exception // to select logo on home page
	{
		Thread.sleep(10000);
		driver.findElement(logoClick).click();
	}

}