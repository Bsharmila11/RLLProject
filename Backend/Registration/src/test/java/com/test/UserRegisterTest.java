package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class UserRegisterTest {
	WebDriver wd;
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     wd=new ChromeDriver();
	  }
  @Test
  public void UserRegistrationTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("re1")).click();
	  driver.findElement(By.id("email1")).sendKeys("srija@gmail.com");
	  driver.findElement(By.id("password1")).sendKeys("raghu");
	  driver.findElement(By.id("t1")).click();
	  driver.findElement(By.id("re2")).click();
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
