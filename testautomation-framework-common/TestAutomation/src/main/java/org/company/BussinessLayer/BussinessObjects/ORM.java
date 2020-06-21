package org.company.BussinessLayer.BussinessObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.company.Application.Annotations.ExcelSheet;

@Entity
public class ORM {

	@Id
	@ExcelSheet(ExcelColumn = "Api_ID")
	public String Api_ID;
	@ExcelSheet(ExcelColumn = "Endpoint")
	public String Endpoint;
	@ExcelSheet(ExcelColumn = "URL")
	public String URL;
	@ExcelSheet(ExcelColumn = "Parameters")
	public String Parameters;

	public String getApp_ID() {
		return Api_ID;
	}

	public void setApp_ID(String app_ID) {
		Api_ID = app_ID;
	}

	public String getEndpoint() {
		return Endpoint;
	}

	public void setEndpoint(String endpoint) {
		Endpoint = endpoint;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getParameters() {
		return Parameters;
	}

	public void setParameters(String parameters) {
		Parameters = parameters;
	}
}
