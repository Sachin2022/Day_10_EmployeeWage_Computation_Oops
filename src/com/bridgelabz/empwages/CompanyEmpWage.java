package com.bridgelabz.empwages;

public class CompanyEmpWage {
	private String companyName;
	private int empRatePerHr;
	private int noOfWorkingDays;
	private int maxHrsPerMonth;
	private int totalWage;

	public CompanyEmpWage() {

	}

	public CompanyEmpWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
		this.companyName = companyName;
		this.empRatePerHr = empRatePerHr;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmpRatePerHr() {
		return empRatePerHr;
	}

	public void setEmpRatePerHr(int empRatePerHr) {
		this.empRatePerHr = empRatePerHr;
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getMaxHrsPerMonth() {
		return maxHrsPerMonth;
	}

	public void setMaxHrsPerMonth(int maxHrsPerMonth) {
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

}
