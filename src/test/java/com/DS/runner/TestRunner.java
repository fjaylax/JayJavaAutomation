package com.DS.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html", "rerun:target/rerun.txt",
                "json:target/cucumber.json"

                },
        features = "src/test/java/resources/features",
        glue = "com/DS/step_definitions",
        dryRun = false,
        tags = "@ui"


)
public class TestRunner {

}
