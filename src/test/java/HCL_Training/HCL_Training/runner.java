package HCL_Training.HCL_Training;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/f1.feature",glue="HCL_Training.HCL_Training",plugin={"json:target/cucumber.json","rerun:Feature/failed.txt"})

public class runner {

}
