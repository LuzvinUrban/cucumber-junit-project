package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage {

    public void webTableOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //public void navigate_to() {
    //  Driver.getDriver().navigate().to(ConfigurationReader.getProperty("env"));

    // }


    @FindBy(name = "product")
    //xpath = "//input[@name='username']")
    public WebElement productTypeDropDown;


    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "product")
    public WebElement inputName;

    @FindBy(name = "Street")
    public WebElement inputStreet;


    @FindBy(name = "City")
    public WebElement inputCity;


    @FindBy(name = "State")
    public WebElement inputState;


    @FindBy(name = "Zip")
    public WebElement inputZip;


    @FindBy(name = "card")
    public List<WebElement> cardType;


    @FindBy(name = "product")
    public WebElement cardNo;


    @FindBy(name = "CardExp")
    public WebElement inputCardExp;


    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;


}