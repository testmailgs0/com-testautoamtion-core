package org.company.TestDataProvider;

import java.sql.SQLException;
import java.util.List;

import org.company.TestDataProvider.TestDataEntities.TestExecutorConfigEntity;
import org.company.TestDataProvider.SQLDataProvider.SQLDataLoader;

public class SQLDataController {
	public static List<?> LoadDataFromTable(String TableName, String DBName) {
		try {
			List<TestExecutorConfigEntity> ConfigData =SQLDataLoader.selectQuery(TestExecutorConfigEntity.class, "Select * From TestExecutorConfig");
			return ConfigData;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		

	}
}
