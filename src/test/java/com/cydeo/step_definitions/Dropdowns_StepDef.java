package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdowns_StepDef {

    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) throws InterruptedException {


        //  Select select = new Select(dropdownPage.monthDropdown);

        //    List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //   List<String>actualOptionsString = new ArrayList<>();

        //  for(WebElement each: actualOptionsAsWebElement){

        //   actualOptionsString.add(each.getText());
//}


        //Assert will check the size of the list first, if it is matching it will check/verify content 1 by 1.
     //
      //  BrowserUtils.dropdownOptionsAsString(dropdownPage.monthDropdown);

        //This utility method will return us List of String of given dropdown WebElement.

        Thread.sleep(5000);
        List<String> actualOptionsAsString = BrowserUtils.dropdownOptionsAsString(dropdownPage.monthDropdown);
    Assert.assertEquals(expectedMonths, actualOptionsAsString);
    }

 }
