package com.mobile.demo.project.cucumber.steps;

import com.mobile.demo.project.page.ApkManager;
import com.mobile.demo.project.page.LocationPage;
import com.mobile.demo.project.page.OvationPage;
import com.mobile.demo.project.page.SplashPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class MainSteps {

    @Autowired
    private ApkManager apkManager;

    @Autowired
    SplashPage splashPage;

    @Autowired
    OvationPage ovationPage;

    @Autowired
    LocationPage locationPage;

    @Given("The user installed the application")
    public void given_TheUserInstallTheApplication() {
        Assert.assertTrue(apkManager.isApkInstalled());
    }

    @When("The user clicks on the GET Started button")
    public void when_TheUserClickOnTheGetStartedButton(){
        splashPage.clickOnLogin();
    }

    @When("The user adds account number, username and password and clicks login")
    public void the_user_adds_account_number_username_and_password_and_clicks_login() {
        ovationPage.addAccountId();
        ovationPage.addUserName();
        ovationPage.addPassword();
        ovationPage.clickOnLoginButton();
    }

    @Then ("Verify user was taken to Location selection screen")
    public void then_VerfiyUserWasTakeToLocationSelectionScreen(){
        Assert.assertTrue(locationPage.verifyHeader());
    }
}
