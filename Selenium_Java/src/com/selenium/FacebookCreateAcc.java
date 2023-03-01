package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAcc {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("karthik");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("1104");
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8248789766");
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123@4567");
	}

}
