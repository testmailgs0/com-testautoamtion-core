package org.company.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.company.TestDataProvider.ExcelDataController;
import org.company.TestDataProvider.SQLDataController;
import org.company.TestDataProvider.ExcelDataProvider.ExcelConfigLoader;
import org.company.TestDataProvider.ExcelDataProvider.ExcelDataLoader;
import org.company.TestDataProvider.TestDataEntities.TestExecutorConfig;
import org.company.Utilities.TestNGHelper;
import org.testng.xml.XmlSuite.ParallelMode;

public class TestExecutor extends TestNGHelper {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		//ExcelDataController.readDataFromExcel("");
		//SQLDataController.LoadDataFromTable("", "");
		SQLDataController.LoadDataFromDatabaseHB();
		/*
		 * List<TestExecutorConfigEntity> ConfigData = new
		 * ArrayList<TestExecutorConfigEntity>(); ConfigData =
		 * (List<TestExecutorConfigEntity>)
		 * SQLDataController.LoadDataFromTable("TestExecutorConfig", "TestAutomation");
		 * System.out.println("Success");
		 */
		/*
		 * DBConfinguration obj2 = new DBConfinguration(); obj2.LoadConfiguration();
		 */

		/*
		 * List<String> SuiteNames = Arrays.asList("Regression,Smoke".split(","));
		 * List<String> TNames = Arrays.asList("Claims,Contracts".split(","));
		 * List<String> Tclasses = Arrays.asList("RestGet,RestPost".split(","));
		 * setSuiteDetails(SuiteNames, ParallelMode.FALSE); HashMap<String,
		 * List<String>> TestToAdd = new HashMap<String, List<String>>();
		 * TestToAdd.put("Regression", TNames); setTestDetails(TestToAdd);
		 * HashMap<String, List<String>> ClassesToAdd = new HashMap<String,
		 * List<String>>(); ClassesToAdd.put("Claims", Tclasses);
		 * ClassesToAdd.put("Contracts", Tclasses); setClassDetails(ClassesToAdd);
		 * generateTestNGFiles(); runtTestNgFiles();
		 */

	}

}
