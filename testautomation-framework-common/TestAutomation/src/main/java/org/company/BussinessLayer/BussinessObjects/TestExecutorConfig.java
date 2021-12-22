package org.company.BussinessLayer.BussinessObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.company.Application.Annotations.ExcelSheet;

@Entity
public class TestExecutorConfig {

	@Id
	@ExcelSheet(ExcelColumn = "SID")
	public String SID;
	@ExcelSheet(ExcelColumn = "Suite_Name")
	public String Suite_Name;
	@ExcelSheet(ExcelColumn = "Scenario_Name")
	public String Scenario_Name;
	@ExcelSheet(ExcelColumn = "Parallel_Execution")
	public String Parallel_Execution;
	@ExcelSheet(ExcelColumn = "Exec_GroupID")
	public String Exec_GroupID;

	public String getSID() {
		return SID;
	}

	public void setSID(String sID) {
		SID = sID;
	}

	public String getSuite_Name() {
		return Suite_Name;
	}

	public void setSuite_Name(String suite_Name) {
		Suite_Name = suite_Name;
	}

	public String getScenario_Name() {
		return Scenario_Name;
	}

	public void setScenario_Name(String scenario_Name) {
		Scenario_Name = scenario_Name;
	}

	public String isParallel_Execution() {
		return Parallel_Execution;
	}

	public void setParallel_Execution(String parallel_Execution) {
		Parallel_Execution = parallel_Execution;
	}

	public String getExec_GroupID() {
		return Exec_GroupID;
	}

	public void setExec_GroupID(String exec_GroupID) {
		Exec_GroupID = exec_GroupID;
	}

}
