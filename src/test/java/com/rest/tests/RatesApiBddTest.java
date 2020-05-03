package com.rest.tests;


import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class RatesApiBddTest {
	
	@Test
	public void Latest_exchange_rates_test_Status_Code() {		
		
		given().
		when().
		       get("https://api.ratesapi.io").
		then().
		   assertThat().
		   
		   statusCode(200);
		   
	      System.out.println("Success status of of response for correct URL for Latest Foreign Exchange Test pass ");
	      
	      
	}	      
	      
	      @Test
	  	public void Incomplete_URL_test_Status_Code() {		
	  		
	  		given().
	  		when().
	  		       get("https://api.ratesapi.io/api/").
	  		then().
	  		   assertThat().
	  		   
	  		   statusCode(400);
	  		   
	  	      System.out.println(" Response of Incorrect URL for Latest Foreign Exchange Test case pass");
	  	      
	      }     
	  	   
	      
	      @Test
	  	public void Latest_dates_exchange_rates_test_Status_Code() {		
	  		
	  		given().
	  		when().
	  		       get("https://api.ratesapi.io/api/2010-01-12").
	  		then().
	  		   assertThat().
	  		   
	  		   statusCode(200);
	  		   
	  	      System.out.println(" Specific Date Foreign Exchange of response success status test case pass");
	  	      
	  	      
	  	}
		
	      
	      @Test
		  	public void Latest_dates_exchange_rates_future_date_test_response_sttaus() {		
		  		
		  		given().
		  		when().
		  		       get("https://api.ratesapi.io/api/2021-06-11").
		  		then().
		  		   assertThat().
		  		   
		  		   statusCode(200);
		  		   
		  	      System.out.println(" Future Dates exchange rates response test case pass");
		  	      
		  	      
		  	      
		  	      
		  	}     
	      
	      
	      
	

}




