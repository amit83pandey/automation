package com.knowledgelibrary.example.selenium;

import org.openqa.selenium.WebDriver;
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
        
        // Just to wait for the screen.
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        driver.quit();
        
    }
}
