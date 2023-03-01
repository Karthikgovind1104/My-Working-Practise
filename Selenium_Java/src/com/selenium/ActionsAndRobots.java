package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobots {
	public static void rightClick() throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String homeWindow = driver.getWindowHandle();
		System.out.println("homewindow ID :"+homeWindow);
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		//  ACTIONS --->  MOUSE Control
		Actions ref = new Actions(driver);
		ref.contextClick(mobile).perform();
		
		//  ROBOT ---> KEYBOARD Control
		Robot ref2 = new Robot();              // Awt exception for robot
		ref2.keyPress(KeyEvent.VK_DOWN);
//		ref2.keyPress(KeyEvent.VK_DOWN);
		ref2.keyPress(KeyEvent.VK_ENTER);
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics '] "));
		ref.contextClick(electronics).perform();
		ref2.keyPress(KeyEvent.VK_DOWN);
		ref2.keyPress(KeyEvent.VK_ENTER);
		
		String homeWindowTitle = driver.switchTo().window(homeWindow).getTitle();
		System.out.println("homeTitle : "+homeWindowTitle);

		Set<String> totalWindow = driver.getWindowHandles();
//		for (String singleWindow : totalWindow) {
//			String allWindowtitle = driver.switchTo().window(singleWindow).getTitle();
//			System.out.println("allwindowtitle :"+allWindowtitle);
//		}
		
//		String mob = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
//		for (String singleWindow : totalWindow) {
//			if(driver.switchTo().window(singleWindow).getTitle().equals(mob)) {
//				driver.close();
//			}
//		}
	    
		String elec = "Electronics Store: Buy Electronics products Online at ";
		for (String singleWindow : totalWindow) {
			if(driver.switchTo().window(singleWindow).getTitle().contains(elec)) {
				break;
			}
		}
		
		//driver.findElement(By.linkText("Electronics & accessories")).click();
	}
	
	
	
	static void dragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Syntax
		Actions ref = new Actions(driver);       // we use mouse for drag and drop that's why we used this syntax
		Thread.sleep(3000);
		ref.dragAndDrop(drag, drop).perform();
	}
	
	
public static void main(String[] args) throws AWTException, InterruptedException {
	rightClick();
	//dragAndDrop();
    }
}
