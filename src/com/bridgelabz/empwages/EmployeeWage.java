package com.bridgelabz.empwages;

public class EmployeeWage {

	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		empDailyWage();
	}

	static void empDailyWage() {
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == Is_Full_Time)
			empHrs = 8;
		else if (empCheck == Is_Part_Time)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee_wage:" + empWage);
	}
}
