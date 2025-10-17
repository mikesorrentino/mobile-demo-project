package com.mobile.demo.project.page;

import com.mobile.demo.project.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SplashPage extends BaseTest {

    @Autowired
    public SplashPage(AndroidDriver androidDriver){
        super(androidDriver);
    }

    //locator
    private final By loginButton = By.id("com.vitalpos.posmobile:id/btn_lets_go");


    //click on login button
    public void clickOnLogin(){
        WebElement button = androidDriver.findElement(loginButton);
        button.click();
    }
}
