package com.navigators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
// working
	}
	WebDriver driver = new EdgeDriver();
	Actions action = new Actions(driver);

	public void LaunchAUT() throws InterruptedException {
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	public void MakeMouseAction() throws InterruptedException {
		
		WebElement src=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement desc=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		action.moveToElement(src).moveToElement(desc).click().perform();
		Thread.sleep(2000);

	}

	public static void main(String[] args) throws InterruptedException {
		
		MouseAction obj=new MouseAction();
		obj.LaunchAUT();
		obj.MakeMouseAction();
		

	}

}
