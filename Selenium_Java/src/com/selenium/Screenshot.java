package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	static WebDriver driver;
	
	public static void launchBrower() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	static void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;           // narrowing Typecasting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\screenshot\\homepage.png");  // homepage.png -- we need to write this to add save screenshot in this
		FileHandler.copy(source, destination);
		driver.close();
		
	}
	public static void main(String[] args) throws IOException {
		launchBrower();
		screenshot();
	}
}
