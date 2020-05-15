package org.company.TestDataProvider;

import java.sql.SQLException;
import java.util.List;

import org.company.TestDataProvider.TestDataEntities.TestExecutorConfig;
import org.company.TestDataProvider.SQLDataProvider.HibernateConfigLoader;
import org.company.TestDataProvider.SQLDataProvider.SQLDataLoader;

public class SQLDataController {
	public static List<?> LoadDataFromTable(String TableName, String DBName) {
		try {
			List<TestExecutorConfig> ConfigData =SQLDataLoader.selectQuery(TestExecutorConfig.class, "Select * From TestExecutorConfig");
			return ConfigData;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		

	}
 
	public static void LoadDataFromDatabaseHB()
	{
		try {
			HibernateConfigLoader.LoadConfiguration();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
