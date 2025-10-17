package com.mobile.demo.project.page;

import com.mobile.demo.project.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class LocationPage extends BaseTest {

    public LocationPage(AndroidDriver androidDriver){
        super(androidDriver);
    }

    //locator
    private final By locationHeader = By.id("com.vitalpos.posmobile:id/select_item_title");

    //validate select a location is shown
    public boolean verifyHeader(){
        WebElement header = getWait().until(ExpectedConditions.visibilityOfElementLocated(locationHeader));
        return header.getText().equalsIgnoreCase("Select a Location");
    }
}
