package org.company.Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jayway.restassured.response.Header;

public class RequestHelper {
	protected Map<String, String> getParameters(String Params) {
		Map<String, String> parameters = new HashMap<String, String>();
		try {
			parameters = new HashMap<String, String>();
			List<String> allValues = Arrays.asList(Params.split(","));
			for (String Val : allValues) {
				List<String> kvp = Arrays.asList(Val.split("="));
				parameters.put(kvp.get(0), kvp.get(1));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parameters;
	}

	protected List<Header> getHeaders(String HeaderValues) {
		List<Header> headerList = new ArrayList<Header>();
		if (!(HeaderValues.isEmpty())) {
			List<String> Headers = Arrays.asList(HeaderValues.split(","));
			for (String Head : Headers) {
				List<String> HeaderValue = Arrays.asList(Head.split("="));
				Header h1 = new Header(HeaderValue.get(0), HeaderValue.get(1));
				headerList.add(h1);
			} 
		}
		return headerList;

	}
}
