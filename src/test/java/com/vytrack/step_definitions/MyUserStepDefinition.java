package com.vytrack.step_definitions;

import com.vytrack.pages.HomePage;
import com.vytrack.utilities.BrowserUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MyUserStepDefinition {

    @Then("Click on Username")
    public void click_on_Username() {
        System.out.println("I am clicking on User name");
        HomePage homePage=new HomePage();
        homePage.lilTriangle.click();
    }

    @And("Select My User option")
    public void select_My_User_option() {
        System.out.println("I am selecting my user option");
        HomePage homePage=new HomePage();
        homePage.MyUser.click();
    }

    @Then("User should see the my user general info")
    public void user_should_see_the_my_user_general_info(List<String> myUserInfo) {

        System.out.println("I am seeing My User general Info");
        System.out.println(myUserInfo);
        HomePage homePage=new HomePage();
        List<String> generalRightInfo= BrowserUtils.getElementsText(homePage.userRightInfo);
        List<String> generalLeftInfo= BrowserUtils.getElementsText(homePage.userLeftInfo);


        Assert.assertTrue(myUserInfo.containsAll(generalLeftInfo));
        Assert.assertTrue(myUserInfo.containsAll(generalRightInfo));
    }






}
