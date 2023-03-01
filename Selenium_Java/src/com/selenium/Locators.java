package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Locators {
	static void findTHeWebElement() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement  username= driver.findElement(By.id("email"));
		username.sendKeys("Karthik123");
		WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("karthik@123");
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        Thread.sleep(5000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\screenshot\\facebook_screenshot.png");
        FileHandler.copy(source, destination);
        driver.close();
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		findTHeWebElement();
	}

}
