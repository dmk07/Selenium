package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartSearchBoxTest {
	
	static {

		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}
	WebDriver driver=new EdgeDriver();
	
	public void SearchBox() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.className("fk-modal-visible")).sendKeys("7057807659");
		
		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		driver.findElement(By.className("col-12-12 _1MRYA1")).click();
		
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		FlipkartSearchBoxTest obj=new FlipkartSearchBoxTest();
		obj.SearchBox();
	}

}
