package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/LoginWithData.feature",
glue="org.stepdefinition",monochrome=true)

public class login {

}
