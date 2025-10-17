package com.mobile.demo.project;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.Duration;

public abstract class BaseTest {

    @Value("${app.package}")
    private String appPackage;

    protected final AndroidDriver androidDriver;

    @Autowired
    public BaseTest(AndroidDriver androidDriver){
        this.androidDriver = androidDriver;
    }
    protected WebDriverWait getWait() {
        return new WebDriverWait(androidDriver, Duration.ofSeconds(10));
    }
}
