package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		
		//Download gecko driver, configure in Eclipse IDE and create a test and run the test		
		//firefox browser version: 69.0b14; gecko driver version: v0.24.0
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver webDriverGeckoObject = new FirefoxDriver();
		webDriverGeckoObject.manage().window().maximize();
		webDriverGeckoObject.get("https://www.google.com/");
		webDriverGeckoObject.close();	
		
		
		
		//Demo: Working with Chrome  Driver
		//Download chrome driver, configure in Eclipse IDE and create a test and run the test
		//Chrome browser version: 75.0.3770.80; Chrome driver version: 75.0.3770.90
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver webDriverChromeObject = new ChromeDriver();
		webDriverChromeObject.manage().window().maximize();
		webDriverChromeObject.get("https://www.google.com/");
		webDriverChromeObject.close();
		
		
		
		//Demo: Working with IE Driver
		//Download IE driver, configure in Eclipse IDE and create a test and run the test
		//IE browser version: 11; IE driver version: 3.14
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		WebDriver webDriverIEObject = new InternetExplorerDriver();
		webDriverIEObject.manage().window().maximize();
		webDriverIEObject.get("https://www.google.com/");
		webDriverIEObject.close();
		
		
		
		
		//Demo: Browser Commands
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver webDriverObjectForBCDemo = new ChromeDriver();
		webDriverObjectForBCDemo.manage().window().maximize();
		webDriverObjectForBCDemo.get("https://www.toolsqa.com/automation-practice-form/");
		System.out.println("Title of the website"+webDriverObjectForBCDemo.getTitle());
		System.out.println("Current URL of the website"+webDriverObjectForBCDemo.getCurrentUrl());		
		System.out.println("Page Source of the website"+webDriverObjectForBCDemo.getPageSource());
		Thread.sleep(10000);
		webDriverObjectForBCDemo.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
		Thread.sleep(5000);
		webDriverObjectForBCDemo.findElement(By.xpath("//div[@class='share-buttons']//a[@class='facebook']")).click();
		webDriverObjectForBCDemo.findElement(By.xpath("//div[@class='share-buttons']//a[@class='facebook']")).click();		
		Thread.sleep(10000);
		webDriverObjectForBCDemo.close();
		Thread.sleep(10000);
		webDriverObjectForBCDemo.quit();
		

		
		
		
		//Demo: Navigation Commands
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver webDriverObjectForNCDemo = new ChromeDriver();
		webDriverObjectForNCDemo.manage().window().maximize();
		webDriverObjectForNCDemo.get("https://www.google.com/");
		Thread.sleep(5000);
		webDriverObjectForNCDemo.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(10000);
		webDriverObjectForNCDemo.navigate().back();
		Thread.sleep(10000);
		webDriverObjectForNCDemo.navigate().forward();
		Thread.sleep(10000);
		webDriverObjectForNCDemo.navigate().refresh();
		Thread.sleep(10000);
		webDriverObjectForNCDemo.close();
		
		
		
		//Demo: Finding Elements Commands
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver webDriverObjectForFEDemo = new ChromeDriver();
		webDriverObjectForFEDemo.manage().window().maximize();
		webDriverObjectForFEDemo.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(10000);
		webDriverObjectForFEDemo.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
		webDriverObjectForFEDemo.findElement(By.id("lastname")).sendKeys("ln");
		Thread.sleep(10000);
		webDriverObjectForFEDemo.findElement(By.name("firstname")).sendKeys("fn");
		Thread.sleep(10000);
		webDriverObjectForFEDemo.findElement(By.className("btn")).click();
		Thread.sleep(10000);
		System.out.println("Button Text Value: "+webDriverObjectForFEDemo.findElement(By.tagName("button")).getText());
		Thread.sleep(5000);
		webDriverObjectForFEDemo.findElement(By.linkText("Link Test")).click();
		Thread.sleep(10000);		
		webDriverObjectForFEDemo.close();
		

		
		//Demo: Web Element Commands
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver webDriverObjectForWEDemo = new ChromeDriver();
		webDriverObjectForWEDemo.manage().window().maximize();
		webDriverObjectForWEDemo.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(10000);
		webDriverObjectForWEDemo.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
		webDriverObjectForWEDemo.findElement(By.id("lastname")).sendKeys("ln");
		Thread.sleep(5000);
		webDriverObjectForWEDemo.findElement(By.className("btn")).click();
		Thread.sleep(10000);
		System.out.println("Button Text Value: "+webDriverObjectForWEDemo.findElement(By.tagName("button")).isEnabled());
		System.out.println("Button Text Value: "+webDriverObjectForWEDemo.findElement(By.tagName("button")).getText());				
		System.out.println("Button Text Value: "+webDriverObjectForWEDemo.findElement(By.tagName("button")).getAttribute("type"));		
		webDriverObjectForWEDemo.close();
		
	}
}