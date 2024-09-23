package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Nike {
    WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    }
    @Test
    public void signIn() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.nike.com/in/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Sign In')]")));
        signInButton.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        emailField.sendKeys("nitishaws01@gmail.com");

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        continueButton.click();
        Thread.sleep(2000);

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        passwordField.sendKeys("Ni.tish3386");

        passwordField.submit();

        System.out.println("Login successful!");
    }
//    @Test
//    public void addToCart(){
//        driver=new ChromeDriver();
//        driver=new ChromeDriver();
//        driver.get("https://www.nike.com/in/");
//
//        driver.manage().window().maximize();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//    }


}
