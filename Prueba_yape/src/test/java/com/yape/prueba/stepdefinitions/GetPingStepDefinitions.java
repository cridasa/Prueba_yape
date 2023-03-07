package com.yape.prueba.stepdefinitions;

import com.yape.prueba.apis.RestfulBookerApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.yape.prueba.utils.Constants.getData;

public class GetPingStepDefinitions {

	@Given("sets the base url {string}")
	public void setTheBaseUrl(String strBaseUrl) {
		RestfulBookerApi.setBaseUrl(getData(strBaseUrl));
	}
	@When("generates with {string}")
	public void sendGETRequestPing(String endPoint) {
		System.out.println(getData(endPoint));
		RestfulBookerApi.getPing(getData(endPoint));
	}
	@Then("validate that statusCode was <{int}>")
	public void validateThatStatusCodeWasAndResponse(Integer statusCode) {
		RestfulBookerApi.validateStatusCode(statusCode);
	}

}
