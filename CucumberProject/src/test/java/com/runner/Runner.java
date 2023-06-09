package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.stepDefinition"},
monochrome=true,
plugin = {"html:Reports\\HTMLReports.html","json:Reports\\JsonReports\\Cucumber.json","junit:Reports\\JunitReports\\Cucumber.xml"}


		)
public class Runner {

}
