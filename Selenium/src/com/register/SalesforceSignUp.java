package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

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
	
	public void selectDropDown() throws InterruptedException
	{
		
		WebElement we=driver.findElement(By.name("UserTitle"));
		Select select=new Select(we);
		select.selectByVisibleText("Sales Manager");
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);		
	}
	
	public void selectJobTitle() throws InterruptedException
	{
		WebElement we=driver.findElement(By.name("UserTitle"));
		Select select =new Select(we);
		select.selectByVisibleText("Sales Manager");
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.name("CompanyName")).sendKeys("Infotech");
		
	}
	public void selectEmployees() throws InterruptedException
	{
		WebElement we=driver.findElement(By.name("CompanyEmployees"));
		Select select =new Select(we);
		select.selectByVisibleText("1 - 15 employees");
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("7057807655");
	}
	public void selectCountry() throws InterruptedException
	{
		WebElement we=driver.findElement(By.name("CompanyCountry"));
		Select select =new Select(we);
		select.selectByVisibleText("United States");
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		
	}
	public void selectState() throws InterruptedException
	{
		WebElement we=driver.findElement(By.name("CompanyState"));
		Select select =new Select(we);
		select.selectByVisibleText("Alabama");
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		SalesforceSignUp obj=new SalesforceSignUp();
		obj.launchAUT();
		obj.selectDropDown();
		obj.selectJobTitle();
		obj.selectEmployees();
		obj.selectCountry();
		obj.selectState();
		
		
		
	}

}
