package org.company.BussinessLayer.Interfaces;

import java.util.List;

public interface ITestDataProvider {

	public void CreateProvider(String ProvderName);
	public List<?> getTestExecutionDetails(String SheetName);
	public List<?> getScenarioDetails(List<String> SenarioIDs);
	public List<?> getTesCaseDetails(List<String> TestCaseIDs);
}
