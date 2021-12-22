package org.company.TestDataProvider.TestControllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.company.Application.Constants.ExcelConstants;
import org.company.BussinessLayer.BussinessObjects.TDM;
import org.company.TestDataProvider.ExcelDataLoader;

public class TDM_Controller {

	public static List<TDM> getTestData(String API_Name,List<String> TestDataIds) {
		try {
			List<TDM> allScenarios = new ArrayList<TDM>();
			for (String TestDataID : TestDataIds) {
				allScenarios.addAll((List<TDM>) ExcelDataLoader.selectQuery(TDM.class,
						"Select * from "+API_Name+" Where TestDataID=" + "'" + TestDataID + "'",
						ExcelConstants.getTDMPath()));
			}
			return allScenarios;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// TODO Auto-generated method stub
	}
}
