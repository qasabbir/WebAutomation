package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class mainClass {
    public static void main(String[] args) {
        String driverLocation=System.getProperty("user.dir")+"/src/test/resources/driver/geckodriver";

        System.setProperty("webdriver.gecko.driver",driverLocation);
        WebDriver driver=new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        System.out.println(driver.findElement(By.id("logInPanelHeading")).getText());
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
        System.out.println(driver.findElement(By.id("welcome")).getText());

        driver.quit();



    }
}
