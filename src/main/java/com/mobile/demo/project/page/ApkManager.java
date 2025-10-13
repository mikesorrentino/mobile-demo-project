package com.mobile.demo.project.page;

import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApkManager {

    @Value("${app.package}")
    private String appPackage;

    @Autowired
    private AndroidDriver androidDriver;

    public boolean isApkInstalled() {
        return androidDriver.isAppInstalled(appPackage);
    }

    public void removeApk() {
        androidDriver.removeApp(appPackage);
        log.info("Apk [{}] removed.", appPackage);
    }
}
