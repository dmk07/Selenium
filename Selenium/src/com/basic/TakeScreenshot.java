package com.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}
	WebDriver driver = new EdgeDriver();

	public void AutoAUT() throws InterruptedException {
		Thread.sleep(3000);

		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");

	}

	public void sendData() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("dipak");
		Thread.sleep(3000);
		driver.findElement(By.name("pw")).sendKeys("65415");
		driver.findElement(By.id("Login")).click();
	}
	
	
	public void getScreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\dmk61\\OneDrive\\Desktop\\Dipak.png");
		FileHandler.copy(src, des);
		
	}

	
	public static void main(String[] args) throws InterruptedException {

		
		TakeScreenshot obj=new	TakeScreenshot();
		obj.AutoAUT();
		obj.sendData();
	}

}
