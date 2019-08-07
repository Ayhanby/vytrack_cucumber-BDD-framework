package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HomePage{

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement passWord;

    @FindBy(id="_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement warningMessage;

    @FindBy(linkText = "Alex Jones")
    public WebElement AlexJones;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;


    public void logIn(String userName, String passWord){
        LoginPage loginPage=new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().fullscreen();
        loginPage.userName.sendKeys(userName);
        loginPage.passWord.sendKeys(passWord);
        loginPage.loginButton.click();
    }

    public void open(){
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
    }

}
