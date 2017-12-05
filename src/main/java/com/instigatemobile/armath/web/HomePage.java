package com.instigatemobile.armath.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sona Mikayelyan on 12/5/2017.
 */
public class HomePage {
    private By aboutButtonBy = By.linkText("About");
    private WebDriver webDriver;

    public HomePage(WebDriver driver) {
        webDriver = driver;
        webDriver.get("https://www.armath.am/");
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public void enterAboutPage() {
        WebElement enterButton = webDriver.findElement(aboutButtonBy);
        enterButton.click();
    }
}
