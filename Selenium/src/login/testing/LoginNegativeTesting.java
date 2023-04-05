package login.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginNegativeTesting {

	static {
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}
	WebDriver driver = new EdgeDriver();

	public void AutoAUT() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("dipak@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("DIPAKDiui");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
	}

	public static void main(String[] args) throws InterruptedException {

		LoginNegativeTesting obj = new LoginNegativeTesting();
		obj.AutoAUT();

	}

}
