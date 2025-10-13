package com.mobile.demo.project.cucumber.hooks;

import com.mobile.demo.project.page.ApkManager;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import org.springframework.beans.factory.annotation.Autowired;

public class AppiumHooks {

    @Autowired
    private ApkManager apkManager;

    @Autowired
    private AndroidDriver androidDriver;

    @After
    public void uninstallApp() {
        if (apkManager.isApkInstalled()) {
            apkManager.removeApk();
        }
    }
}
