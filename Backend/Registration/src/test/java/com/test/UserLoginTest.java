package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserLoginTest {
	WebDriver wd;
	 @BeforeMethod
	 public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     wd=new ChromeDriver();
	    
	     
	 }
  @Test
  public void UserLoginTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys("sharmila@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("sharmila");
	  driver.findElement(By.id("r2")).click();
	  driver.findElement(By.id("submit")).click();
  }
}
