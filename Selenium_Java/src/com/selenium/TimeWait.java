package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//  implicit wait ---->  only for no such element exception
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		// Explicit Wait ----> only for handling particular method
	}

}
