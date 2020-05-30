package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html: target/reports/cucumber-html-report"},
        features = "src/test/java/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@MobileTest"
)
public class TestRunner {
}
