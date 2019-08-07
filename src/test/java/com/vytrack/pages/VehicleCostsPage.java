package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage {

    public VehicleCostsPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//h1[.='Vehicle Costs']")
    public WebElement Header;
}
