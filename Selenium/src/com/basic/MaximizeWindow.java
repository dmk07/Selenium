package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MaximizeWindow {
	// load only one time
	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
	}
	WebDriver edge = new EdgeDriver();

	// get title 
	
	
	// maximize window
	
		public void MaxWindow()
		{
			edge.manage().window().maximize();
		}
		
	public static void main(String[] args) {

		MaximizeWindow max = new MaximizeWindow();
		
		max.MaxWindow();
		
	}

}
