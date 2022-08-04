package pages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class PaymentPage 
{
WebDriver driver;
public PaymentPage(WebDriver driver)
{
	this.driver=driver;
}

//private By netBanking = By.xpath("//span[@class='netbankingText payment-txt payGT1 blu']");
//private By netBanking = By.xpath("//span[@class='walletText payment-txt payGT1 blu']");
private By netBanking = By.linkText("Wallets");
//private By selectBank = By.xpath("(//span[@class='ftn14 ng-binding'])[3]");
private By selectBank =By.xpath("//span[contains(text(),'PhonePe')]");
private By makePayment = By.xpath("//div[@class='mk-pym4']");
 


public void testnetBanking() throws IOException, Exception {
    Thread.sleep(6000);
    Actions act=new Actions(driver);
    act.sendKeys(Keys.ARROW_UP).build().perform();
    driver.findElement(netBanking).click();
    Thread.sleep(3000);
}
public void testselectBank() throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(selectBank).click();
}
public void testmakePayment() throws IOException, Exception {
    Thread.sleep(2000);
    driver.findElement(makePayment).click();
}

}
