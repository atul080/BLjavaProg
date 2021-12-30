package com.empwage;

import java.util.*;

public class EmployeeWageBuilder {
    public static int IS_FULL_TIME=1;
    public static int IS_PART_TIME=2;
    public static int EMP_RATE_PER_HOUR=20;
    public static final int NO_OF_WORKING_DAYS=20;
    public static void main(String[] ar) {
        System.out.println("Welcome to employee wage builder.");
        int empHours = 0;
        int empWage = 0;
        int totalWorkingDays=0;
        int totalEmployeeWage=0;
        while(totalWorkingDays<NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            Random ran = new Random();
            int empCheck = ran.nextInt(3);
            switch (empCheck) {
                case 1:
                    empHours = 8;
                    break;
                case 2:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
                    break;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.println("The daily wage of employee is: " + empWage);
            totalEmployeeWage=totalEmployeeWage+empWage;
        }
        System.out.println("The total employee wage of an employee for" +totalWorkingDays+" days is: "+ totalEmployeeWage);

    }
    }
