package org.company.TestDataProvider.ExcelDataProvider;

import java.lang.reflect.Field;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.company.Application.Annotations.DBTable;
import org.company.BussinessLayer.BussinessObjects.TestData;
import org.company.BussinessLayer.Interfaces.ITestDataProvider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelDataLoader {

	static Fillo _excelReaderInstance= new Fillo();
	public static <T> List<T> selectQuery(Class<T> type, String query) throws SQLException {
		List<T> list = new ArrayList<T>();
		try {
			Connection data=_excelReaderInstance.getConnection("E:\\SourceCode\\testautomation-framework-common\\TestAutomation\\DataFiles\\TestData.xlsx");
			Recordset rs = data.executeQuery("Select * from TestData");
						while (rs.next()) {
							T t = type.newInstance();
							loadResultSetIntoObject(rs, t);// Point 4
							list.add(t);
						}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
				
	}

	
	private static void loadResultSetIntoObject(Recordset rs, Object object)
			throws IllegalArgumentException,FilloException, IllegalAccessException, SQLException {
		Class<?> zclass = object.getClass();
		for (Field field : zclass.getDeclaredFields()) {
			field.setAccessible(true);
			DBTable column = field.getAnnotation(DBTable.class);
			Object value = rs.getField(column.columnName());
			Class<?> type = field.getType();
			if (value instanceof Integer)
			{
				type=Integer.class;
			}
			if (isPrimitive(type)) {// check primitive type(Point 5)
				Class<?> boxed = boxPrimitiveClass(type);// box if primitive(Point 6)
				value = boxed.cast(value);
			}
			field.set(object, value);
		}
	}

	private static boolean isPrimitive(Class<?> type) {
		return (type == int.class || type == long.class || type == double.class || type == float.class
				|| type == boolean.class || type == byte.class || type == char.class || type == short.class);
	}

	private static Class<?> boxPrimitiveClass(Class<?> type) {
		if (type == int.class) {
			return Integer.class;
		} else if (type == long.class) {
			return Long.class;
		} else if (type == double.class) {
			return Double.class;
		} else if (type == float.class) {
			return Float.class;
		} else if (type == boolean.class) {
			return Boolean.class;
		} else if (type == byte.class) {
			return Byte.class;
		} else if (type == char.class) {
			return Character.class;
		} else if (type == short.class) {
			return Short.class;
		} else {
			String string = "class '" + type.getName() + "' is not a primitive";
			throw new IllegalArgumentException(string);
		}
	}
}
