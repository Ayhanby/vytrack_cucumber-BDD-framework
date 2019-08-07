package com.vytrack.utilities;

import com.vytrack.pages.HomePage;
import com.vytrack.pages.LoginPage;


public class Pages {

    public LoginPage loginPage;
    public HomePage homePage;

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
}
