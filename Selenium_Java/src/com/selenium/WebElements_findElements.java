package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_findElements {
	static void WebElements_Method() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("karthik");
		
		driver.findElement(By.id("pass")).sendKeys("123445");
	
		WebElement login = driver.findElement(By.name("login"));
		//login.click();
		
		boolean displayed = login.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		
		boolean selected = login.isSelected();
		System.out.println(selected);
		
		driver.close();
	}
	static void xpath() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement book = driver.findElement(By.xpath("//a[contains(@href,'/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books')]"));
		String text = book.getText();
		System.out.println(text);
		book.click();
		
		driver.findElement(By.xpath("//span[text()='Tamil']")).click();
		
		List<WebElement> totalbooks = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement singlebook : totalbooks) {
			String text2 = singlebook.getText();
			System.out.println(text2);
		}
		String ponniyinselvan ="Ponniyin Selvan Set of All five Parts (1,2,3,4 & 5) Tamil";
		for (WebElement singlebook : totalbooks) {
			if(singlebook.getText().equals(ponniyinselvan)) {                   // equals or contains
				singlebook.click();
			}
		}
		Thread.sleep(4000);
		//driver.close();          // closes the last tab but the new tab will exit
		driver.quit();

	}
	public static void main(String[] args) throws Exception {
		//WebElements_Method();
		xpath();
	}

}
