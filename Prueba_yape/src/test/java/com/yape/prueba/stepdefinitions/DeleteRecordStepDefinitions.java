package com.yape.prueba.stepdefinitions;

import com.yape.prueba.apis.RestfulBookerApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.yape.prueba.utils.Constants.getData;

public class DeleteRecordStepDefinitions {
	@Given("set the bases this url {string}")
	public void setTheBasesThisUrl(String strBaseUrl) {
		RestfulBookerApi.setBaseUrl(getData(strBaseUrl));
	}

	@When("delete record with {string}")
	public void deleteRecordWith(String endPoint) {
		RestfulBookerApi.createToken("EndPoint POST Create Token");
		RestfulBookerApi.deleteRecord(endPoint);
	}
	@Then("validate that statusCodes response was <{int}>")
	public void validateThatStatusCodesResponseWas(Integer statusCode) {
		RestfulBookerApi.validateStatusCode(statusCode);
	}

}
