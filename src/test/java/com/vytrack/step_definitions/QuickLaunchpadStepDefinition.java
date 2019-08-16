package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.ApplicationConstants;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class QuickLaunchpadStepDefinition {



    @Then("user goes to the {string} page")
    public void user_goes_to_the_page(String quickLaunchpad) {

        System.out.println("I am seeing the Dashboards page");


        DashboardPage dashboardPage=new DashboardPage();
        String quicklaunchpad=dashboardPage.quickLaunchpad.getText();

        Assert.assertEquals(quicklaunchpad, ApplicationConstants.HOME_PAGE_HEADER);

    }

    @Then("user should see quick launchpad")
    public void user_should_see_quick_launchpad(List<String> launchpads) {

        System.out.println("I am seeing the quick launchpads");
        System.out.println(launchpads);

        DashboardPage dashboardPage=new DashboardPage();
        List<String> quicklaunchpads= BrowserUtils.getElementsText(dashboardPage.lilBox);
        Assert.assertTrue(launchpads.containsAll(quicklaunchpads));
    }




}
