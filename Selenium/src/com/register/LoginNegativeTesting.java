package com.register;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class LoginNegativeTesting {

	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}
	WebDriver driver = new EdgeDriver();

	public void AutoAUT() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
		
	}

	public void AutoLogin() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("dipak@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("DIPAKDiui");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
	}
	
	public void getScreenshot() throws IOException
	{
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File des=new File("C:\\Users\\dmk61\\OneDrive\\Desktop\\screen.jpg");
		 FileHandler.copy(src, des);		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {

		LoginNegativeTesting obj = new LoginNegativeTesting();
		obj.AutoAUT();
		obj.AutoLogin();
		obj.getScreenshot();

	}

}
