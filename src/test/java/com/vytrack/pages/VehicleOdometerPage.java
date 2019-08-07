package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//h1[.='Vehicles Odometers']")
    public WebElement Header;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement CreateVehicleOdometer;

    @FindBy(id="custom_entity_type_OdometerValue-uid-5d20e839caee5")
    public WebElement OdometerValue;

    @FindBy(id="date_selector_custom_entity_type_Date-uid-5d20e839cafde")
    public WebElement Date;

    @FindBy(xpath = "//button[.='Today']")
    public WebElement Today;

    @FindBy(id="custom_entity_type_Driver-uid-5d20e839cb0e9")
    public WebElement VyTrackDriver;

    @FindBy(xpath = "//a[@class='select2-choice']")
    public WebElement Unit;

    @FindBy(xpath = "//a[@class='select2-choice select2-default']")
    public WebElement Model;

    @FindBy(xpath = "//button[@class='btn btn-medium add-btn']")
    public WebElement LicensePlate;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement SaveAndClose;

    @FindBy(xpath = "//a[@class='btn back icons-holder-text ']")
    public WebElement Cancel;

}
