package com.bridgelabz.day3;

public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");

        int wagePerHour = 20, fullDay = 1, empWage = 0, empWorkingHours = 0, partTime =2, workingDayMonth=20;

        for(int i = 1; i <= workingDayMonth; i++) {
            int randomNum = (int) (Math.random() * 10 % 3);

        switch (randomNum){
            case 1:
                System.out.println("Employee is full time");
                empWorkingHours=8;
                break;
            case 2:
                System.out.println("Employee is part time");
                empWorkingHours = 4;
                break;
            default:
                System.out.println("Employee is absent");
                empWorkingHours=0;
                break;
        }
}

        empWage = (wagePerHour * empWorkingHours * workingDayMonth);
        System.out.println("Employee Wages is: " + empWage);
    }
}
