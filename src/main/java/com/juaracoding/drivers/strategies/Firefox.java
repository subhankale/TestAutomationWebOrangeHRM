package com.juaracoding.drivers.strategies;

import com.juaracoding.utils.Regular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", Regular.FIREFOXDRIVER);
        driver = new FirefoxDriver();
        return driver;
    }
}
