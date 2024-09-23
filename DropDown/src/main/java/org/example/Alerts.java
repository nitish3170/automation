package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        driver.findElement(By.id("name")).sendKeys("Nitish");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);


        driver.switchTo().alert().accept();
        driver.findElement(By.id("name")).sendKeys("Nitish");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();


    }
}
