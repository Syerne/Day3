package com.bridgelabz.day3;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");

        int randomNum = (int) ( Math.random()*10 % 2);
        System.out.println("RandomNumGenerate: " + randomNum);

        if(randomNum == 1){
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
