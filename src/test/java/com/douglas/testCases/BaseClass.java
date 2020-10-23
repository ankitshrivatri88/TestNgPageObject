package com.douglas.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public String baseURL = "https://www.douglas.de/mydouglas/login";
    public String username = "ankitshrivatri@yahoo.in";
    public String password = "12345678Ab";
    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/ankitshrivatri/Desktop/TestNGPageObject/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
