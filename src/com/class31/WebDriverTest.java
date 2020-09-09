package com.class31;

public class WebDriverTest {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.openBrowser();
		driver.closeBrowser();
		driver.maximazeWindow();
		driver.findElement();
		driver.takesScreen();
		
		WebDriver ts=new FirefoxDriver();
		ts.openBrowser();
		ts.closeBrowser();
		ts.maximazeWindow();
		ts.findElement();
		ts.takesScreen();
	}
}

