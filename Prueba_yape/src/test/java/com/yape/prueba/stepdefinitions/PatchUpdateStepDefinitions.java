package com.yape.prueba.stepdefinitions;

import com.yape.prueba.apis.RestfulBookerApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.yape.prueba.utils.Constants.getData;

public class PatchUpdateStepDefinitions {

	@Given("set this base url {string}")
	public void setThisBaseUrl(String strBaseUrl) {
		RestfulBookerApi.setBaseUrl(getData(strBaseUrl));
	}
	@When("patch update record with {string}")
	public void patchUpdateRecordWith(String endPoint) {
		RestfulBookerApi.createToken("EndPoint POST Create Token");
		RestfulBookerApi.patchUpdateRecord(endPoint);
	}
	@Then("validate that statusCode was <{int}> response")
	public void validateThatStatusCodeWasResponse(Integer statusCode) {
		RestfulBookerApi.validateStatusCode(statusCode);
	}


}
