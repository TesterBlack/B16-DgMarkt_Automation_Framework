package com.dgmarkt.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/html-reports.html",
                "pretty",
                "rerun:target/rerun.txt"
        },
        features="src/test/resources/features",
        glue="com/dgmarkt/step_definitions",
        dryRun = true,
        publish = true,
        tags = "@wip"


)

public class Cukes_Runner {




}
