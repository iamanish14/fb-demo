package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\fb\\com\\features\\Facebook.feature",
		glue="fb.com.stepdefinition",
		plugin={"json:target/fb.json"},
		monochrome = true,
		publish=true
		
		
		
		
		)
public class Test_runner {

}
//C:\Users\HP\eclipse-workspace\bd_demo.zip_expanded\Bd_demo\src\test\java\fb\com\features\Facebook.feature