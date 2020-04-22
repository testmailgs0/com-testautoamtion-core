package org.company.testexecutor;

import java.util.ArrayList;
import java.util.List;

import org.company.bussinesslayer.Controls.Login;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.xml.*;

public class TestRunner {
	
	/*
	 * public static void main(String[] args) { System.out.println("start");
	 * createSuites(); // TODO Auto-generated method stub
	 * 
	 * }
	 */

	public static void createSuites() {
		
		// suite
		XmlSuite suite = new XmlSuite();
		suite.setName("Dynamic Test");
		suite.setParallel("false");
		suite.setVerbose(1);
		// test
		XmlTest test = new XmlTest(suite);
		test.setName("Test1");
		test.setPreserveOrder(true);
		// class handling
		XmlClass testClass = new XmlClass(Login.class);
		List<XmlClass> grpClass = new ArrayList<XmlClass>();
		grpClass.add(testClass);
		test.setXmlClasses(grpClass);
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		// obj.set
		TestNG obj = new TestNG();
		
		obj.setXmlSuites(suites);
		obj.run();

	}

	public static void createTest() {

	}
}
