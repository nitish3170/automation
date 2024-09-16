package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKart {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String[] items={"Cucumber","Brocolli","Cauliflower","Beetroot","Beans"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        addItems(driver,items);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver,String[] items){
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        List<String> itemsList= Arrays.asList(items);

        System.out.println(itemsList);
        for(int i=0;i<products.size();i++){
            String name=(products.get(i).getText()).split(" ")[0];
//            System.out.println(name);

            if(itemsList.contains(name)){
//                System.out.println(name);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            }
        }
    }
}
