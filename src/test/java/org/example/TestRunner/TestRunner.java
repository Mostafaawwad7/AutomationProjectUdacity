package org.example.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/main/resources/features",
        glue = {"org/example"},
        //monochrome = true,
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
                    "junit:target/cukes.xml","rerun:target/rerun.txt"},
       // dryRun = false,
        tags = "@SmokeTest"
)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
