package org.company.BussinessLayer.Interfaces;

import org.testng.annotations.Test;

public interface ITestControl {

	@Test
	public boolean executeControl(String API_Name,String ConfigRef, String TestDataRef);
}
