package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceSignUp {

	
		static{
			System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		}
		WebDriver driver=new EdgeDriver();
		
	public void launchAUT() throws InterruptedException
	{
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		driver.manage().window().maximize();
	
		driver.findElement(By.name("UserFirstName")).sendKeys("Dipak");
		Thread.sleep(1000);
		driver.findElement(By.name("UserLastName")).sendKeys("Kadam");
		Thread.sleep(2000);
		
		driver.findElement(By.name("UserEmail")).sendKeys("dipak@gmail.com");	

	}
	
	public void selectDropDown()
	{
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SalesforceSignUp obj=new SalesforceSignUp();
		obj.launchAUT();
		
		
	}

}
