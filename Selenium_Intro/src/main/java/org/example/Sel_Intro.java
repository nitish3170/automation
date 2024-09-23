package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Sel_Intro {
    public static void main(String[] args) {
//        chrome driver
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.nike.com/in/");
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.quit();

//        firefox Launch
//        geckodriver


//
//        System.setProperty("webdriver.edge.driver","/Users/nitishprajapati/Downloads/drivers/msedgedriver");
//
        WebDriver driver=new EdgeDriver();
        EdgeOptions options = new EdgeOptions();
        options.setBinary("/Users/nitishprajapati/Downloads/drivers/msedgedriver");

        WebDriver driver3=new EdgeDriver(options);
        driver.get("https://www.nike.com/in/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
