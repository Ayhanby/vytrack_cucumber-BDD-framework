package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Menu {

    public Menu(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(linkText = "Fleet")
    public WebElement Fleet;

    @FindBy(linkText = "Vehicles")
    public WebElement Vehicles;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehicleOdometer;

    @FindBy(linkText = "Vehicle Costs")
    public WebElement VehicleCosts;

    @FindBy(linkText = "Vehicle Contracts")
    public WebElement VehicleContracts;

    @FindBy(linkText = "Vehicles Fuel Logs")
    public WebElement VehiclesFuelLogs;

    @FindBy(linkText = "Vehicle Services Logs")
    public WebElement VehicleServicesLogs;

    @FindBy(linkText = "Vehicles Model")
    public WebElement VehiclesModel;





}
