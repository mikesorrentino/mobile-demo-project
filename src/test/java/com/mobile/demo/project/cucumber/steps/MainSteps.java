package com.mobile.demo.project.cucumber.steps;

import com.mobile.demo.project.page.ApkManager;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class MainSteps {

    @Autowired
    private ApkManager apkManager;

    @Given("The user installed the application")
    public void given_TheUserInstallTheApplication() {
        Assert.assertTrue(apkManager.isApkInstalled());
    }
}
