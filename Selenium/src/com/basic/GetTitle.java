package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {
	static{  
			System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
	}
	public WebDriver driver=new EdgeDriver();
	
	
	
	public void getTitle()
	{
		driver.navigate().to("https://github.com/");
		 String str=driver.getTitle();
		 System.out.print(str);
	}
	
	
	public static void main(String[] args) {
	
		
		GetTitle title=new GetTitle();
		title.getTitle();
		
	}

}
