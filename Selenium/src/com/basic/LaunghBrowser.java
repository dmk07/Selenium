package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunghBrowser {

	// launch browser
	
	public void AutoAUT() // Application under Test
	{
		System.setProperty("webdriver.edge.driver","C://msedgedriver.exe");
		
		WebDriver web=new EdgeDriver();
		
		EdgeDriver b=new EdgeDriver(); // we can launch browser by this too
		
	}
	
	
	
	public static void main(String[] args) {
	
		LaunghBrowser obj=new LaunghBrowser();
		obj.AutoAUT();  // calling method to launch browser.
		
		

	}

}
