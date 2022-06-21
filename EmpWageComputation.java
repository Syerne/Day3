package com.bridgelabz.day3;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");
        
            int wagePerHrs = 20, totalEmpWage=0, maxWorkingHrsInMonth=100, maxWorkingDays = 20;
            int empWorkingHours=0, totalEmpWorkingHours=0, empWage=0, totalWorkingDay=0;

            while(totalEmpWorkingHours <= maxWorkingHrsInMonth && totalWorkingDay < maxWorkingDays ) {
                totalWorkingDay++;
                int randomNum = (int) (Math.random() * 10 % 3);

                switch (randomNum) {
                    case 1:
                        System.out.println("Employee is full time");
                        empWorkingHours = 8;
                        break;
                    case 2:
                        System.out.println("Employee is part time");
                        empWorkingHours = 4;
                        break;
                    default:
                        System.out.println("Employee is absent");
                        empWorkingHours = 0;
                        break;
                }
                totalEmpWorkingHours += empWorkingHours;
                empWage = (empWorkingHours * wagePerHrs);
                totalEmpWage += empWage;
                System.out.println("Emp Wage: " + empWage);
            }
        System.out.println("total days: " + totalWorkingDay);
        System.out.println("Total Employee Working Hrs: " + totalEmpWorkingHours);
        System.out.println("Total Employee Wage: " + totalEmpWage);
        }
    }

