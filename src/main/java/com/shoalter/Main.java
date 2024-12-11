package com.shoalter;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * @author ken.chen
 */
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = DriverConfig.create();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}