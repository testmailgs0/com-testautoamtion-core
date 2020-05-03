package org.company.testdataprovider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelDataReader {
	Fillo _excelReaderInstance= new Fillo();
	
	public void readDataFromExcel(String FilePath)
	{
		try {
			Connection data=_excelReaderInstance.getConnection(FilePath);
			Recordset rs = data.executeQuery("Select * from TestCases");
			
			
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
