package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookWith_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("karthik");
		driver.findElement(By.name("lastname")).sendKeys("11");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123$5678");
		
		WebElement day = driver.findElement(By.id("day"));
		Select ref1 = new Select(day);
		ref1.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("month"));
		Select ref2 = new Select(month);
		ref2.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.id("year"));
		Select ref3 = new Select(year);
		ref3.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
