package com.mypackagetwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
		//		    public static void main(String[] args) throws InterruptedException {
		        // System.setProperty - to set the path of the chromedriver.exe in your machine..
		        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");

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

		        // make your selenium script to sleep for 3 seconds, to allow all the controls on the page to get loaded...
		        Thread.sleep(3000);
		        System.out.println("make your selenium script to wait for 3 seconds, for all the controls to get loaded...");

		        //minimize the browser.
		        driver.manage().window().minimize();
		        System.out.println("now the chrome browser window is MINIMIZED...");

		        //close the browser
		        driver.close();
		        System.out.println("Chrome browser will get closed here....");
		 
		    }
		 
	
		 
		/*
		 * 
		 * Chrome Driver object got created....
		open the client url in chrome browser...
		Chrome browser window got maximized...
		make your selenium script to wait for 3 seconds, for all the controls to get loaded...
		now the chrome browser window is MINIMIZED...
		[1667458567.395][SEVERE]: Unable to receive message from renderer
		Chrome browser will get closed here....
		*/
	}

