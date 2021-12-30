package com.empwage;

import java.util.*;

public class EmployeeWageBuilder {
    static int IS_FULL_TIME=1;
    static int IS_PART_TIME=2;
    static int EMP_RATE_PER_HOUR=20;
    public static void main(String[] ar) {
        System.out.println("Welcome to employee wage builder.");
        int empHours = 0;
        int empWage = 0;
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
    }
}
