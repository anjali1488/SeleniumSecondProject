package com.mypackagetwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Example1 {
	
	public static void main(String[] args) throws InterruptedException {
		//Launch the ToolsQA WebSite          
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");

        //create an object of the chrome driver class
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Driver object got created....");

        //open the client url
        String url = "https://www.rediff.com";
        driver.get(url);
        System.out.println("open the client url in chrome browser...");


        //maximize the browser window.
        driver.manage().window().maximize();
        System.out.println("Chrome browser window got maximized...");
      
	                              
	            
	  	String title = driver.getTitle();                               
		// Storing Title length in the Int variable                
		int titleLength = driver.getTitle().length();                               
		// Printing Title & Title length in the Console window                
		System.out.println("Title of the page is : " + title);                
		System.out.println("Length of the title is : "+ titleLength); 


	}
}
