package com.vytrack.pages;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }



   @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement Header;

    @FindBy(linkText = "Fleet")
    public WebElement Fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement Vehicles;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehicleOdometer;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement VehicleCosts;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement VehicleContracts;

    @FindBy(xpath = "//span[.='Vehicles Fuel Logs']")
    public WebElement VehiclesFuelLogs;

    @FindBy(xpath = "//span[.='Vehicle Services Logs']")
    public WebElement VehicleServicesLogs;

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement VehiclesModel;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement JettDach;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement Logout;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(className = "nav-input")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement resultLabel;

    @FindBy(css = "i[class='fa-caret-down'")
    public WebElement lilTriangle;

    @FindBy(xpath = "//a[.='My User']")
    public WebElement MyUser;

    @FindBy(css = "div[class='control-label']")
    public List<WebElement> userRightInfo;

    @FindBy(css = "label[class='control-label']")
    public List<WebElement> userLeftInfo;





    @FindBy(name = "username")
    public WebElement username1;

    @FindBy(name = "password")
    public WebElement password1;

    @FindBy(xpath = "//div//div[@id='flash']")
    public WebElement message1;






}
