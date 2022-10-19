package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ViewEmployeeTest {
	WebDriver wd;
	@BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    wd=new ChromeDriver();
	  }
	
  @Test
  public void ViewEmployeeTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/adminHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ae2")).click();
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
