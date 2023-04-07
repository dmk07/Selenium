package com.navigators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Reset {

	
	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}
	WebDriver driver = new EdgeDriver();
	
	
	public void launchAUT() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	
	public void reset_ok() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Reset reset=new Reset();
		reset.launchAUT();
		reset.reset_ok();
		

	}

}
