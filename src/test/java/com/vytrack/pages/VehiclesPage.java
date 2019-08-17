package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage {
    public VehiclesPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//h1[.='Cars']")
    public WebElement Header;

    @FindBy(xpath = "//td[.='ABC123']")
    public WebElement randomCar;

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement generalInfoHeader;

}
