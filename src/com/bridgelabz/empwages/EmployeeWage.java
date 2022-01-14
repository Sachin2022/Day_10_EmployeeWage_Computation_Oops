package com.bridgelabz.empwages;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWage implements IComputeEmployeeWage {

	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static List<CompanyEmpWage> ListOfEmpWageBuilder = new ArrayList<>();

	@Override
	public void addCompanyEmpWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {

		CompanyEmpWage empWageBuilder = new CompanyEmpWage(companyName, empRatePerHr, noOfWorkingDays, maxHrsPerMonth);
		ListOfEmpWageBuilder.add(empWageBuilder);

	}

	@Override
	public void computeEmpWage() {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		for (int i = 0; i <= ListOfEmpWageBuilder.size() - 1; i++) {
			CompanyEmpWage comapany = ListOfEmpWageBuilder.get(i);
			int empRatePerHour = comapany.getEmpRatePerHr();
			while (totalEmpHrs <= comapany.getMaxHrsPerMonth() && totalWorkingDays < comapany.getNoOfWorkingDays()) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case Is_Full_Time:
					empHrs = 8;
					break;
				case Is_Part_Time:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
				}
				totalEmpHrs += empHrs;

			}

			totalEmpWage = totalEmpHrs * empRatePerHour;
			comapany.setTotalWage(totalEmpWage);
			System.out.println("company name :" + comapany.getCompanyName() + "	  No of Working Days :"
					+ comapany.getNoOfWorkingDays() + "	  Maximun hours per month :" + comapany.getMaxHrsPerMonth()
					+ "	   Total Wages :" + comapany.getTotalWage());

		}

	}

	public static void main(String[] args) {

		System.out.println("manage Wage of multiple companies using Interface approach");
		IComputeEmployeeWage EmpWageBuilder = new EmployeeWage();
		EmpWageBuilder.addCompanyEmpWage("Dmart", 20, 6, 130);
		EmpWageBuilder.addCompanyEmpWage("JIO", 27, 16, 120);
		EmpWageBuilder.addCompanyEmpWage("Airtel", 27, 16, 140);
		EmpWageBuilder.computeEmpWage();

	}
}
