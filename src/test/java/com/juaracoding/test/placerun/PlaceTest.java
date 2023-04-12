package com.juaracoding.test.placerun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"com.juaracoding.test"},
        plugin = {"pretty", "html:target/report-cucumber-webHRM.html", "json:target/cucumber-webHRM.json"}
)

public class PlaceTest extends AbstractTestNGCucumberTests {
}
