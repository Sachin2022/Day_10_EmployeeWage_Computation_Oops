package com.bridgelabz.empwages;

import java.util.HashMap;
import java.util.Map;

public class EmployeeWage {

	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static Map<String, Integer> companyInfoMap = new HashMap<String, Integer>();

	public static int computeEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
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

		int totalEmpWage = totalEmpHrs * empRatePerHour;
		companyInfoMap.put(company, totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeEmpWage("JIO", 40, 21, 120);
		computeEmpWage("Wipro", 50, 24, 140);
		System.out.println("Company Name And Total Wages:" + companyInfoMap);
	}
}
