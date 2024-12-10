package com.shoalter;

import com.shoalter.config.DriverConfig;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IgCrawlerExample {

    public static void main(String[] args) throws IOException {
        String url = "https://bonigarcia.dev/selenium-webdriver-java/";
        WebDriver driver = DriverConfig.create();
        driver.get(url);
        System.out.println("title:"+driver.getTitle());
    }
}
