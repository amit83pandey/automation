package com.knowledgelibrary.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Selenium!");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is : " + driver.getTitle());
		try {
			// Note : Did not worked because the web page open it with selenium is different than the one used to determine xpath in first go. 
			// String gmailLocator = "/html/body/header/div[2]/div[3]/div[1]/div/div[1]/a" ;

			String gmailLocator = "/html/body/div[2]/div[2]/div/div/header/div[1]/div[1]/a";

			WebElement gmailElement = driver.findElement(By.xpath(gmailLocator));

			gmailElement.click();

			// Just to wait for the screen.
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// To ensure we do not leave any browser instance opened in case of exception.
			if (driver != null) {
				driver.quit();
			}
		}

	}
}
