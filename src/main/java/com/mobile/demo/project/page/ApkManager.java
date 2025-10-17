package com.mobile.demo.project.page;

import com.mobile.demo.project.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApkManager extends BaseTest {

   public ApkManager(AndroidDriver androidDriver){
       super(androidDriver);
   }

    @Value("${app.package}")
    private String appPackage;

    public boolean isApkInstalled() {
        return androidDriver.isAppInstalled(appPackage);
    }

    public void removeApk() {
        androidDriver.removeApp(appPackage);
//        log.info("Apk [{}] removed.", appPackage);
    }
}
