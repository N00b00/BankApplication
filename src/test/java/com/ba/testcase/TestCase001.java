package com.ba.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase001 extends BaseTest{
	
	@Test
	public void tc001 () {
		//driver = setup();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Googel");
	}

}
