package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\ad\\com\\features", glue = { "ad.com.stepdefination",
		"ad.com.hooks" },dryRun = false, stepNotifications = true, plugin = { "html:target\\report\\Adactin.html" })

public class RunnerClass {

}

