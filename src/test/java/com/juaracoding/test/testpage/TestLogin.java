package com.juaracoding.test.testpage;

import com.juaracoding.test.libtest.LibraryTest;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Regular;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    public static WebDriver driver;
    public static LoginPage pageLog;
    public static ExtentTest extentTest;

    public TestLogin(){
        driver = LibraryTest.driver;
        pageLog = new LoginPage();
        extentTest = LibraryTest.extentTest;
    }


    @Given("User open browser and url")
    public void user_open_browser_and_url() {
        extentTest.log(LogStatus.PASS,"User open browser and url");
        driver.get(Regular.URL);
    }

    @Given("User refresh web HRM")
    public void user_refresh_web_HRM() {
        LibraryTest.delay(1);
        extentTest.log(LogStatus.PASS,"User refresh web HRM");
        driver.navigate().refresh();
    }

    @When("User enter valid username")
    public void user_enter_valid_username() {
        extentTest.log(LogStatus.PASS,"User enter valid username");
        logUs("Admin");
    }

    @And("User enter valid password")
    public void user_enter_valid_password() {
        extentTest.log(LogStatus.PASS,"User enter valid password");
        logPas("admin123");
    }

    @And("User click button login")
    public void user_click_button_login() {
        extentTest.log(LogStatus.PASS,"User click button login");
        pageLog.btnLogin();
    }

    @When("User enter invalid username")
    public void user_enter_invalid_username() {
        extentTest.log(LogStatus.PASS,"User enter invalid username");
        logUs("Yuhuu");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password() {
        extentTest.log(LogStatus.PASS,"User enter invalid password");
        logPas("ardian");
    }

    @When("User empty username")
    public void user_empty_username() {
        extentTest.log(LogStatus.PASS,"User empty username");
        logUs("");
    }

    @And("User empty password")
    public void user_empty_password() {
        extentTest.log(LogStatus.PASS,"User empty password");
        logPas("");
        LibraryTest.delay(1);
    }

    @When("User click user dropdown")
    public void User_click_user_dropdown(){
        extentTest.log(LogStatus.PASS,"User click user dropdown");
        LibraryTest.delay(1);
        pageLog.dropdown();
    }
    @And("User click button logout")
    public void user_click_button_logout() {
        extentTest.log(LogStatus.PASS,"User click button logout");
        LibraryTest.delay(1);
        pageLog.btnLogot();
    }

    @Then("User go to page dashboard")
    public void user_go_to_page_dashboard() {
        extentTest.log(LogStatus.PASS,"User go to page dashboard");
        Assert.assertEquals(pageLog.getTxtDashboard(), "Dashboard");
    }

    @Then("User get message invalid credential")
    public void user_get_message_invalid_credential() {
        extentTest.log(LogStatus.PASS,"User get message invalid credential");
        Assert.assertEquals(pageLog.getTxtInvalid(), "Invalid credentials");
    }

    @Then("User get message required")
    public void user_ge_message_required() {
        extentTest.log(LogStatus.PASS,"User get message required");
        Assert.assertEquals(pageLog.getTxtReq(), "Required");
    }
    @Then("User get logo orange HRM")
    public void user_get_logo_orange_HRM(){
        extentTest.log(LogStatus.PASS,"User get logo orange HRM");
        Assert.assertEquals(pageLog.getGambar(),"orangehrm-logo");
    }

    public void logUs(String user) {
        pageLog.enterUsername(user);
    }

    public void logPas(String pass) {
        pageLog.enterPassword(pass);
    }

}
