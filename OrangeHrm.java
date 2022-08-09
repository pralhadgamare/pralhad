package com.aqm.staf.library.pages.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.core.TestData;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.NiaLoginPageEntity;
import com.aqm.testing.testDataEntity.OrangeHrmEntity;
//import com.thoughtworks.selenium.webdriven.commands.DoubleClick;
//import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class OrangeHrm extends BasePage {

	private PageElement username;
	private PageElement password;
	private PageElement login1;

	// private PageElement username23;
	// private PageElement password23;
	// private PageElement login11;

	// my info
	private PageElement my_info;
	// Edit
	private PageElement edit;
	private PageElement full_name;
	private PageElement last_name;
	private PageElement save;
	// custom Fields
	private PageElement edit1;
	private PageElement blood_type;
	// attachments
	private PageElement add;
	private PageElement Choose_file;
	private PageElement upload;
	// private PageElement uploadFiles;
	PageElement ele = null;

	public OrangeHrm(WebDriver driver, String pagename) {
		super(driver, pagename);

		username = new PageElement(By.xpath("//input[@id='txtUsername']"), "Enter UserName", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		password = new PageElement(By.xpath("//input[@id='txtPassword']"), "Enter Password", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		login1 = new PageElement(By.xpath("//input[@id='btnLogin']"), "Clicked on login button", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		// username23 = new PageElement(By.xpath("//input[@id='txtUsername']"), "Enter
		// UserName", false,
		// WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// password23 = new PageElement(By.xpath("//input[@id='txtPassword']"), "Enter
		// Password", false,
		// WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// login11 = new PageElement(By.xpath("//input[@id='btnLogin']"), "Clicked on
		// login button", false,
		// WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		my_info = new PageElement(By.xpath("//b[text()='My Info']"), "Clicked on login button", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		edit = new PageElement(By.xpath("//input[@id='btnSave']"), "Clicked on login", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		full_name = new PageElement(By.xpath("//input[@id='personal_txtEmpFirstName']"), "Enter first name ", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		last_name = new PageElement(By.xpath("//input[@id='personal_txtEmpLastName']"), "Enter last name ", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		save = new PageElement(By.xpath("//input[@id='btnSave']"), "Clicked on save", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		edit1 = new PageElement(By.xpath("//input[@id='btnEditCustom']"), "clicked on edit", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		blood_type = new PageElement(By.xpath("//select[@name='custom1']"), "select Blood type", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		add = new PageElement(By.xpath("//input[@id='btnAddAttachment']"), "Clicked on add", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		Choose_file = new PageElement(By.xpath("//input[@type='file']"), "Clicked on add", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		upload = new PageElement(By.xpath("//input[@id='btnSaveAttachment']"), "Clicked on upload", false,
				WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public synchronized void logindetails(OrangeHrmEntity login, CustomAssert assertReference)
			throws InterruptedException, IOException, AWTException {
		if (login.getAction().equalsIgnoreCase("add") || login.getAction().equalsIgnoreCase("edit")) {

			for (int i = 0; i <= 1; i++) {
				if (login.getBooleanValueForField("ConfigUsername1")) {
					clearAndSendKeys(username, login.getStringValueForField("username1"));
				}
				if (login.getBooleanValueForField("ConfigPassword1")) {
					clearAndSendKeys(password, login.getStringValueForField("admin123"));
				}
				if (login.getBooleanValueForField("ConfigLogin")) {
					click(login1);

				}
			}

			// if (login.getBooleanValueForField("ConfigUsername23")) {
			// clearAndSendKeys(username23, login.getStringValueForField("username23"));
			// }
			// if (login.getBooleanValueForField("ConfigPassword23")) {
			// clearAndSendKeys(password23, login.getStringValueForField("password23"));
			// }
			// if (login.getBooleanValueForField("ConfigLogin11")) {
			// click(login11);
			//
			// }

			if (login.getBooleanValueForField("ConfigMy_info")) {
				click(my_info);

			}
			if (login.getBooleanValueForField("ConfigEdit")) {
				click(edit);

			}
			if (login.getBooleanValueForField("ConfigFull_name")) {
				clearAndSendKeys(full_name, login.getStringValueForField("full_name"));
			}
			if (login.getBooleanValueForField("ConfigLast_name")) {
				clearAndSendKeys(last_name, login.getStringValueForField("last_name"));
			}
			if (login.getBooleanValueForField("ConfigSave")) {
				click(save);

			}
			if (login.getBooleanValueForField("ConfigEdit1")) {
				click(edit1);

			}
			if (login.getBooleanValueForField("ConfigBlood_type")) {
				selectValueFromList(blood_type, login.getStringValueForField("blood_type"));
			}
			if (login.getBooleanValueForField("ConfigAdd")) {
				click(add);

			}
			if (login.getBooleanValueForField("ConfigChoose_file1")) {
				doubleClick(Choose_file);
			}
			String WiniumEXEpath = "D:\\seleniumGrid4\\Winium.Desktop.Driver.exe";
			File file = new File(WiniumEXEpath);
			if (!file.exists()) {
				throw new IllegalArgumentException("The file " + WiniumEXEpath + " does not exist");
			}
			Runtime.getRuntime().exec(file.getAbsolutePath());

			WiniumDriver driver1 = new WiniumDriver(new URL("http://localhost:9999"), null);
			testNotePade();
		}
		if (login.getBooleanValueForField("ConfigUpload1")) {
			click(upload);
			Thread.sleep(5000);

		}
	}

	public void testNotePade() throws InterruptedException {
		String file = "D:\\seleniumGrid4\\FileUploader.exe";
		WebElement window = driver.findElement(By.name("File Upload"));
		window.findElement(By.name("File Upload")).sendKeys(file);
		window.findElement(By.name("Open")).click();
	}

	public void fillandSubmitLoginDetails(OrangeHrmEntity login, CustomAssert assertReference, TestData testData,
			String stepGroup) throws Exception {
		Thread.sleep(5000);
		logindetails(login, assertReference);

	}
}