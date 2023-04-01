package com.basic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SendInputToAmazonSearchBox {
	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}
	WebDriver driver=new EdgeDriver();
	public void SearchBarTest(String url) {

		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//	//	driver.findElement(By.className("nav-a")).click();

	}

		public void ClickOnSignIn()
		{
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.className("nav-line-2")).click();
		}
	
	public static void main(String[] args) {
	
		SendInputToAmazonSearchBox obj=new SendInputToAmazonSearchBox();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Application URL");
		String url=scn.nextLine();
		
		obj.SearchBarTest(url);
	}

}
