package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locators {
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
    }
    @Test
    public void teest() throws InterruptedException {

        driver.get("https://www.nike.com/in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement signIn= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[class='link-item css-bsejbh'] button[type='submit'] p[role='presentation']")));
        signIn.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("credential")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", emailField);
        emailField.sendKeys("nitishaws01@gmail.com");

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordField.sendKeys("Ni.tish3386");


        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div/div[2]/button")));
        loginButton.click();


    }



}
