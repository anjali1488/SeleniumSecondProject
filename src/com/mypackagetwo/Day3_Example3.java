package com.mypackagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");

        //create an object of the chrome driver class
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Driver object got created....");

        //open the client url
        String url = "https://www.rediff.com";
        driver.get(url);
        
        driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
      
        String mytitle = driver.getTitle();
        System.out.println("Title of browser is :" + mytitle);
        
        String mycurURL = driver.getCurrentUrl();
        System.out.println("Title of currently opened window is:" + mycurURL);
        
        
        //identify the userid and pwd textboxes
        driver.findElement(By.id("login1")).sendKeys("anjali");
        System.out.println("login textbox is entered some values....");


        driver.findElement(By.id("password")).sendKeys("test anjali password");
        System.out.println("password textbox is entered some values....");

        //sign in button
        driver.findElement(By.name("proceed")).click();
        System.out.println("Sign in Submit button is clicked.......");


        System.out.println("getCurrentUrl of new page is ----> :"+ driver.getCurrentUrl());
        System.out.println("getTitle of new page is ----> :"+ driver.getTitle());   

        //move back
        driver.navigate().back();
        System.out.println("getCurrentUrl of new page is ----> :"+ driver.getCurrentUrl());
        System.out.println("getTitle of new page is ----> :"+ driver.getTitle());   

        driver.navigate().forward();
        System.out.println("we are now going forward in automation...");   

        //driver.navigate().refresh();

        //quit the browser.
        driver.quit();
       
	}

}
