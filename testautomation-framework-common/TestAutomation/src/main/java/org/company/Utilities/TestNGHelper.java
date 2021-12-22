package org.company.Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.testng.TestNG;
import org.testng.xml.*;
import org.testng.xml.XmlSuite.ParallelMode;

public class TestNGHelper {
	// Members
	private static XmlClass TestClass;
	private static XmlTest Test;
	private static XmlSuite Suite;
	private static TestNG _testNGInstance;
	private static List<XmlClass> testClasses = new ArrayList<XmlClass>();
	private static List<XmlTest> testList = new ArrayList<XmlTest>();
	private static List<XmlSuite> testSuiteList = new ArrayList<XmlSuite>();

	//Constructor
	public TestNGHelper()
	{
		testSuiteList.clear();
		testList.clear();
	}
	// Member Functions
	protected static void setSuiteDetails(List<String> SuiteName, ParallelMode Mode) {
		try {
			for (String suite : SuiteName) {
				Suite = new XmlSuite();
				Suite.setName(suite);
				Suite.setParallel(Mode);
				Suite.setAllowReturnValues(true);
				testSuiteList.add(Suite);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected static void setClassDetails(Map<String, List<String>> ClassDetails) {
		try {
			for (String testName : ClassDetails.keySet()) {
				for (XmlTest test : testList) {
					if (test.getName().equalsIgnoreCase(testName)) {
						for (String tClass : ClassDetails.get(testName)) {
							TestClass = new XmlClass("org.company.BussinessLayer.Controls." + tClass);
							testClasses.add(TestClass);
						}
						testList.get(testList.indexOf(test)).setXmlClasses(testClasses);
					}

				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected static void setTestDetails(Map<String, List<String>> TestList) {
		try {
			for (XmlSuite tempSuite : testSuiteList) {
				for (String key : TestList.keySet()) {
					if (tempSuite.getName().equals(key)) {
						for (String testName : TestList.get(key)) {
							Test = new XmlTest(tempSuite);
							Test.setName(testName);
							testList.add(Test);
						}
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected static void createTestNGFile(XmlSuite mSuite) {
		FileWriter writer;
		try {
			writer = new FileWriter(new File("TestNGSuiteFiles\\" + mSuite.getName() + ".xml"));
			writer.write(mSuite.toXml());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected static void generateTestNGFiles() {
		try {
			for (XmlSuite suite : testSuiteList) {
				//System.out.println(testSuiteList.get(0).getTests().size());
				createTestNGFile(suite);
				suite.setFileName("TestNGSuiteFiles\\" + suite.getName() + ".xml");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected static void runtTestNgFiles() {
		try {
			_testNGInstance = new TestNG();
			_testNGInstance.setXmlSuites(testSuiteList);
			_testNGInstance.setThreadCount(3);
			_testNGInstance.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected static void CreateSuite(String SuiteName, ParallelMode Mode) {
		try {
			Suite = new XmlSuite();
			Suite.setName(SuiteName);
			Suite.setParallel(Mode);
			Suite.setAllowReturnValues(true);
			testSuiteList.add(Suite);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected static void CreateTest(String SuiteName, String TestName) {
		try {
			for (XmlSuite tempSuite : testSuiteList) {
				if (tempSuite.getName().equalsIgnoreCase(SuiteName)) {
					XmlTest Test = new XmlTest(testSuiteList.get(testSuiteList.indexOf(tempSuite)));
					Test.setName(TestName);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected static void CreateClasses(String SuiteName, String TestName, String TClass,
			Map<String, String> Parameters) {
		try {
			for (XmlSuite tempSuite : testSuiteList) {
				if (tempSuite.getName().equalsIgnoreCase(SuiteName)) {
					for (XmlTest Test : tempSuite.getTests()) {
						if (Test.getName().equalsIgnoreCase(TestName)) {
							List<XmlClass> TestClasses = new ArrayList<XmlClass>();
							XmlClass TestClass = new XmlClass("org.company.BussinessLayer.Controls." + TClass);
							TestClass.setParameters(Parameters);
							TestClasses.add(TestClass);
							testList=testSuiteList.get(testSuiteList.indexOf(tempSuite)).getTests();
							testSuiteList.get(testSuiteList.indexOf(tempSuite)).getTests()
									.get(testList.indexOf(Test))
									.setXmlClasses(TestClasses);
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
