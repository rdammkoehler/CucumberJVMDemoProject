package com.noradltd.cucumberjvm.demo;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json" }, monochrome = true)
public class RunCukeTest {

}