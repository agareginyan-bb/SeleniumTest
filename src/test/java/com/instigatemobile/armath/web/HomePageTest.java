package com.instigatemobile.armath.web;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Sona Mikayelyan on 12/5/2017.
 */
public class HomePageTest {
    @Test
    void checkPageTitle() {
        System.setProperty("webdriver.chrome.driver", "/home/student/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);

        /**
         * get the word "Armath" from html <title> tag for home page
         */
        String title = homePage.getTitle();

		driver.findElement(By.id("id_about"));
        /**
         * Enter "about" page
         */
        homePage.enterAboutPage();
        
        driver.findElement(By.id("id_labs"));
        WebElement element = driver.findElement(By.id("id_events"));
        if(element.getText() != "") {
			System.out.println(element.getText());
		} else {
			System.out.println("Element by id id_events does not exist");
		}

        /**
         * assert, that home page title contains(in this case is exactly) the word "Armath"
         */
        assertTrue(title.contains("Armath"));

    }
}
