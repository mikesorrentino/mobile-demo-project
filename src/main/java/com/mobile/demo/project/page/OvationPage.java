package com.mobile.demo.project.page;

import com.mobile.demo.project.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class OvationPage extends BaseTest {



    //locator
    private final By accountIDBar = By.id("com.vitalpos.posmobile:id/fld_account_id");
    private final By userNameBar = By.id("com.vitalpos.posmobile:id/fld_username");
    private final By passwordBar = By.id("com.vitalpos.posmobile:id/fld_password");
    private final By logInButton = By.id("com.vitalpos.posmobile:id/btn_log_in");

    @Autowired
    public OvationPage(AndroidDriver androidDriver){
        super(androidDriver);
    }

    //enterid
    public void addAccountId(){
        WebElement accountId = getWait().until(ExpectedConditions.visibilityOfElementLocated(accountIDBar));
        accountId.clear();
        accountId.sendKeys("111707");
    }

    //enter user name
    public void addUserName(){
        WebElement userName = getWait().until(ExpectedConditions.visibilityOfElementLocated(userNameBar));
        userName.clear();
        userName.sendKeys("amationDev");
    }

    //enter password
    public void addPassword(){
        WebElement password = getWait().until(ExpectedConditions.visibilityOfElementLocated(passwordBar));
        password.clear();
        password.sendKeys("P@ssword08");
    }

    //click login
    public void clickOnLoginButton(){
        WebElement button = androidDriver.findElement(logInButton);
        button.click();
    }
}
