package com.bridgelabz;

public class EmployeeWage {

    //final variable is mandatory to initialize
    // The value of final variable cannot be changed.
    static final int EMPLOYEE_PRESENT = 1;
    // Class, Interface , Enum => Pascal case => eg. EmployeeWage
    // variables, methods => Camel case => eg. instanceVar1, getDetails().
    // constants => Upper case with underscores  => eg. IS_EMPLOYEE_PRESENT

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
//        int employeePresent = Math.random();
//        double randomVal = Math.random();
//        double floorVal = Math.floor(randomVal*10);
//        System.out.println(randomVal);
//        System.out.println(floorVal);
//        double finalVal = floorVal % 2;
//        System.out.println(finalVal);
//        int employeePresent = (int) finalVal; // 5.3345/2
//        System.out.println(employeePresent);
        int employeePresent = (int)Math.floor(Math.random()*10)%2;
//        EMPLOYEE_PRESENT = 20;
        if(employeePresent == EMPLOYEE_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
