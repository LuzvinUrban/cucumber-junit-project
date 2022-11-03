package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="username")
    public WebElement inputUsername;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement inputLoginBtn;

//    /**
//     * This method will accept username and password and login app
//     * @param username
//     * @param password
//     */

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        inputLoginBtn.click();
    }

    @FindBy(xpath = "//h1")
    public WebElement order;

}
