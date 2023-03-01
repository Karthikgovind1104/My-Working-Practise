package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {                                // To scroll up and down
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement australia = driver.findElement(By.xpath("//a[text()='Australia']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;         // narrowing type casting
		
		// ( "arguments[0].scrollIntoView();", webelement name );   ---->  syntax
		js.executeScript("arguments[0].scrollIntoView();", australia);
		
		Thread.sleep(3000);
		// to scroll up --->  ("window.scrollBy(0,1000);")
		js.executeScript("window.scrollBy(0,-5500);");
		
		Thread.sleep(3000);
		// to scroll down ---->  ("window.scrollBy(0,3000);")
		js.executeScript("window.scrollBy(0,3000);");
	}

}
