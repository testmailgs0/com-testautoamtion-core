package org.company.Application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.company.BussinessLayer.BussinessObjects.TestCaseConfig;
import org.company.BussinessLayer.BussinessObjects.TestExecutorConfig;
import org.company.BussinessLayer.BussinessObjects.TestScenarioConfig;
import org.company.BussinessLayer.Interfaces.ITestDataProvider;
import org.company.TestDataProvider.TestControllers.TCM_Controller;
import org.company.Utilities.TestNGHelper;
import org.testng.xml.XmlSuite.ParallelMode;

public class TestExecutor extends TestNGHelper {
	@SuppressWarnings({ "static-access", "deprecation", "unchecked" })
	public static void main(String[] args) {
		ITestDataProvider dataProvider = new TCM_Controller();
		dataProvider.CreateProvider("Excel");
		for (TestExecutorConfig Suite : (List<TestExecutorConfig>) dataProvider
				.getTestExecutionDetails("TestExecutorConfig")) {
			if (!(Boolean.parseBoolean(Suite.isParallel_Execution())))
				CreateSuite(Suite.getSuite_Name(), ParallelMode.FALSE);
			else
				CreateSuite(Suite.getSuite_Name(), ParallelMode.TRUE);
			List<String> suiteTests = Arrays.asList(Suite.getScenario_Name().split(","));
			for (TestScenarioConfig Test : (List<TestScenarioConfig>) dataProvider.getScenarioDetails(suiteTests)) {
				CreateTest(Suite.getSuite_Name(), Test.getScenarioID()); 
				List<String> TestCasesToAdd = Arrays.asList(Test.getTestCases().split(","));
				for (TestCaseConfig TCase : (List<TestCaseConfig>) dataProvider.getTesCaseDetails(TestCasesToAdd)) {
					Map<String, String> params = new HashMap<String, String>();
					params.put("API_Name", TCase.getAPI_Name());
					params.put("ConfigRef", TCase.getEndpoint());
					params.put("TestDataRef", TCase.getTestDataRef());
					CreateClasses(Suite.getSuite_Name(), Test.getScenarioID(), TCase.getAction(), params);
				}
			}
		}
		TestNGHelper.generateTestNGFiles();
		TestNGHelper.runtTestNgFiles();
	}
}
