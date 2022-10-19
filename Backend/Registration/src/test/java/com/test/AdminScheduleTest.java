package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminScheduleTest {
	WebDriver wd;
	@BeforeMethod
	
	  public void beforeMethod() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     wd=new ChromeDriver();
		  }
  @Test
  public void AdminScheduleTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/adminHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ae5")).click();
	  driver.findElement(By.id("s1")).sendKeys("306");
	  driver.findElement(By.id("s2")).sendKeys("6");
	  driver.findElement(By.id("s3")).sendKeys("10-03-2001");
	  driver.findElement(By.id("s4")).sendKeys("9");
	  driver.findElement(By.id("s5")).sendKeys("User Login page");
	  driver.findElement(By.id("s6")).click();
	  
  }
}
