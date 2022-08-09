package day3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstNG {
	WebDriver driver;

	@Test(description = "Testing title of Welcome Page") // Actual Testing
	public void welcomePageTest() {
		driver.get("https://testng.org/doc/index.html");
		String title = driver.getTitle();
		// Assertion is a point where comparision between expected & Actual is done.
		// Actual testing happens here. A script without assertion is just browser
		// interaction only
		Assert.assertEquals(title, "TestNG- Welcome");
	}

	@Test(dependsOnMethods = "welcomePageTest", description = "Testing title of Welcome Page") // Actual Testing
	public void antTest() throws Exception {
		driver.findElement(By.linkText("Ant")).click();
		Assert.assertEquals(driver.getTitle(), "TestNG - Ant");
		// Type casting: converting driver into TakesScreenshot type

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		System.out.println("Hi");
		if (result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE); // taking location in file type of Object
			FileHandler.copy(src, new File("src/test/resources/" + result.getName() + ".png"));
		}
	}

	@BeforeTest // Pre-condition like Starting browser in case of any kind Testing
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest // Post-condition like closing browser
	public void afterTest() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
/*
TestNG:

>It is used for generating reports in WebDriver since WebDriver do not have capacity of generating reports.

		Some other API can be used for report generation i.e ExtentReport, Allure

>It also used for Test Script Management i.e Running Selective testcase(running only sanity test cases, running something before actual script execution etc.)


Why to use Testng(Why not Junit ?)
1.Parallel Testing is possible in  TestNG
2.Test suite making is Easy & Classes from different Package can be included. 
	Where as in Junit it is not possible to include class from different package
3.Annotations in TestNG Easy to understand
4.HTML report is generated in TestNG. In Junit HTML report is not generated
*/