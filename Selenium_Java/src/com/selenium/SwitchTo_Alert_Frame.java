package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert_Frame {
	static void alert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("karthik");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}
	static void frames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//    SINGLE FRAME
//      //		WebElement frame1 = driver.findElement(By.id("singleframe"));
//      //		driver.switchTo().frame(frame1);                                 // by using webelement
//		driver.switchTo().frame(0);                                      //  using Index
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
//		
//		Thread.sleep(3000);
		
		//   NESTED FRAME
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		driver.switchTo().frame(frame2);
//		WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		driver.switchTo().frame(frame3);
		// OR  By Using Index
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karthik");
	}
public static void main(String[] args) throws InterruptedException {
	//alert();
	frames();
}
}
