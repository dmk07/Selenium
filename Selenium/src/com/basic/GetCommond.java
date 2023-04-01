package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCommond {

	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
	}
	WebDriver driver = new EdgeDriver();

	
	public void getCommond()
	{
		driver.get("https://www.amazon.in/");
		// this method  loads a new web page in the existing browser window.
		
	}
	
	
	public static void main(String[] args) {

		GetCommond obj=new GetCommond();
		obj.getCommond();		
	}

}
