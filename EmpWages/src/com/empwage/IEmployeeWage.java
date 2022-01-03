/*
 * @author Atul Srivastav
 * @date 03/01/2022
 * Employee wages calculation with ArrayList to save the details.
 * Interface IEmployeeWage is implemented by EmployeeWageBilder class.
 * */
package com.empwage;
//making Interface
public interface IEmployeeWage {
    public void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth);

    public void computeEmpWage();
}