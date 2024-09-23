package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import static junit.framework.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {
    public static WebElement productcateogry_formalshoes = driver.findElement(By.xpath("//*[text()='Formal Shoes']"));

    public static WebElement productcateogry_sportsshoes = driver.findElement(By.xpath("//*[text()='Sports']"));

    public static WebElement productcateogry_sneakers = driver.findElement(By.xpath("//*[text()='Sneakers']"));

    public static void visibility_productcategory_formalshoes() {
        String formalshoesText = productcateogry_formalshoes.getText();
        assertEquals("Formal Shoes", formalshoesText);
    }
    public static void visibility_productcategory_sportsshoes() {
        String sportsshoesTextText = productcateogry_sportsshoes.getText();
        assertEquals("Sports",sportsshoesTextText);
    }

    public static void visibility_productcategory_sneakershoes(){
        String sneakersText =productcateogry_sneakers.getText();
        assertEquals("Sneakers",sneakersText);
    }
}
