package com.class26;

public class WebDriverTest {
public static void main(String[] args) {
	ChromeDriver chrome=new ChromeDriver();
	chrome.refresh();
	chrome.open();
	FirefoxDriver firefox=new FirefoxDriver();
	firefox.refresh();
	firefox.open();
// creating an object of child class and given reference to the parent class
	WebDriver driver=new ChromeDriver();
	driver.open();
	driver.refresh();
	//driver.getTitle(); not access to child specific class through parent type.
}
}
