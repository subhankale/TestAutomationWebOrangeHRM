package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement pageLogout;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtDashboard;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginTitle;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement alertInvalid;
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement txtRequired;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[1]/img")
    WebElement gambar;

    public String getGambar(){
        return gambar.getAttribute("alt");
    }

    public String getLoginTitle(){
        return loginTitle.getText();
    }
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    public String getTxtInvalid(){
        return alertInvalid.getText();
    }
    public String getTxtReq(){
        return txtRequired.getText();
    }
    public void enterUsername(String username){
        this.username.sendKeys(username);

    }
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }
    public void btnLogin(){
        btnLogin.click();
    }

    public void dropdown(){
        pageLogout.click();
    }
    public void btnLogot(){
        btnLogout.click();
    }

}
