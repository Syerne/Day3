package com.bridgelabz.day3;

public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");

        int wagePerHour = 20, fullDay = 1, empWage = 0, empHours = 0, partTime =2;


        int randomNum = (int) (Math.random() * 10 % 3);
        System.out.println("RandomNumGenerate: " + randomNum);

        if (randomNum == fullDay) {
            empHours = 8;
        } else if(randomNum == partTime){
            empHours = 4;
        }else {
            empHours=0;
        }
        empWage = (wagePerHour * empHours);
        System.out.println("Employee Wages is: " + empWage);
    }
}
