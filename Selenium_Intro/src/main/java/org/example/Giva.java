package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Giva {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.giva.co/?gad_source=1&gclid=Cj0KCQjw0Oq2BhCCARIsAA5hubVfR5a7N0LUWDFbtbt5fAwuCSScnlm9sgMD-yG_Ek3rozdbOJ6xnG8aAsfMEALw_wcB");
        driver.manage().window().maximize();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement accounts=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shopify-section-sections--16317651026082__header\"]/sticky-header/header/div/a[2]/div/svg")));
        accounts.click();

        WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CustomerPassword")));
        email.sendKeys("jadhavrohit3004@gmail.com");

        WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CustomerPassword")));
        password.sendKeys("Jadhav#30");

        WebElement login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"customer_login\"]/button")));
        login.click();
    }
}
