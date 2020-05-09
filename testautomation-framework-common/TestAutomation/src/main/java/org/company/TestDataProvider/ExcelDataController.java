package org.company.TestDataProvider;

import java.sql.ResultSet;

import org.company.BussinessLayer.BussinessObjects.TestData;
import org.company.BussinessLayer.Interfaces.ITestDataProvider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelDataController {
	Fillo _excelReaderInstance= new Fillo();
	
	public void readDataFromExcel(String FilePath)
	{
		try {
			ITestDataProvider _testData= new TestData();
			Connection data=_excelReaderInstance.getConnection(FilePath);
			Recordset rs = data.executeQuery("Select * from TestCases");
			
			
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
