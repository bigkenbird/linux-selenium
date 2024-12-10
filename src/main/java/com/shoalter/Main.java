package com.shoalter;

import com.shoalter.config.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ken.chen
 */
public class Main {
    public static void main(String[] args) {
        WebDriver driver = DriverConfig.create();
        driver.get("https://www.facebook.com/api/graphql/");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}