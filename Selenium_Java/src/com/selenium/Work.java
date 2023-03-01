package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.err.println("success");
//		driver.get("https://www.facebook.com/login.php/");
//		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
}
