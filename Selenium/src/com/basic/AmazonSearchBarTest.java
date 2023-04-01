package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearchBarTest {

	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}
	WebDriver driver=new EdgeDriver();
	public void SearchBarTest() {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
	//	driver.findElement(By.className("nav-a")).click();

	}

		public void ClickOnSignIn()
		{
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.className("nav-line-2")).click();
		}
	
	public static void main(String[] args) {
		
		AmazonSearchBarTest obj=new AmazonSearchBarTest();
	//	obj.SearchBarTest();
		
		obj.ClickOnSignIn();
	}

}
