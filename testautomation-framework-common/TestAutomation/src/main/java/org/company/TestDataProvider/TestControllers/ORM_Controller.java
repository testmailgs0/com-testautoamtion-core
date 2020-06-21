package org.company.TestDataProvider.TestControllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.company.Application.Constants.ExcelConstants;
import org.company.BussinessLayer.BussinessObjects.*;
import org.company.TestDataProvider.ExcelDataLoader;

public class ORM_Controller {
	public static List<ORM> getConfigData(String API_Name,List<String> ConfigRefs) {
		try {
			List<ORM> allScenarios = new ArrayList<ORM>();
			for (String ConfigName : ConfigRefs) {
				allScenarios.addAll((List<ORM>) ExcelDataLoader.selectQuery(ORM.class,
						"Select * from "+API_Name+" Where Endpoint =" + "'" + ConfigName + "'",
						ExcelConstants.getORMPath()));
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
