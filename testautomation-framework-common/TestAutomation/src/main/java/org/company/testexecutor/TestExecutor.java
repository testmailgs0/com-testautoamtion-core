package org.company.testexecutor;

import org.company.databaselayer.Configurations.DBConfinguration;
import org.company.utilities.TestNGHelper;

public class TestExecutor extends TestNGHelper {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		DBConfinguration obj2 = new DBConfinguration();
		obj2.LoadConfiguration();

		/*
		 * List<String> SuiteNames = Arrays.asList("Regression,Smoke".split(","));
		 * List<String> TNames = Arrays.asList("Claims,Contracts".split(","));
		 * List<String> Tclasses = Arrays.asList("Login,ServiceDate".split(","));
		 * setSuiteDetails(SuiteNames,ParallelMode.FALSE);
		 * HashMap<String,List<String>>TestToAdd = new HashMap<String,List<String>>();
		 * TestToAdd.put("Regression",TNames); setTestDetails(TestToAdd);
		 * HashMap<String,List<String>> ClassesToAdd= new
		 * HashMap<String,List<String>>(); ClassesToAdd.put("Claims",Tclasses);
		 * ClassesToAdd.put("Contracts",Tclasses); setClassDetails(ClassesToAdd);
		 * generateTestNGFiles(); runtTestNgFiles();
		 */

	}

}
