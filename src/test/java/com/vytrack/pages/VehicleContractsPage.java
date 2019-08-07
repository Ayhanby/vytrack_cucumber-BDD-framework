package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage extends Menu {

    public VehicleContractsPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//div[@class='message']")
    public WebElement VehicleContractMessage;

}
