package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RatesApiDefination {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;

	@Given("^I want to execute getURL method$")
	public void getURL() {
		RestAssured.baseURI = "//https:api.ratesapi.io";
		RestAssured.basePath = "/api";
	}

	@When("^I submit the GET request$")
	public void user_hit_the_webservice(String WebServiceURL) {
		response = request.when().get("https://api.ratesapi.io");
		System.out.println("response: " + response.prettyPrint());
	}

	@Then("^I should get (\\d+) Success Status code$")
	public void verify_status_code(int statusCode) {
		json = response.then().statusCode(statusCode);
	}

}
