package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.java.en.Given;

public class HomepageStepDefinition {

    @Given("user opens login page")
    public void user_opens_login_page() {
        System.out.println("I am on the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
