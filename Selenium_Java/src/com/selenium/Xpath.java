package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static void usingXpath() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("karthik");
		driver.findElement(By.name("password")).sendKeys("xyz@123");
		
		// x path -  relative x path
		// syntax :  //tagname [@attributename = 'attributevalue']
		driver.findElement(By.xpath(" //button [@type = 'submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	static void xpath1() throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		// x path syntax :  (//tagname [@attributename = ' attributevalue'])[index]
		driver.findElement(By.xpath("( //a[@class = 'nav-a  '])[5]")).click();         // electronics  // [5] index value keep on changing 
		Thread.sleep(2000);
		
		// syntax : //tagname[text()= 'full text']
		driver.findElement(By.xpath("//a[text()= 'Customer Service']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		usingXpath();
		//xpath1();
	}
}
