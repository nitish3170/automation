package org.example;

//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");

//        dynamic dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value='MAA'])[1]")).click();
//        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click();

        driver.findElement(By.cssSelector(".ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2")).click();
//        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[7]/a[1]"));

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());









    }
}
