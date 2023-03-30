package com.basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenMyWebsite {
	
	
	static {
		
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
	}

	public void openMyProfile()
	{
		
		
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://account.microsoft.com/profile");
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		OpenMyWebsite open=new OpenMyWebsite();
		
		open.openMyProfile();
		

	}

}
