package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.HomePage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class FleetStepDefinition extends TestBase {

    @Given("truck driver is on login page")
    public void truck_driver_is_on_login_page() {
        System.out.println("User is opening the login page");
        String URL = ConfigurationReader.getProperty("Url"+ConfigurationReader.getProperty("environment"));
        Driver.getDriver().get(URL);

    }

    @When("truck driver logs in using credentials as {string} and {string}")
    public void truck_driver_logs_in_using_credentials_as_and(String username, String password) {
        System.out.println("User has logged in using his credentials");
        LoginPage loginPage=new LoginPage();
        loginPage.logIn(username,password);

    }

    @Then("truck driver sees all Vehicle info once navigates to Vehicle page")
    public void truck_driver_sees_all_Vehicle_info_once_navigates_to_Vehicle_page() {
        System.out.println("User is seeing all vehicle info after navigating to vehicle page");

        BasePage basePage=new BasePage();
        basePage.navigateToModule("Fleet","Vehicles");
        BrowserUtils.wait(3);



    }

    @And("truck driver clicks on any car on the grid")
    public void truck_driver_clicks_on_any_car_on_the_grid() {
        System.out.println("User is clicking on a random car on the grid");

        VehiclesPage vehiclesPage=new VehiclesPage();
        vehiclesPage.randomCar.click();

    }

    @Then("system should display general information about the car")
    public void system_should_display_general_information_about_the_car() {
        System.out.println("User is seeing general information about the car");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Marry Petter"));
    }


}
