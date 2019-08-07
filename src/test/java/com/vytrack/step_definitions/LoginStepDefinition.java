package com.vytrack.step_definitions;

import com.vytrack.utilities.ApplicationConstants;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinition {

    @Given("The user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("I am on the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters credentials as {string} and {string}")
    public void user_enters_credentials_as_and(String username, String password) {
        System.out.println("I am entering my user credentials");

        LoginPage loginPage=new LoginPage();

        loginPage.userName.sendKeys(username);
        loginPage.passWord.sendKeys(password);
    }

    @Then("clicks on login button")
    public void clicks_on_login_button()throws InterruptedException{
        System.out.println("I am clicking login button");
        LoginPage loginPage=new LoginPage();
        loginPage.loginButton.click();
        Thread.sleep(4000);
    }

    @And("System should display the homepage")
    public void system_should_display_the_homepage() {
        System.out.println("I am seeing the homepage");
    }

    @Then("title should be displayed as {string}")
    public void title_should_be_displayed_as(String title) {
        System.out.println("Checking the title");
        System.out.println("title: " + ApplicationConstants.HOME_PAGE_TITLE);

        Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.HOME_PAGE_TITLE);
    }

}
