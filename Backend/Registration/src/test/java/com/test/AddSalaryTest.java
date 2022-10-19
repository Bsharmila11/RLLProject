package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddSalaryTest {
	WebDriver wd;
	@BeforeMethod
	
	  public void beforeMethod() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     wd=new ChromeDriver();
		  }
  @Test
  public void AddSalaryTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/adminHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ae3")).click();
	  driver.findElement(By.id("s1")).sendKeys("106");
	  driver.findElement(By.id("s2")).sendKeys("6");
	  driver.findElement(By.id("s3")).sendKeys("June");
	  driver.findElement(By.id("s4")).sendKeys("10000");
	  driver.findElement(By.id("s5")).click();
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
