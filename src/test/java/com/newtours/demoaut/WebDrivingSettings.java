package com.newtours.demoaut;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivingSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Start test");
    }

    @After
    public void close() {
        System.out.println("Stop test");
        driver.quit();
    }
}
