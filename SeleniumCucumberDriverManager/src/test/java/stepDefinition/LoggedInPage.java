package stepDefinition;

import io.cucumber.java.en.Then;
import io.qameta.allure.*;
import org.junit.Test;

import static pages.LoggedInPage.*;

public class LoggedInPage {

    @Then("User should be able to view the product category page")
    @Severity(SeverityLevel.MINOR)
    @Description("Opening and validating the product category page")
    @Story("After opening it will validate all the 3 shoes category")
    @Feature("ProductPage")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        visibility_productcategory_formalshoes();
        visibility_productcategory_sportsshoes();
        visibility_productcategory_sneakershoes();
    }
}
