package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddLeaveDataTest {
	WebDriver wd;

	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     wd=new ChromeDriver();
	  }
  @Test
  public void AddLeaveDataTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/adminHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ae6")).click();
	  driver.findElement(By.id("l1")).sendKeys("406");
	  driver.findElement(By.id("l2")).sendKeys("6");
	  driver.findElement(By.id("l3")).sendKeys("10-06-2001");
	  driver.findElement(By.id("l4")).sendKeys("10-06-2001");
	  driver.findElement(By.id("l5")).sendKeys("Health Issue");
	  driver.findElement(By.id("l6")).click();
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
