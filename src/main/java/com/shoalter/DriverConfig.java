package com.shoalter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author ken.chen
 */
public class DriverConfig {

    public static WebDriver create() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        return new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
    }
}
