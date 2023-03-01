package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		
		List<WebElement> totalphones = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		for (WebElement single : totalphones) {
			System.out.println(single.getText());
		}
		String oneplus = "OnePlus Nord 2T 5G (Jade Fog, 12GB RAM, 256GB Storage)";
		for (WebElement singlephone : totalphones) {
			if(singlephone.getText().equals(oneplus)) {
				singlephone.click();
			}
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
