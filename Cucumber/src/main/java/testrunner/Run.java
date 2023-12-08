package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="./FeatureFiles/ActitimeLogin.feature", glue="stepdefinitions")
public class Run extends AbstractTestNGCucumberTests {
 
}
