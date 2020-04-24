package org.company.testexecutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.company.bussinesslayer.Controls.Login;
import org.company.utilities.TestNGHelper;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;
import org.yaml.snakeyaml.reader.UnicodeReader;

public class TestExecutor extends TestNGHelper {
	public static void main(String[] args)
	{
		List<String> SuiteNames = Arrays.asList("Regression,Smoke".split(","));
		List<String> TNames = Arrays.asList("Claims,Contracts".split(","));
		List<String> Tclasses = Arrays.asList("Login,ServiceDate".split(","));
		setSuiteDetails(SuiteNames,ParallelMode.FALSE);
		HashMap<String,List<String>> TestToAdd = new HashMap<String,List<String>>();
		TestToAdd.put("Regression", TNames);
		setTestDetails(TestToAdd);
		HashMap<String,List<String>> ClassesToAdd = new HashMap<String,List<String>>();
		ClassesToAdd.put("Claims",Tclasses);
		//ClassesToAdd.put("Contracts",Tclasses);
		setClassDetails(ClassesToAdd);
		generateTestNGFiles();
		runtTestNgFiles();
	}

}
