package com.mobile.demo.project;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/mobile/demo/project/cucumber/features"},
        glue = {"com.mobile.demo.project.cucumber", "com.mobile.demo.project.cucumber.config"},

tags = ("")
)
public class MainRunner {
}
