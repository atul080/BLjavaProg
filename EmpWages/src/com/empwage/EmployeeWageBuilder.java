package com.empwage;

import java.util.*;

public class EmployeeWageBuilder {
    public static void main(String[] ar)
    {
        System.out.println("Welcome to employee wage builder.");
        int IS_PRESENT=1;
        Random ran=new Random();
        int empCheck=ran.nextInt(2);
        if(empCheck==IS_PRESENT)
            System.out.println("Employee is Present.");
        else
            System.out.println("Employee is Absent.");
    }

}
