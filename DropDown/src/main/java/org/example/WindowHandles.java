package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles{
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parent=it.next();
        String child=it.next();
        driver.switchTo().window(child);

        String username=driver.findElement(By.cssSelector("p strong a")).getText();
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(username);
    }

}
