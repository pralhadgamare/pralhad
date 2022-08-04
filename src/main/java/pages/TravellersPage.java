package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TravellersPage 
{
WebDriver driver;
public TravellersPage(WebDriver driver)
{
	this.driver=driver;
}
private By Title = By.xpath("//select[@id='titleAdult0']");
private By FirstName = By.xpath("//input[@id='txtFNAdult0']");
private By LastName = By.xpath("//input[@id='txtLNAdult0']");
private By seatmap = By.xpath("//span[contains(text(), 'Seat Map - Choose your seats')]");
private By selectseat = By.xpath("(//label[@class='s_seat_avl ng-scope'])[1]");

private By contactDetails = By.xpath("//input[@id='txtCPhone']");
//private By checkbox = By.xpath("(//span[@class='tctxt ng-binding'])");
private By ContinuesBtn = By.xpath("//span[@id='spnTransaction']");

public void testTitle() throws IOException, Exception 
{
    Thread.sleep(2000);
    driver.findElement(Title).click();
    Select s = new Select(driver.findElement(Title));
    s.selectByVisibleText("Mrs");

}

public void testFirstName(String Firstname) throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(FirstName).sendKeys(Firstname);

}

public void testLastName(String Lastname) throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(LastName).sendKeys(Lastname);
}
public void testSeatMap() throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(seatmap).click();
}
public void testSelectSeat() throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(selectseat).click();
}

public void testContactDetails(String MobileNo) throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(contactDetails).sendKeys(MobileNo);

}
/*public void testCheckBox() throws InterruptedException
{
	 Thread.sleep(2000);
	  driver.findElement(checkbox).click();
	  
}*/
public void testContinuesBtn() throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(ContinuesBtn).click();
}
}
