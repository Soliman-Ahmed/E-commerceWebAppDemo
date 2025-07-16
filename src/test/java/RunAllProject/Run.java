package RunAllProject;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
        (
                features = "src/main/resources/Feature files",
                glue = {"Tests"},
                plugin = {"pretty","html:target/report.html "}

        )

public class Run extends  AbstractTestNGCucumberTests{ }
