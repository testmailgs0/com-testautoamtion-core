package org.company.BussinessLayer.Controls;

import org.company.BussinessLayer.Interfaces.ITestControl;
import org.company.Utilities.RequestHelper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RestPost extends RequestHelper implements ITestControl {

	@Parameters({"API_Name","ConfigRef","TestDataRef"})
	@Test
	public boolean executeControl(String API_Name,String Config, String TestDataRef) {

		System.out.println("I'm UnImplemented Post Method");
		return true;
		// TODO Auto-generated method stub

	}

}
