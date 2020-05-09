package org.company.BussinessLayer.Controls;

import org.company.BussinessLayer.Interfaces.ITestControl;
import org.company.Utilities.RequestHelper;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;
import com.jayway.restassured.response.Response;

public class RestGet extends RequestHelper implements ITestControl {

	@Test
	public boolean executeControl() {
		try {
			String URl ="http://api.openweathermap.org/data/2.5/weather?q={q}&appid={appid}";
			Map<String,String> params = new HashMap<String, String>();
			params.put("q", "Delhi");
			params.put("appid", "d7e85c5297582f752292dc2405191830");
			Response res = get(URl,params);
			System.out.println(res.asString());
			return true;
			// TODO Auto-generated method stub
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}

	}

}
