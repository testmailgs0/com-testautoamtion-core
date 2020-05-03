package org.company.bussinesslayer.RequestControls;

import org.company.interfaces.ITestRequest;
import org.company.utilities.RequestHelper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import java.util.Random;

import com.jayway.restassured.response.Response;

public class RestGet extends RequestHelper implements ITestRequest {

	@Test
	public void Execute() {
		try {
			Response res =when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=d7e85c5297582f752292dc2405191830");
			System.out.println(res.getStatusCode());
			// TODO Auto-generated method stub
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		
	}

}
