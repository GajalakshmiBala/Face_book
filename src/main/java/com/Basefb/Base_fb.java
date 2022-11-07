package com.Basefb;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_fb {
	public static WebDriver driver;
	public static WebDriver browserlaunch(String a) 
	{	
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-workspace\\facebook\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		return driver;
	}
	public static void launchUrl(String b) {
		driver.get(b);
	}	
	public static void refresh() 
	{
		driver.navigate().refresh();
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void Title() 
	{
	String n=driver.getCurrentUrl();
	System.out.println(n);
	String title = driver.getTitle();
	System.out.println(title);
	String Page = driver.getPageSource();
	System.out.println(Page);
	}
	public static void printText(WebElement element) {
		String text = element.getText();
		System.out.println("The Text Content is: " +text);
	}
	public static void inputElement(WebElement element, String c) {
		element.sendKeys(c);
	}
	public static void clickElement(WebElement element) {
		element.click();
	}
	public static void isEnabled(WebElement element) {
		boolean check = element.isEnabled();
		System.out.println("The Selected Element is Enabled: "+check);
	}
	public static void screenshot(String value) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File("E:\\eclipse-workspace\\Selenium1\\pictures\\ "+value+" .png");
		FileUtils.copyFile(s,d);		
	}
	public static void dropDown(WebElement element, String d) {
		Select s = new Select(element);
		if(d.equalsIgnoreCase("value")) {
			s.selectByValue(d);
		}else if (d.equalsIgnoreCase("text")) {
			s.selectByVisibleText(d);
		}else if (d.equalsIgnoreCase("Integer")) {
			int n = Integer.parseInt(d);
			s.selectByIndex(n);
		}
		else {
			System.out.println("Invalid Selcetion");
		}	
	}


}
