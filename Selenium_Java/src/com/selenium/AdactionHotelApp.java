package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactionHotelApp {
	static void creation() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		driver.findElement(By.name("username")).sendKeys("karthikgovind11");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.name("re_password")).sendKeys("1234567890");
		driver.findElement(By.name("full_name")).sendKeys("Karthik");
		driver.findElement(By.name("email_add")).sendKeys("karthikgovind1104@gmail.com");
	    
		//   For Captcha entering
		Scanner ref1 = new Scanner(System.in);
		System.out.println("enter the captcha");
		String captcha = ref1.next();
		driver.findElement(By.name("captcha")).sendKeys(captcha);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
	}
		
		static void afterCreation() throws InterruptedException, IOException {
		//  after creating and account
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
			driver.findElement(By.id("username")).sendKeys("karthikgovind11");
			driver.findElement(By.id("password")).sendKeys("1234567890");
			driver.findElement(By.id("login")).click();
			
			WebElement location = driver.findElement(By.id("location"));
			Select ref1 = new Select(location);
			ref1.selectByIndex(2);
			
			WebElement hotels = driver.findElement(By.id("hotels"));
			Select ref2 = new Select(hotels);
			ref2.selectByVisibleText("Hotel Hervey");
			
			WebElement room = driver.findElement(By.id("room_type"));
			Select ref3 = new Select(room);
			ref3.selectByVisibleText("Double");
			
			WebElement roomNos = driver.findElement(By.id("room_nos"));
			Select ref4 = new Select(roomNos);
			ref4.selectByVisibleText("2 - Two");
			
			WebElement datein = driver.findElement(By.id("datepick_in"));
			datein.clear();
			datein.sendKeys("23/12/2022");
			
			WebElement dateout = driver.findElement(By.id("datepick_out"));
			dateout.clear();
			dateout.sendKeys("25/12/2022");
			
			WebElement adultroom = driver.findElement(By.id("adult_room"));
			Select ref5 = new Select(adultroom);
			ref5.selectByVisibleText("3 - Three");
			
			WebElement childroom = driver.findElement(By.id("child_room"));
			Select ref6 = new Select(childroom);
			ref6.selectByVisibleText("1 - One");
			
			driver.findElement(By.id("Submit")).click();
			
			driver.findElement(By.id("radiobutton_0")).click();
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("first_name")).sendKeys("xyz");
			driver.findElement(By.id("last_name")).sendKeys("gk");
			driver.findElement(By.id("address")).sendKeys("xyz street, chennai");
			driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
			
			WebElement cc_type = driver.findElement(By.id("cc_type"));
			Select ref7 = new Select(cc_type);
			ref7.selectByVisibleText("VISA");
			
			WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
			Select ref8 = new Select(cc_exp_month);
			ref8.selectByVisibleText("April");
			
			WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
			Select ref9 = new Select(cc_exp_year);
			ref9.selectByVisibleText("2022");
			
			driver.findElement(By.id("cc_cvv")).sendKeys("482");
			driver.findElement(By.id("book_now")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		    driver.findElement(By.xpath("//input[@onclick='window.location=\"BookedItinerary.php\"']")).click();
			
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\screenshot\\booking.png");
			FileHandler.copy(source, destination);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
			
			driver.findElement(By.name("cancelall")).click();
			
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
			TakesScreenshot ts1 = (TakesScreenshot) driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\screenshot\\cancel.png");
			FileHandler.copy(source1, destination1);

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='Logout']")).click();
			
			TakesScreenshot ts2 = (TakesScreenshot) driver;
			File source2 = ts2.getScreenshotAs(OutputType.FILE);
			File destination2 = new File("C:\\Users\\91956\\eclipse-workspace\\Selenium_Java\\screenshot\\logout.png");
			FileHandler.copy(source2, destination2);
			Thread.sleep(5000);
			driver.quit();

		}	
public static void main(String[] args) throws InterruptedException, IOException {
	//creation();
	afterCreation();
}
}
