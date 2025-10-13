package com.mobile.demo.project.cucumber.config;

import com.mobile.demo.project.config.AppiumDriverConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(AppiumDriverConfig.class)
@CucumberContextConfiguration
@SpringBootTest
public class CucumberSpringConfiguration {
}
