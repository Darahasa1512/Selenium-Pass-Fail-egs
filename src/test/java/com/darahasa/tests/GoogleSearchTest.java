package com.darahasa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\darah\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
        );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyGoogleSearchWorks() {
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
        driver.findElement(By.name("q")).submit();

        String title = driver.getTitle();
        System.out.println("Search page title: " + title);

        Assert.assertTrue(driver.getCurrentUrl().contains("search"),"Search results page did not load");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
