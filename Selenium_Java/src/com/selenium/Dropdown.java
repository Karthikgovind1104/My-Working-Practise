package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
	    //##############################################################################//
		WebElement fruits = driver.findElement(By.id("fruits"));
	    
	    // syntax for dropdown            Select refName = new Select(Webelement);
	    Select ref1 = new Select(fruits);
	    ref1.selectByIndex(1);
	    
	    //#############################################################################//
	    WebElement superhero = driver.findElement(By.id("superheros"));
	    Select ref2 = new Select(superhero);
	    ref2.selectByValue("ta");
	    ref2.selectByVisibleText("Batwoman");
	    WebElement firstSelectedOption = ref2.getFirstSelectedOption();
	    System.out.println("1st selected option : "+firstSelectedOption.getText());
	    
	    List<WebElement> allSelectedOptions = ref2.getAllSelectedOptions();   // selected options is ta and batwoman
	    for (WebElement oneOption : allSelectedOptions) {
			String text = oneOption.getText();
			System.out.println("all selected option : "+text);
		}
	    Thread.sleep(3000);
	    ref2.deselectByValue("ta");
	    Thread.sleep(3000);
	    
	    //###############################################################################//
	    WebElement languages = driver.findElement(By.id("lang"));
	    Select ref3 = new Select(languages);
	    ref3.selectByVisibleText("Java");
	    
	    List<WebElement> allLanguages = ref3.getOptions(); 
	    for (WebElement language : allLanguages) {
			System.out.println("all options : "+language.getText());
		}
	    
	    //###############################################################################//
	    WebElement country = driver.findElement(By.id("country"));
	    Select ref4 = new Select(country);
	    ref4.selectByVisibleText("India");
	    WebElement country1 = ref4.getFirstSelectedOption();
	    System.out.println(country1.getText());
	    
	    Thread.sleep(3000);
	    driver.quit();
	}

}
