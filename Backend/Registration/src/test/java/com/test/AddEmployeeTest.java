package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddEmployeeTest {
	WebDriver wd;
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     wd=new ChromeDriver();
	  }
  @Test
  public void AddEmployeeTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/adminHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ae1")).click();
	  driver.findElement(By.id("e1")).sendKeys("6");
	  driver.findElement(By.id("e2")).sendKeys("Srija");
	  driver.findElement(By.id("e3")).sendKeys("Pathuri");
	  driver.findElement(By.id("e4")).sendKeys("Tester");
	  driver.findElement(By.id("e5")).sendKeys("srija@gmail.com");
	  driver.findElement(By.id("e6")).sendKeys("01-08-2001");
	  driver.findElement(By.id("e7")).sendKeys("Female");
	  driver.findElement(By.id("e8")).click();
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
