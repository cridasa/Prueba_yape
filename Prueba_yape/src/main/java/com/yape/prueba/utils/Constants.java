package com.yape.prueba.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	private static Constants instance;
	public Map<String, String> constantsDir = new HashMap<String, String>();

	private Constants() {
		//URL

		constantsDir.put("restful-booker API", "https://restful-booker.herokuapp.com");
		constantsDir.put("Booking Page", "https://booking.com");
		//END POINTS
		constantsDir.put("EndPoint POST Create Token", "/auth");
		constantsDir.put("End Point GET Ping", "/ping");
		constantsDir.put("EndPoint PUT UpdateRecord", "/booking/179");
		constantsDir.put("EndPoint PATCH UpdateRecord", "/booking/870");
		constantsDir.put("EndPoint DELETE Record", "/booking/6624");

	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantsDir.get(key);
	}

}
