package com.navigators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cancel {
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
	
	public void cancel() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}
	
	public void sendData() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("dipak100kadam@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
	public static void main(String[] args) throws InterruptedException {
		Cancel cancel=new Cancel();
		cancel.launchAUT();
		cancel.cancel();
		cancel.sendData();

	}

}
