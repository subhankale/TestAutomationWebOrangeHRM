package com.juaracoding.test.libtest;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Regular;
import com.juaracoding.utils.RegularPage;
import com.juaracoding.utils.TestScenarios;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LibraryTest {
    public static WebDriver driver;

    public static ExtentReports reports = new ExtentReports("target/extent-report.html/");

    public static ExtentTest extentTest;

    @Before
    public static void setUp() {
        DriverSingleton.getInstance(Regular.CHROME);
        driver = DriverSingleton.getDriver();
        TestScenarios[] test = TestScenarios.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @After
    public void endTestCase() {
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName() + "\n"
                    + extentTest.addScreenCapture(screenshotPath));
        }
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterAll
    public static void close_object() {
        RegularPage.delayDuration(3);
        DriverSingleton.closeObjectInstance();
    }

}
