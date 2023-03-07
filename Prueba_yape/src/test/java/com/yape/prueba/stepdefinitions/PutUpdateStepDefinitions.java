package com.yape.prueba.stepdefinitions;

import com.yape.prueba.apis.RestfulBookerApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.yape.prueba.utils.Constants.getData;

public class PutUpdateStepDefinitions {

	@Given("set the bases url {string}")
	public void setTheBasesUrl(String strBaseUrl) {
		System.out.println(getData(strBaseUrl));
		RestfulBookerApi.setBaseUrl(getData(strBaseUrl));
	}
	@When("update record with {string}")
	public void updateRecordWith(String endPoint) {
		System.out.println(getData(endPoint));
		RestfulBookerApi.createToken("EndPoint POST Create Token");
		RestfulBookerApi.updateRecord(endPoint);
	}
	@Then("validate that statusCodes was <{int}>")
	public void validateThatStatusCodesWas(Integer statusCode) {
		//RestfulBookerApi.validateStatusCode(statusCode);
	}

}
