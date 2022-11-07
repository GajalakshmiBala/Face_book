package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Basefb.Base_fb;
import com.pom.Facebook_pom;

public class Facebook1 extends Base_fb {

	public static void main(String[] args) {
		browserlaunch("chrome");
		launchUrl("https://www.facebook.com/");
		
		Facebook_pom fb = new Facebook_pom(driver);
		
		printText(fb.getTag());

		inputElement(fb.getUsername(),"james");

		inputElement(fb.getPassword(),"preethi");

		clickElement(fb.getlogin());
		back();	
	}
}
