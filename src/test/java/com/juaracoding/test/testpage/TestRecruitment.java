package com.juaracoding.test.testpage;

import com.juaracoding.test.libtest.LibraryTest;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.RegularPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {

    public static WebDriver driver;
    public static LoginPage pageLog;
    public static RecruitmentPage pageRecruitment = new RecruitmentPage();

    public static ExtentTest extentTest;
    public TestRecruitment(){
        driver = LibraryTest.driver;
        pageLog = new LoginPage();
        extentTest = LibraryTest.extentTest;

    }

    @When("Admin click menu recruitment")
    public void admin_click_menu_recruitment(){
        pageLog.login("Admin","admin123");
        extentTest.log(LogStatus.PASS,"Admin click menu recruitment");
        pageRecruitment.goRect();
    }
    @When("Admin click button add")
    public void admin_click_button_add(){
        pageRecruitment.btnAdd.click();
        extentTest.log(LogStatus.PASS,"Admin click button add");
    }
    @When("Admin enter invalid email")
    public void admin_enter_invalid_email(){
        RegularPage.delayDuration(1);
        extentTest.log(LogStatus.PASS,"Admin enter invalid email");
        pageRecruitment.email.sendKeys("hoih");
    }
    @When("Admin enter string")
    public void admin_enter_string(){
        extentTest.log(LogStatus.PASS,"Admin enter string");
        pageRecruitment.noTelp.sendKeys("aa");
    }
    @When("Admin enter file image")
    public void admin_enter_file_image(){
        extentTest.log(LogStatus.PASS, "Admin enter file image");
        pageRecruitment.doc.sendKeys("F:\\Download\\BAJU LAPANGAN ISR.jpg");
    }
    @When("Admin enter firstname")
    public void admin_enter_firstname(){
        extentTest.log(LogStatus.PASS,"Admin enter firstname");
        pageRecruitment.firstName.sendKeys("Ardian");
    }
    @And("Admin enter lastname")
    public void admin_enter_lastname(){
        extentTest.log(LogStatus.PASS, "Admin enter lastname");
        pageRecruitment.lastName.sendKeys("Hebat");
    }
    @And("Admin enter email")
    public void admin_enter_email(){
        extentTest.log(LogStatus.PASS, "Admin enter email");
        pageRecruitment.email.sendKeys(Keys.CONTROL + "a");
        pageRecruitment.email.sendKeys(Keys.DELETE);
        pageRecruitment.email.sendKeys("Juara@gmail.com");
    }
    @And("Admin enter no telp")
    public void admin_enter_no_telp(){
        extentTest.log(LogStatus.PASS, "Admin enter no telp");
        pageRecruitment.noTelp.sendKeys(Keys.CONTROL + "a");
        pageRecruitment.noTelp.sendKeys(Keys.DELETE);
        pageRecruitment.noTelp.sendKeys("08927819912");
    }
    @And("Admin enter file")
    public void admin_enter_file(){
        extentTest.log(LogStatus.PASS, "Admin enter file");
        pageRecruitment.doc.sendKeys("F:\\Berkas Lamar kerja\\CV Ardian Dwi Alfandi.docx");
    }
    @And("Admin enter keywords")
    public void admin_enter_keywords(){
        extentTest.log(LogStatus.PASS, "Admin enter keywords");
        pageRecruitment.note.sendKeys("Hebat");
    }
    @And("Admin enter date")
    public void admin_enter_date(){
        extentTest.log(LogStatus.PASS, "Admin enter date");
        pageRecruitment.tgl.sendKeys(pageRecruitment.dateNow);
    }
    @And("Admin enter notes")
    public void admin_enter_notes(){
        extentTest.log(LogStatus.PASS, "Admin enter notes");
        pageRecruitment.text.sendKeys("Memang hebat");
    }
    @And("Admin click icon")
    public void admin_click_icon(){
        extentTest.log(LogStatus.PASS, "Admin click icon");
        pageRecruitment.icon.click();
    }

    @And("Enter middle name")
    public void enter_middle_name(){
        extentTest.log(LogStatus.PASS,"Enter middle name");
        pageRecruitment.middleName.sendKeys("Dwi");
    }
    @And("Select vacancy")
    public void select_vacancy(){
        extentTest.log(LogStatus.PASS,"select vacancy");
        pageRecruitment.selectJob.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);
        RegularPage.delayDuration(1);
        RegularPage.scrollPage("0","200");
        RegularPage.delayDuration(1);
//        pageRecruitment.selectJob.click();
//        pageRecruitment.job.click();
    }
    @And("Click save")
    public void click_save(){
        extentTest.log(LogStatus.PASS,"Click save");
        RegularPage.delayDuration(2);
        pageRecruitment.save.click();
    }
    @Then("Admin go to page recruitment")
    public void  admin_go_to_page_recruitment(){
        extentTest.log(LogStatus.PASS,"Admin go to page recruitment");
        Assert.assertEquals(pageRecruitment.getTextRec(),"Recruitment");
    }
    @Then("Admin get to message required")
    public void Admin_get_to_message_required(){
        RegularPage.delayDuration(2);
        extentTest.log(LogStatus.PASS,"Admin get to message required");
        Assert.assertEquals(pageRecruitment.getRequired(),"Required");
        RegularPage.scrollPage("400","0");
    }
    @Then("Admin get message expect format")
    public void Admin_get_message_expect_format(){
        extentTest.log(LogStatus.PASS,"Admin get message expect format");
        Assert.assertTrue(pageRecruitment.expEmail.getText().contains("Expected"));

    }
    @Then("Admin get message allows number")
    public void admin_get_message_allows_number(){
        extentTest.log(LogStatus.PASS,"Admin get message allows number");
        Assert.assertTrue(pageRecruitment.allows.getText().contains("Allows"));
    }
    @Then("Admin get message not allow")
    public void admin_get_message_not_allow(){
        extentTest.log(LogStatus.PASS, "Admin get message not allow");
        Assert.assertTrue(pageRecruitment.fileAllow.getText().contains("File type"));
    }
    @Then("Admin get result name")
    public void admin_get_result_name(){
        extentTest.log(LogStatus.PASS, "Admin get result name");
        Assert.assertEquals(pageRecruitment.validateName.getText(),"Ardian Dwi Hebat");
    }
}
