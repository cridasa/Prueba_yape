package com.yape.prueba.apis;


import com.yape.prueba.restinteractions.RestInteractions;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;


import java.util.*;


import static com.yape.prueba.utils.Constants.getData;

public class RestfulBookerApi {

	private static final String USER_NAME = "admin";
	private static final String PASSWORD = "password123";
	private static String API_TOKEN = null;

	public static void setBaseUrl(String baseUrl) {
		RestInteractions.setBaseUrl(baseUrl);
	}

	public static void createToken(String endPoint) {
		Map<String, String> body = new HashMap<String, String>();
		body.put("username", USER_NAME);
		body.put("password", PASSWORD);
		RestInteractions.executionPostToken(getData(endPoint), body);
		API_TOKEN = SerenityRest.lastResponse().then().extract().path("token");
	}

	public static void getPing(String endPoint) {
		RestInteractions.executionPing(endPoint);
	}

	public static void updateRecord(String endPoint) {
		Map<String, String> body = new HashMap<String, String>();
		body.put("firstname", "James");
		body.put("lastname", "Brown");
		body.put("totalprice", "111");
		body.put("depositpaid", "true");
		body.put("additionalneeds", "Breakfast");
		body.put("bookingdates", "{checkin=2018-01-01, checkout=2019-01-01}");
		RestInteractions.executionPutUpdate(getData(endPoint), body, API_TOKEN);
	}
	public static void validateStatusCode(Integer statusCode) {
		RestInteractions.validateStatusCode(statusCode);
	}

	public static void patchUpdateRecord(String endPoint) {
		Map<String, String> body = new HashMap<String, String>();
		body.put("firstname", "James");
		body.put("lastname", "Brown");
		RestInteractions.executionPatchUpdate(getData(endPoint), body, API_TOKEN);
	}
	public static void deleteRecord(String endPoint) {
		RestInteractions.executionDeleteRecord(getData(endPoint), API_TOKEN);
	}
	public static void validateSinglePresent(String strField) {
		RestInteractions.validateSingleFieldStructure(strField);
	}

}
