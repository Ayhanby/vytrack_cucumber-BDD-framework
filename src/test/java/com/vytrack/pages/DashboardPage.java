package com.vytrack.pages;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[title='Quick Launchpad']")
    public WebElement quickLaunchpad;

    @FindBy(xpath = "//span[@class='title-box']")
    public List<WebElement> lilBox;
}
