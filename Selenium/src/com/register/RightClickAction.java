package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}
	WebDriver driver = new EdgeDriver();
	Actions action;

	public void LaunchBrowser() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
	}
	
	public void rightClick() throws InterruptedException
	{
		WebElement web=driver.findElement(By.xpath("//a[text()='Customer Service']"));
		Thread.sleep(2000);
		action=new Actions(driver);
		action.contextClick(web).perform();	
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		RightClickAction action=new RightClickAction();
		action.LaunchBrowser();
		action.rightClick();
		
		
	}

}
