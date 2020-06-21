package org.company.BussinessLayer.Controls;

import org.company.BussinessLayer.BussinessObjects.ORM;
import org.company.BussinessLayer.BussinessObjects.TDM;
import org.company.BussinessLayer.Interfaces.ITestControl;
import org.company.TestDataProvider.TestControllers.ORM_Controller;
import org.company.TestDataProvider.TestControllers.TDM_Controller;
import org.company.Utilities.RequestHelper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

import java.util.Arrays;
import java.util.List;

public class RestGet extends RequestHelper implements ITestControl {

	@Parameters({"API_Name","ConfigRef","TestDataRef"})
	@Test
	public boolean executeControl(String API_Name,String Config, String TestDataRef) {
		try {
			List<TDM> testData = TDM_Controller.getTestData(API_Name,Arrays.asList(TestDataRef.split(",")));
			List<ORM> ormData=ORM_Controller.getConfigData(API_Name, Arrays.asList(Config.split(",")));
			for (ORM odata :ormData) {
				for (TDM tData : testData) {
					Headers head = new Headers(getHeaders(tData.getHeaders()));
					Response res = given().headers(head).get(odata.getURL(),getParameters(tData.getParameters()));
					System.out.println(res.getStatusCode());
				} 
			}
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
