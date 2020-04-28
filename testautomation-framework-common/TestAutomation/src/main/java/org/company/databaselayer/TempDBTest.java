
package org.company.databaselayer;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;

public class TempDBTest {

	public void ConnectToDB() {
		ResultSet rs;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// "jdbc:sqlserver://localhost\\sqlexpress"
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://VAIO;DatabaseName=TestAutomation;user=sa;password=1234;");
			// .getConnection("jdbc:sqlserver://VAIO;user=sa;password=1234;database=TestAutomation");
			System.out.println("test");
			Statement sta = conn.createStatement();
			String Sql = "select * from temp";
			rs = sta.executeQuery(Sql);
			//System.out.println(rs.getInt(0));
		} catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catchblock
			e.printStackTrace();
		}

	}
}
