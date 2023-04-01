package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTestCase {
	
	
	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}
	WebDriver driver=new EdgeDriver();

	public void TestLogin()
	{
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement username=driver.findElement(By.id("user_email_login"));
		
		WebElement password=driver.findElement(By.id("user_password"));
		
		username.sendKeys("dipak100kadam@gmail.com");
		password.sendKeys("12756"); 
		//
	
		driver.findElement(By.id("user_submit")).click();
		
	}
	
	public static void main(String[] args) {

		LoginTestCase tl=new LoginTestCase();
		
		tl.TestLogin();
		
		
		
	}

}
