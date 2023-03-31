package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAppSourceCode {

	{
		System.setProperty("webdriver.edge.driver","C://msedgedriver.exe");
	}
	
	WebDriver driver=new EdgeDriver();
	
	public void getSourceCode()
	{
		driver.navigate().to("https://github.com/");
		String str=driver.getPageSource();
		
		System.out.print(str);
	}
	
	public static void main(String[] args) {
	
		GetAppSourceCode source=new GetAppSourceCode();
		source.getSourceCode();
		
	}

}
