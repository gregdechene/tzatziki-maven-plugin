package com.tzatziki;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/",
        tags = {"~@wip", "~@notImplemented"},
        plugin={"pretty","html:target/html", "tzatziki.analysis.exec.gson.JsonEmitterReport:target/myapp"})
public class ExecutionReport {
}