package com.register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSalesforce {

	WebDriver driver=new EdgeDriver();
	JavascriptExecutor jse;
	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}

	public void launchAUT() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	public void sendData() throws InterruptedException {
		jse = (JavascriptExecutor) driver;
		WebElement user = driver.findElement(By.id("username"));
		Thread.sleep(2000);

		jse.executeScript("arguments[0].value='dipak100kadam@gmail.com'", user);
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].value='dipak'", pass);

		Thread.sleep(2000);
	}

	public void clickLoginButton() {

		jse = (JavascriptExecutor) driver;
		WebElement login = driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", login);
	}

	public static void main(String[] args) throws InterruptedException {

		LoginSalesforce ob=new LoginSalesforce();
		ob.launchAUT();
		ob.sendData();
		ob.clickLoginButton();
		
		
	}

}
