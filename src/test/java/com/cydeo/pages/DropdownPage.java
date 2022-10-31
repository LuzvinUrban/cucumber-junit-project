package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DropdownPage {


    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

@FindBy(id="month")
public WebElement monthDropdown;

    }


