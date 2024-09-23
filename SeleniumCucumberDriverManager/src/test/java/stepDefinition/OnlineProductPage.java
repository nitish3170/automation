package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static pages.OnlineProductsPage.*;

public class OnlineProductPage {

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_Formal_Shoes_drop_down() throws InterruptedException {
        click_formalshoesdropdpown();
    }

    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_Products() throws InterruptedException {
        getText_formalshoes_firstvalue();
        assertEquals("   Classic Cheltenham",getText_formalshoes_firstvalue());
    }
}
