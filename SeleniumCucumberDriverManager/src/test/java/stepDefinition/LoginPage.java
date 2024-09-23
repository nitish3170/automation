package stepDefinition;

import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import io.qameta.allure.*;
import org.junit.Test;

import static pages.LoginPage.*;

public class LoginPage{
    @Severity(SeverityLevel.BLOCKER)
    @Description("User will the log details")
    @Story("sending the login details i.e. username and password")
    @Feature("Login")
    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }
    @Severity(SeverityLevel.BLOCKER)
    @Description("New user Registration")
    @Story("Opens Registration page")
    @Feature("Registration")
    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();
    }

}
