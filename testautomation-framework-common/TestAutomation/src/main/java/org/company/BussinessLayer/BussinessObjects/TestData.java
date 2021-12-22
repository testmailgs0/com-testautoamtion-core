package org.company.BussinessLayer.BussinessObjects;

import java.util.List;

import org.company.BussinessLayer.Interfaces.ITestDataProvider;

public class TestData implements ITestDataProvider  {

	@Override
	public void CreateProvider(String ProvderName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> getTestExecutionDetails(String SheetName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getScenarioDetails(List<String> SenarioIDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getTesCaseDetails(List<String> TestCaseIDs) {
		// TODO Auto-generated method stub
		return null;
	}

}
