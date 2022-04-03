package com.hepsiburada.Runners;

import com.hepsiburada.DriverUtility.Driver;
import io.cucumber.java.After;
import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature"
        ,glue={"TestSteps"}

)

public final class TestRunner extends AbstractTestNGCucumberTests {

    @After
    public void closeBrowser() {
        Driver.quitDriver();
    }
}
