package com.suresh;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueByDropDown {

	static {
	System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
	}
	WebDriver driver = new EdgeDriver();
	
	public void selectValueInDropDown()
	{
	
	driver.manage().window().maximize();	
	
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	WebElement dayelement = driver.findElement(By.id("first"));		
	Select daylistbox = new Select(dayelement);		
	daylistbox.selectByIndex(4);
		
	}
	public static void main(String[] args) {
	
		SelectValueByDropDown obj=new SelectValueByDropDown();
		obj.selectValueInDropDown();
	}
}
