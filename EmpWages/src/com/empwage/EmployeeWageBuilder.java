package com.empwage;

import java.util.*;

public class EmployeeWageBuilder {
    public static void main(String[] ar)
    {
        System.out.println("Welcome to employee wage builder.");
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        int empHours=0;
        int empWage=0;
        Random ran=new Random();
        int empCheck=ran.nextInt(3);
        if(empCheck==IS_FULL_TIME) {
            empHours=8;
            System.out.println("Employee is Present.");
        }
        else if(empCheck==IS_PART_TIME)
        {
            empHours=4;
            System.out.println("Employee is Absent.");
        }
        else {
            empHours=0;
            System.out.println("Employee is Absent.");
        }
        empWage=empHours*EMP_RATE_PER_HOUR;
        System.out.println("The daily wage of employee is: "+empWage);
    }

}
