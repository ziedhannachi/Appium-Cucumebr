package com.selogerMobile.e2eTests;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * @author Zied Hannachi
 *
 */

// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/features/Accueil.feature"}
					//,glue={"stepdefinations","utility"}
					,plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
					, tags ={"@Connexion"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests {
	
	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("C:\\Users\\Dell\\eclipse-workspace\\SelogerMobile\\src\\test\\ressources\\Configs\\extent-config.xml"));
	}

}
