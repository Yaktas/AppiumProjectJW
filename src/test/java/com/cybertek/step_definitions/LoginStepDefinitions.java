package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user click on get started button")
    public void user_click_on_get_started_button() {
        loginPage.getStartedElement.click();
    }

    @When("user logs in with etsy credentials")
    public void user_logs_in_with_etsy_credentials() throws InterruptedException {
        loginPage.login();
    }

    @Then("user verifies that etsy logo is displayed")
    public void user_verifies_that_etsy_logo_is_displayed() throws InterruptedException {


        Thread.sleep(3000);
        Assert.assertTrue(loginPage.whatsYourStyleMsg.isDisplayed());
    }
}