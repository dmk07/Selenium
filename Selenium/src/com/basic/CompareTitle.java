package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CompareTitle {
	
	static{
			System.setProperty("webdriver.edge.driver","C://msedgedriver.exe");
	}
	
	WebDriver driver=new EdgeDriver();
	
	public void toCompareTitle()
	{
		driver.navigate().to("https://www.amazon.in/");
		
		String str="Amazon";
		if(str.equals(driver.getTitle()))
		System.out.print("same");
		else
		System.out.print("diff");
		
	}
	
	
	public static void main(String[] args) {
		
		CompareTitle obj=new CompareTitle();
		obj.toCompareTitle();
		

	}

}
