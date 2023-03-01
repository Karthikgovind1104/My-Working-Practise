package com.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	private static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();               // up casting
		driver.get("https://en-gb.facebook.com/");             // get ---> launch the url
		driver.manage().window().maximize();                   // maximize the windows
		System.out.println("launch browser success");
		driver.close();

	}

	public static void navigateBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		 Thread.sleep(2000);                      // throws InterruptedException
		driver.close();
		
		
		//System.out.println("navigate browser successful");
	}

	public static void main(String[] args) throws InterruptedException {
		// launchBrowser();
		navigateBrowser();
	}

}
