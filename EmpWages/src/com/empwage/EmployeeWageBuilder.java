/*
 * @author Atul Srivastav
 * @date 03/01/2022
 * Employee wages calculation with ArrayList to save the details.
 * */
package com.empwage;

import java.util.ArrayList;
import java.util.Random;

//classEmployeeWagesBuilder is implementing INTERFACE IEmployeeWage
public class EmployeeWageBuilder implements IEmployeeWage
	{
		// Declaring a constant
		public static final int IS_FULLTIME = 1;
		public static final int IS_PARTTIME = 2;
		private int numOfCompany = 0;
		private ArrayList<CompanyInfo> companyInfoArray;
		
		//declaring size of the arraylist using constructor.
		public EmployeeWageBuilder()
		{
			companyInfoArray = new ArrayList<CompanyInfo>(6);
		}

		/*addCompanyInfo method to add new company details into the arraylist.
		 * @param String,Int,Int,Int,Int
		 * @return void
		 */
		public void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) 
		{
			CompanyInfo newComp = new CompanyInfo(companyName, empRatePerHour, noOfWorkingDays, maxHoursPerMonth);
			companyInfoArray.add(newComp);
			numOfCompany++;
		}
		
		/*
		 * computeEmpWage method to compute wages for each company.
		 * itterating over arraylist and calculating wages for each company by calling the computeWage method.
		 */
		public void computeEmpWage() 
		{
			for (int i = 0; i < numOfCompany; i++) 
			{
				companyInfoArray.get(i).setTotalEmpWage(this.computeWage(companyInfoArray.get(i))); // inside bracket return totalEmpWage
				System.out.println(companyInfoArray.get(i));
			}
		}
		/*
		*	We have used static method here so that we can directly call it inside main
		*	@param CompanyInfo object
		*	@return INT
		*/
		public static int computeWage(CompanyInfo companyInfo) 
		{
			// Declaring the variables
			int empHrs = 0;
			int empWage = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;
			int totalWage = 0;
			String dailyWage="";
			/*
			* Using random method to generate random numbers 0, 1 and 2
			* Calculating wages.
			*/
			while (totalEmpHrs <= companyInfo.getMaxHoursPerMonth() && totalWorkingDays < companyInfo.getNoOfWorkingDays()) 
			{
				totalWorkingDays++;
				Random random = new Random();
				int empCheck = random.nextInt(3);
				switch (empCheck) 
				{
					case IS_FULLTIME: // FullTime Employee
										empHrs = 8;
										break;
					case IS_PARTTIME: // PartTime Employee
										empHrs = 4;
										break;
					default: // Employee is absent
										empHrs = 0;
				}
				empWage = companyInfo.getEmpRatePerHour() * empHrs;
				dailyWage=dailyWage+empWage+", ";
				companyInfo.setDailyWage(dailyWage);
				totalEmpHrs += empHrs;
			}
			totalWage = totalEmpHrs * companyInfo.getEmpRatePerHour();
			return totalWage;
		}
		/* main method
		 * Making Object of EmployeeWageBuilder class and passing Company info as parameters in addCompanyInfo method
		 * Adding companies informations.
		 */
		public static void main(String[] args) 
		{
			System.out.println("Welcome To Employee Wage Computation Program");
			IEmployeeWage employeeWageBuilder = new EmployeeWageBuilder();
			((EmployeeWageBuilder) employeeWageBuilder).addCompanyInfo("Infosys", 150, 2, 10);
			((EmployeeWageBuilder) employeeWageBuilder).addCompanyInfo("TCS" , 200, 3, 10);
			((EmployeeWageBuilder) employeeWageBuilder).addCompanyInfo("Accenture", 100, 4, 12);
			((EmployeeWageBuilder) employeeWageBuilder).addCompanyInfo("Jio", 180, 3, 15);
			((EmployeeWageBuilder) employeeWageBuilder).addCompanyInfo("Airtel", 160, 4, 14);
			((EmployeeWageBuilder) employeeWageBuilder).computeEmpWage();
		}
	}