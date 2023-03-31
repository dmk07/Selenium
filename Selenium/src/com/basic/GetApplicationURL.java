package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetApplicationURL {
	{
		System.getProperty("webdriver.edge.driver","C://msedgedriver.exe");
	}
	
	WebDriver driver=new EdgeDriver();
	
	public void getApplicationURL()
	{
		driver.navigate().to("https://github.com/");
		String str=driver.getCurrentUrl();
		System.out.print(str);
	}
	
	
	
	public static void main(String[] args) {

		 GetApplicationURL geturl=new  GetApplicationURL();
		 geturl.getApplicationURL();

	}

}
