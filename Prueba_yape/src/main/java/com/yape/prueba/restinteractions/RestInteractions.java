package com.yape.prueba.restinteractions;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import java.io.File;
import java.util.Date;
import java.util.Map;

import static com.yape.prueba.utils.Constants.getData;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestInteractions {

	private static String baseUrl;


	public static void setBaseUrl(String baseUrl) {
		RestInteractions.baseUrl = baseUrl;
	}

	public static void executionPostToken(String endpoint, Map<String, String> body) {
		SerenityRest.given().contentType(ContentType.JSON).when().body(body).post(baseUrl.concat(endpoint));
		SerenityRest.lastResponse().prettyPeek();
	}

	public static void executionPing(String endpoint) {
		SerenityRest.given().when().get(baseUrl.concat(endpoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void executionPutUpdate(String endpoint, Map<String, String> body, String token) {
		SerenityRest.given()
				.headers( "Content-Type", ContentType.JSON, "Accept",
						ContentType.JSON, "Cookie", "token="+token).contentType(ContentType.JSON)
				.when().body(body).put(baseUrl.concat(endpoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void executionPatchUpdate(String endpoint, Map<String, String> body, String token) {
		SerenityRest.given()
				.headers( "Content-Type", ContentType.JSON, "Accept",
						ContentType.JSON, "Cookie", "token="+token).contentType(ContentType.JSON)
				.when().body(body).patch(baseUrl.concat(endpoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void executionDeleteRecord(String endpoint, String token) {
		SerenityRest.given()
				.headers( "Content-Type", ContentType.JSON,  "Cookie", "token="+token)
				.when().delete(baseUrl.concat(endpoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void validateStatusCode(Integer statusCode) {
		Integer statusActual = SerenityRest.lastResponse().getStatusCode();
		assertEquals(statusCode, statusActual);
	}

	public static void validateSingleFieldStructure(String strField) {
		SerenityRest.lastResponse().then().body("$", Matchers.hasKey(strField));
	}
}
