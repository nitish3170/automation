package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.TreeMap;

public class Facebook {
   public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

    }

//        System.setProperty("webdriver.gecko.driver","/Users/nitishprajapati/Downloads/drivers/geckodriver");
    @Test
   public void teest() throws InterruptedException {
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username= wait.until(ExpectedConditions.elementToBeClickable(By.className("inputtext")));
        username.sendKeys("sujit2GMAIL");
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));

        passwordField.sendKeys("pass1233456");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
        loginButton.click();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        username.clear();
        username.sendKeys("mohdanwarshaikh9@gmail.com");

        passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        passwordField.clear();
        passwordField.sendKeys("Anwar@123");
        Thread.sleep(1000);
        loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
        loginButton.click();
        Thread.sleep(4000);

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);

        driver.quit();

    }

    @Test
    public void signup() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Nitish");
        driver.findElement(By.name("lastname")).sendKeys("Prajapati");
        driver.findElement(By.name("reg_email__")).sendKeys("nitish3170@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Admin@123");
        driver.findElement(By.name("birthday_day")).click();
        driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[@value=\"14\"]")).click();
        driver.findElement(By.name("birthday_month")).click();
        driver.findElement(By.xpath("//select[@name=\"birthday_month\"]/option[@value=\"7\"]")).click();
        driver.findElement(By.name("birthday_year")).click();
        driver.findElement(By.xpath("//select[@name=\"birthday_year\"]/option[@value=\"1998\"]")).click();
        driver.findElement(By.xpath("//input[@value=2]")).click();
        driver.findElement((By.name("websubmit"))).click();


    }



}
