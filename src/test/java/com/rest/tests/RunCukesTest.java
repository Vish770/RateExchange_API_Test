/**
 * 
 */
package com.rest.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 * @author Vishal
 *
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/ratesapi.feature"}         
        ,glue={"gluecode"}
)

public class RunCukesTest {
	
	

}



