package org.company.Application.Constants;

public class ExcelConstants {
	private static String TCMPath="E:\\\\SourceCode\\\\testautomation-framework-common\\\\TestAutomation\\\\DataFiles\\\\TCM.xlsx";
	public static String TDMPath="E:\\\\\\\\SourceCode\\\\\\\\testautomation-framework-common\\\\\\\\TestAutomation\\\\\\\\DataFiles\\\\\\\\TDM.xlsx";
	public static String ORMPath="E:\\\\\\\\\\\\\\\\SourceCode\\\\\\\\\\\\\\\\testautomation-framework-common\\\\\\\\\\\\\\\\TestAutomation\\\\\\\\\\\\\\\\DataFiles\\\\\\\\\\\\\\\\ORM.xlsx";
	
	public static String getTCMPath() {
		return TCMPath;
	}
	public static void setTCMPath(String tCMPath) {
		TCMPath = tCMPath;
	}
	public static String getTDMPath() {
		return TDMPath;
	}
	public static void setTDMPath(String tDMPath) {
		TDMPath = tDMPath;
	}
	public static String getORMPath() {
		return ORMPath;
	}
	public static void setORMPath(String oRMPath) {
		ORMPath = oRMPath;
	}
}
