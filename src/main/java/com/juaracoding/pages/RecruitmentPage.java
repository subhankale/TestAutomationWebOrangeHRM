package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.RegularPage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecruitmentPage {

    public RecruitmentPage(){
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    public JavascriptExecutor js;

    DateFormat tanggal = new SimpleDateFormat("MM-dd-yyyy");
    Date hariini = new Date();
    public String dateNow = tanggal.format(hariini);
    @FindBy (xpath= "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")
    WebElement btnrecrruitment;
        @FindBy( xpath ="//button[normalize-space()='Add']")
        public WebElement btnAdd;
        @FindBy( name ="firstName")
        public WebElement firstName;
        @FindBy( name = "middleName")
        public WebElement middleName;
        @FindBy( name ="lastName")
        public WebElement lastName;
        @FindBy(xpath = "//div[@class='oxd-select-text-input']")
        public WebElement selectJob;
        @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")
        public WebElement job;
        @FindBy( xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
        public WebElement email;
        @FindBy( xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]")
        public WebElement noTelp;
        @FindBy( xpath = "//input[@type='file']")
        public WebElement doc;
        @FindBy( xpath = "//input[@placeholder='Enter comma seperated words...']")
        public WebElement note;
        @FindBy( tagName = "input")
        public WebElement tgl;
        @FindBy( tagName = "textarea")
        public WebElement text;
        @FindBy( xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
        public WebElement icon;
        @FindBy( xpath= "//button[normalize-space()='Save']")
        public WebElement save;
        @FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/h6")
        public WebElement dashboardText;
        @FindBy(xpath = "//h6[normalize-space()='Recruitment']")
        public WebElement txtRect;
        @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/span")
        public WebElement requiredTxt;
        @FindBy(xpath = "//span[normalize-space()='Expected format: admin@example.com']")
        public WebElement expEmail;
        @FindBy(xpath = "//span[normalize-space()='Allows numbers and only + - / ( )']")
        public WebElement allows;
        @FindBy(xpath = "//span[normalize-space()='File type not allowed']")
        public WebElement fileAllow;
        @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[1]/div[1]/div/div[2]/p")
        public WebElement validateName;

        public String getTextRec(){
           return txtRect.getText();
        }

    public String getRequired(){
            if(firstName == null){
                requiredTxt.getText();
            } else if (lastName == null) {
                requiredTxt.getText();
            } else{
                requiredTxt.getText();
            }
        return requiredTxt.getText();
    }
    public void goRect(){
        btnrecrruitment.click();
    }


}
