package stepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.*;
import org.junit.Test;

import static pages.HomePage.*;
public class HomePage {


    @Given("User navigates to the Login Page")
    @Description("User will navigate to login page")
    @Severity(SeverityLevel.BLOCKER)
    @Story("User will navigate to login page from the hamburger menu")
    @Feature("Login")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

    @Given("User navigates to the Online products page")
    @Description("User will navigate to Online product page")
    @Severity(SeverityLevel.CRITICAL)
    @Story("User will navigate to Online product page from the hamburger menu")
    @Feature("General User Login")
    public void user_navigates_to_the_Online_product_page() throws InterruptedException {
        Allure.getLifecycle().getCurrentTestCase();
        click_hamburger_menu();
        click_OnlineProducts_link();
    }

}
