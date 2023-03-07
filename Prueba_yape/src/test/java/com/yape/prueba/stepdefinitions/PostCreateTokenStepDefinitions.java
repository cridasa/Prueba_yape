package com.yape.prueba.stepdefinitions;

import com.yape.prueba.apis.RestfulBookerApi;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.yape.prueba.utils.Constants.getData;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PostCreateTokenStepDefinitions {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("set the base url {string}")
	public void setTheBaseUrl(String strBaseUrl) {
		RestfulBookerApi.setBaseUrl(getData(strBaseUrl));
	}

	@When("generates the token with {string}")
	public void generatesTheTokenWith(String strEndPoint) {
		RestfulBookerApi.createToken(strEndPoint);
	}

	@Then("validates that statusCode was <{int}>")
	public void validatesThatStatusCodeWas(Integer intStatusCode) {
		RestfulBookerApi.validateStatusCode(intStatusCode);
	}

	@Then("response contains field {string}")
	public void responseContainsField(String strField) {
		RestfulBookerApi.validateSinglePresent(strField);
	}

}
