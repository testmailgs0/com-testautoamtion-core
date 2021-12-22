package org.company.TestDataProvider.TestControllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.company.Application.Constants.ExcelConstants;
import org.company.BussinessLayer.BussinessObjects.TestCaseConfig;
import org.company.BussinessLayer.BussinessObjects.TestExecutorConfig;
import org.company.BussinessLayer.BussinessObjects.TestScenarioConfig;
import org.company.BussinessLayer.Interfaces.ITestDataProvider;
import org.company.TestDataProvider.ExcelDataLoader;

public class TCM_Controller implements ITestDataProvider {
	public List<TestExecutorConfig> getTestExecutionDetails(String ExecutionSheet) {
		try {
			return (List<TestExecutorConfig>) ExcelDataLoader.selectQuery(TestExecutorConfig.class,
					"Select * From TestExecutorConfig", ExcelConstants.getTCMPath());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<TestScenarioConfig> getScenarioDetails(List<String> SenarioIDs) {
		try {
			List<TestScenarioConfig> allScenarios = new ArrayList<TestScenarioConfig>();
			for (String scenarioID : SenarioIDs) {
				allScenarios.addAll((List<TestScenarioConfig>) ExcelDataLoader.selectQuery(TestScenarioConfig.class,
						"Select * from TestScenarios Where ScenarioID=" + "'" + scenarioID + "'",
						ExcelConstants.getTCMPath()));
			}
			return allScenarios;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// TODO Auto-generated method stub

	}

	public List<TestCaseConfig> getTesCaseDetails(List<String> TestCaseIDs) {
		try {
			List<TestCaseConfig> allClasses = new ArrayList<TestCaseConfig>();
			for (String queryCreator : TestCaseIDs) {
				String sheetName = Arrays.asList(queryCreator.split("_")).get(0);
				String testCaseID = Arrays.asList(queryCreator.split("_")).get(1);
				allClasses.addAll((List<TestCaseConfig>) ExcelDataLoader.selectQuery(TestCaseConfig.class,
						"Select * from " + sheetName + " Where TCID=" + "'" + testCaseID + "'",
						ExcelConstants.getTCMPath()));
			}
			return allClasses;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public void CreateProvider(String ProvderName) {

		// TODO Auto-generated method stub

	}

}
