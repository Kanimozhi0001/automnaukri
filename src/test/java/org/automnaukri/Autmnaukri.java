package org.automnaukri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autmnaukri {
	
	public static void main(String[] args) throws Exception {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(9000);
		driver.get("https://www.naukri.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		
		
		Thread.sleep(50000);
		WebElement login = driver.findElement(By.id("login_Layer"));


		Actions a = new Actions(driver);
		
		a.click(login).build().perform();
		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("kanimoli.m11@gmail.com");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Kani994237*");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']/a")).click();
		
		//Thread.sleep(8000);
		//WebElement dr = driver.findElement(By.xpath("(//span[text()='editOneTheme'])[3]"));
		
		//JavascriptExecutor j =(JavascriptExecutor)dr;
		//j.executeScript("arguments[0].scrollIntoView();",j);
		//dr.click();
	
	}
	
	

}
