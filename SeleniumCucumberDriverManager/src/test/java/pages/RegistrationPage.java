package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

import static junit.framework.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String userRegistration_xpath = "/html/body/center/h1";
    public static String firstnameID="firstname";
    public static String lastnameId="lastname";
    public static String emailId="emailId";
    public static String contactNumberId="contactNumber";
    public static String usernameId="usr";
    public static String passwordID="pwd";
    public static String submitBtmXpath="//input[@value=\"Submit\"]";

    public static void visibility_user_registration_page() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(userRegistration_xpath)).getText();
        Assert.assertEquals("User Registration Page",actualproductcategory_fs);
    }
    public static void sendkeys_firstname(){
        driver.findElement(By.id(firstnameID)).sendKeys("Nitish");
    }
    public static void sendkeys_lastname(){
        driver.findElement(By.id(lastnameId)).sendKeys("Prajapati");
    }
    public static void sendkeys_emailID(){
        driver.findElement(By.id(emailId)).sendKeys("example@gmail.com");
    }
    public static void sendkeys_contactNumber(){
        driver.findElement(By.id(contactNumberId)).sendKeys("1234567890");
    }
    public static void sendkeys_UsernameId(){
        driver.findElement(By.id(usernameId)).sendKeys("xx");
    }
    public static void sendkeys_PasswordID(){
        driver.findElement(By.id(passwordID)).sendKeys("xx");
    }

    public static void submit_Btm_click(){
        driver.findElement(By.xpath(submitBtmXpath)).click();
    }

    public static void validate_registration(){
        String registrationtext=driver.findElement(By.xpath("//body//center//h1")).getText();
        assertEquals("User Registered Successfully !!!",registrationtext);
    }
}
