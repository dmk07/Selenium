package com.navigators;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackNavigation {

	WebDriver driver = new EdgeDriver();

	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}

	// launch browser
	public void launchAUT() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=mo1-btn-ft");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	public void Myback() throws InterruptedException {
		
		driver.findElement(By.xpath("")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
	}

	public static void main(String[] args) throws InterruptedException {

		BackNavigation back = new BackNavigation();
		back.launchAUT();
		back.Myback();

	}

}
