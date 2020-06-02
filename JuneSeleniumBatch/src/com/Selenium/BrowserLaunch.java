package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{

	public static void main(String[] args)
	
	{
		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\MayBatch Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
	     driver.get("https://www.amazon.in");
		
		System.setProperty("webderiver.gecko.driver", "C:\\Users\\Dell\\Desktop\\MayBatch Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.bestbuy.com");
		
		//webdriver.edge.driver
		
		//webdriver.ie.driver

	}

}
