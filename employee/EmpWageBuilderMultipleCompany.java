package com.bridgrlabz.employee;

public class EmpWageBuilderMultipleCompany {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numWorkingDay, int maxHourPerMonth) {

		// VARIABLE
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDay = 0;

		// computation
		while (totalEmpHrs <= maxHourPerMonth && totalWorkingDay < numWorkingDay) {
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
		System.out.println("Total Emp Wage for company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeEmpWage("DMart", 20, 2, 10);
		computeEmpWage("Relince", 10, 4, 20);
	}

}
