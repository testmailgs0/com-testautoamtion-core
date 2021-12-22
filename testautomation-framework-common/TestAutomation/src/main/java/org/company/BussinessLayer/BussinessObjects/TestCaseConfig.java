package org.company.BussinessLayer.BussinessObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.company.Application.Annotations.ExcelSheet;

@Entity
public class TestCaseConfig {

	@Id
	@ExcelSheet(ExcelColumn = "TCID")
	public String TCID;
	@ExcelSheet(ExcelColumn = "TCName")
	public String TCName;
	@ExcelSheet(ExcelColumn = "Description")
	public String Description;
	@ExcelSheet(ExcelColumn = "Action")
	public String Action;
	public String getAPI_Name() {
		return API_Name;
	}

	public void setAPI_Name(String aPI_Name) {
		API_Name = aPI_Name;
	}

	public String getEndpoint() {
		return Endpoint;
	}

	public void setEndpoint(String endpoint) {
		Endpoint = endpoint;
	}

	@ExcelSheet(ExcelColumn = "API_Name")
	public String API_Name;
	@ExcelSheet(ExcelColumn = "Endpoint")
	public String Endpoint;
	@ExcelSheet(ExcelColumn = "TestDataRef")
	public String TestDataRef;

	public String getTCID() {
		return TCID;
	}

	public void setTCID(String tCID) {
		TCID = tCID;
	}

	public String getTCName() {
		return TCName;
	}

	public void setTCName(String tCName) {
		TCName = tCName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}


	public String getTestDataRef() {
		return TestDataRef;
	}

	public void setTestDataRef(String testDataRef) {
		TestDataRef = testDataRef;
	}

}
