package com.bridgelabz.empwages;

public interface IComputeEmployeeWage {
	public void addCompanyEmpWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
	public void computeEmpWage();


}
