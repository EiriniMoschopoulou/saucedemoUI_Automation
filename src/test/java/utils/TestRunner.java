package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {


                "html:target/reports/cucumber-html-reports/html-report.html",

        },
        features = {"src/test/resources/Features"},
        glue={"steps","Hooks"}
)


public class TestRunner {

}
