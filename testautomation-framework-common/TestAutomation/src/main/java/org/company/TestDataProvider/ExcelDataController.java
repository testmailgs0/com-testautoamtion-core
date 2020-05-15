package org.company.TestDataProvider;

import java.sql.ResultSet;
import java.util.List;

import org.company.BussinessLayer.BussinessObjects.TestData;
import org.company.BussinessLayer.Interfaces.ITestDataProvider;
import org.company.TestDataProvider.ExcelDataProvider.ExcelDataLoader;
import org.company.TestDataProvider.SQLDataProvider.SQLDataLoader;
import org.company.TestDataProvider.TestDataEntities.TestExecutorConfig;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelDataController {
	Fillo _excelReaderInstance= new Fillo();
	
	public static void readDataFromExcel(String FilePath)
	{
		try {
			List<TestExecutorConfig> ConfigData =ExcelDataLoader.selectQuery(TestExecutorConfig.class, "Select * From TestExecutorConfig");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
