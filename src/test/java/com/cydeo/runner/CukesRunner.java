package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/cucumber-report.html",
              "rerun:target/rerun.text",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
       },
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions" ,
        dryRun =false,
        tags = "@wip",
        publish = true
)

public class CukesRunner {

}
