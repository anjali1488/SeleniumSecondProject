package com.mypackagetwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");

        //create an object of the chrome driver class
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Driver object got created....");

        //open the client url
        String url = "https://www.rediff.com";
        driver.get(url);
        
        String title = driver.getTitle();
        // Storing Title length in the Int variable                
		int titleLength = driver.getTitle().length();
		// Printing Title & Title length in the Console window
		System.out.println("Title of the page is : " + title);
		System.out.println("Length of the title is : "+ titleLength);

	}
}
