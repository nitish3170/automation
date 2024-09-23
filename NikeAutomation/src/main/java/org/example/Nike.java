package org.example;

import org.checkerframework.checker.units.qual.A;
import org. junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.transform.Source;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.util.logging.FileHandler;

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



    @Test
    public void addToCart(){
        driver=new ChromeDriver();
        driver.get("https://www.nike.com/in/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement men=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Men')]")));
        men.click();
        WebElement shoes=wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Shoes')]"))));
        shoes.click();
        WebElement pegasus=wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='experience-wrapper']/div[@id='__next']/div[1]/div[2]/div[4]/div[1]/div[5]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/figure[1]/a[2]/div[1]/img[1]"))));
        pegasus.click();
        WebElement size=wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'UK 8.5')]"))));
        size.click();
        WebElement addToBag=wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='experience-wrapper']/div[@id='__next']/main[1]/div[2]/div[3]/div[5]/div[1]/button[1]"))));
        addToBag.click();
//        WebElement cart=wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]"))));



    }
    @Test
    public void screenShot() throws IOException {
        driver=new ChromeDriver();
        driver.get("https://www.nike.com/in/");
        driver.manage().window().maximize();
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File source= screenshot.getScreenshotAs(OutputType.FILE);
        File destination= new File("/Users/nitishprajapati/IdeaProjects/NikeAutomation/ScreenShot//"+"newSs.png");
        FileHandler.copy(source,destination);

    }


}
