package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenGithubProfile {

	public static void main(String[] args) throws InterruptedException {

        System.out.println("Execution after setting EdgeDriver path in System Variables on Windows!!");
        WebDriver driver = new EdgeDriver();
        driver.get("https://github.com/login");
//       WebElement username= driver.findElement(By.id("login_field"));
//        WebElement password=driver.findElement(By.id("password"));
//        WebElement login=driver.findElement(By.id("Sign in"));
////        username.sendKeys("dmk07");
////        password.sendKeys("DIPAK@100k");
////        login.click();
        
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Execution complete on Windows");
	}

}
