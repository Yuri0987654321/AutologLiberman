package com.newtours.demoaut;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 extends WebDrivingSettings {

    @Test
    public void openTitle() {
        driver.get("http://newtours.demoaut.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Проверика тайтла ", "Welcome: Mercury Tours", title);
    }


    @Test
    public void signUp() {
        driver.get("http://newtours.demoaut.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("userName")));
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        driver.findElement(By.name("password")).sendKeys("tutorial");
        driver.findElement(By.name("login")).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@src=\"/images/masts/mast_flightfinder.gif\"]")));


    }
}


