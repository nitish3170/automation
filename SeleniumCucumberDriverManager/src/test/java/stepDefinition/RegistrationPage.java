package stepDefinition;

import io.cucumber.java.en.Then;
import io.qameta.allure.*;
import org.junit.Test;

import static pages.RegistrationPage.*;

public class RegistrationPage {

    @Severity(SeverityLevel.NORMAL)
    @Description("New user details")
    @Story("Enter all the valid details on the registration page")
    @Feature("Registration")
    @Then("User should be able to view the Registration page")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        visibility_user_registration_page();
        sendkeys_firstname();
        sendkeys_lastname();
        sendkeys_contactNumber();
        sendkeys_emailID();
        sendkeys_PasswordID();
        sendkeys_UsernameId();
        Thread.sleep(2000);
        submit_Btm_click();
        validate_registration();
    }


}
