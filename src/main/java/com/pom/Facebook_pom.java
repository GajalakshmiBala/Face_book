package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_pom {
	
	public WebDriver driver;
	
	@FindBy(tagName = "h2")
	private WebElement tag;
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	public WebElement getTag() {
		return tag;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getlogin() {
		return login;
	}
	public WebDriver getdriver() {
		return driver;
	}
	public Facebook_pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements( driver, this);
	}
	
}

