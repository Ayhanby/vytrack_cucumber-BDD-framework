package com.vytrack.utilities;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.HomePage;
import com.vytrack.pages.LoginPage;


public class Pages {

    public LoginPage loginPage;
    public HomePage homePage;
    private DashboardPage dashboardPage;

    public HomePage homePage(){
        homePage=new HomePage();
        return homePage;
    }
    public LoginPage login(){

        if(loginPage==null){
            loginPage=new LoginPage();
        }

        return loginPage;
    }

    public DashboardPage dashboardPage(){
        if (dashboardPage==null){
            dashboardPage=new DashboardPage();
        }
        return dashboardPage;
    }
}
