package com.ba.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ba.pageobject.BasePage;

public class BaseTest {
	public static WebDriver driver;
	public BasePage page;
	
	@BeforeTest
	public static  void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\REST\\BankApplication\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//page = new BasePage(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	public static void getScreenshot(String tsname,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String des = System.getProperty("user.dir")+"\\report\\"+tsname+".png";
		FileUtils.copyFile(src, new File(des));
		System.out.println("Screen shot taken");
		
	}

}
