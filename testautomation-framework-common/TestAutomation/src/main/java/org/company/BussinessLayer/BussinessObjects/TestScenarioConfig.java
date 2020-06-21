package org.company.BussinessLayer.BussinessObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.company.Application.Annotations.ExcelSheet;

@Entity
public class TestScenarioConfig {

	@Id
	@ExcelSheet(ExcelColumn = "ScenarioID")
	public String ScenarioID;
	@ExcelSheet(ExcelColumn = "Description")
	public String Description;
	@ExcelSheet(ExcelColumn = "TestCases")
	public String TestCases;

	public String getScenarioID() {
		return ScenarioID;
	}

	public void setScenarioID(String scenarioID) {
		ScenarioID = scenarioID;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTestCases() {
		return TestCases;
	}

	public void setTestCases(String testCases) {
		TestCases = testCases;
	}

}
