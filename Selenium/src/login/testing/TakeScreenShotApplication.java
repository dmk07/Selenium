package login.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotApplication {
	
	WebDriver driver=new EdgeDriver();
	static{
			System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
			
	}
	
	public void getScreenshot() throws IOException {

		driver.navigate().to("https://login.salesforce.com/?locale=in");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\dmk61\\OneDrive\\Desktop\\login.jpg");
		FileHandler.copy(src, des);		
	
		
		
	}

	public static void main(String[] args) throws IOException {

		TakeScreenShotApplication obj=new TakeScreenShotApplication();
		obj.getScreenshot();
		
		
	}

}
