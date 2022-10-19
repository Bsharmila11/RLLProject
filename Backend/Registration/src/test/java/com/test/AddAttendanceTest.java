package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddAttendanceTest {
	WebDriver wd;
	 @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     wd=new ChromeDriver();
	  }
  @Test
  public void AddAttendanceTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/adminHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ae4")).click();
	  driver.findElement(By.id("a1")).sendKeys("206");
	  driver.findElement(By.id("a2")).sendKeys("6");
	  driver.findElement(By.id("a3")).sendKeys("10-06-2001");
	  driver.findElement(By.id("a4")).sendKeys("Present");
	  driver.findElement(By.id("a5")).click();  
  }
  
 

  @AfterMethod
  public void afterMethod() {
  }

}
