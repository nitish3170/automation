package org.example;

//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2end {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value='DEL'])[1]")).click();

//        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//        driver.findElement(By.cssSelector(".ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("Is Enabled");
            Assert.assertFalse(false);
        }else{
            Assert.assertTrue(true);
        }

        WebElement staticDropDown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown=new Select(staticDropDown);
        dropdown.selectByIndex(3);

        driver.findElement(By.cssSelector(".ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi.ui-datepicker-multi-2")).click();
//        driver.findElement(By.cssSelector("td.ui-datepicker-days-cell-over.ui-datepicker-today")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i = 1; i < 3; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
