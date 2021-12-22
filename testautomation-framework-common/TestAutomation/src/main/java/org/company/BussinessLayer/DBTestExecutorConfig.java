package org.company.BussinessLayer;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.company.Application.Annotations.DBTable;

@Entity
public class DBTestExecutorConfig {

	@Id
	@DBTable(columnName = "SID")
	public int SID;
	@DBTable(columnName = "Suite_Name")
	public String Suite_Name;
	@DBTable(columnName = "Scenario_Name")
	public String Scenario_Name;
	@DBTable(columnName = "TestCases")
	public String TestCases;
	@DBTable(columnName = "Parallel_Execution")
	public boolean Parallel_Execution;
	@DBTable(columnName = "Exec_GroupID")
	public int Exec_GroupID;

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
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

	public String getTestCases() {
		return TestCases;
	}

	public void setTestCases(String testCases) {
		TestCases = testCases;
	}

	public boolean isParallel_Execution() {
		return Parallel_Execution;
	}

	public void setParallel_Execution(boolean parallel_Execution) {
		Parallel_Execution = parallel_Execution;
	}

	public int getExec_GroupID() {
		return Exec_GroupID;
	}

	public void setExec_GroupID(int exec_GroupID) {
		Exec_GroupID = exec_GroupID;
	}

}
