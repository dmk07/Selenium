package com.navigators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlePopUpWindow {

	static {
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
	}
	WebDriver driver = new EdgeDriver();
	Actions action;
	
	public void LaunchAUT() throws InterruptedException {
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	public void handlePopUp() throws InterruptedException
	{
		action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);	
	}
	
	public void sendData() throws InterruptedException
	{
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		action.sendKeys(search,"Selenium with java").build().perform();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement book=driver.findElement(By.xpath("//a[text()='Advanced Selenium in Java']"));
		book.click();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		HandlePopUpWindow obj=new HandlePopUpWindow();
		obj.LaunchAUT();
		obj.handlePopUp();
		obj.sendData();
	}

}
