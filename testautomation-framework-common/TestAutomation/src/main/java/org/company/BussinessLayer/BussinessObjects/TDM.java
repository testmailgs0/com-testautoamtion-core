package org.company.BussinessLayer.BussinessObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.company.Application.Annotations.ExcelSheet;

@Entity
public class TDM {

	@Id
	@ExcelSheet(ExcelColumn = "TestDataID")
	public String TestDataID;
	@ExcelSheet(ExcelColumn = "Endpoint")
	public String Endpoint;
	@ExcelSheet(ExcelColumn = "Parameters")
	public String Parameters;
	@ExcelSheet(ExcelColumn = "Headers")
	public String Headers;

	public String getTestDataID() {
		return TestDataID;
	}

	public void setTestDataID(String testDataID) {
		TestDataID = testDataID;
	}

	public String getConfigRef() {
		return Endpoint;
	}

	public void setConfigRef(String endPoint) {
		Endpoint = endPoint;
	}

	public String getParameters() {
		return Parameters;
	}

	public void setParameters(String parameters) {
		Parameters = parameters;
	}

	public String getHeaders() {
		return Headers;
	}

	public void setHeaders(String headers) {
		Headers = headers;
	}

}
