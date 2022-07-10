package com.bridgrlabz.employee;

public class EmpolyeeWage {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int noOfWorkingDay = 20;
	public static final int maxHrsInMonth = 100;

	public static int computeEmpWage() {

		// VARIABLE
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDay = 0;

		// computation
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDay < noOfWorkingDay) {
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isPartTime:
				empHrs = 4;
				break;
			case isFullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;

			System.out.println("Day#: " + totalWorkingDay + " EmpHrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeEmpWage();
	}

}
