package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PostImageOnLinkedIn {

	
	
	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
// working
	}
	WebDriver driver=new EdgeDriver();
	
	public void testLoginLinkedIn() throws InterruptedException
	{
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.findElement(By.id("username")).sendKeys("7057807659"); // provide mobile number
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("ss"); //password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	
	public void postImage() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.id("ember24")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ember404']")).click();
	}
	
	
	public static void main(String[] args) {
	
	}

}
