package com.mzamandvlpr;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args)
    {
        Scanner input= new Scanner((System.in));
        System.out.println("Enter your number");
        int number= input.nextInt();
        if((number>=90 ) && (number<=100))
        {
            System.out.println("You got A+ " + "and Your Marks is: " + number);
        }

        else if((number>=85) && (number<=89))
        {
            System.out.println("You got A " + "and Your Marks is: " + number);
        }
        else if((number>=80) && (number<=84))
        {
            System.out.println("You got B+ " + "and Your Marks is: " + number);
        }
        else if((number>=75) && (number<=79))
        {
            System.out.println("You got C+ " + "and Your Marks is: " + number);
        }
        else if((number>=70) && (number<=74))
        {
            System.out.println("You got C " + "and Your Marks is: " + number);
        }
        else if((number>=65) && (number<=69))
        {
            System.out.println("You got D+ " + "and Your Marks is: " + number);
        }

        else if((number>=60) && (number<=64))
        {
            System.out.println("You got D " + "and Your Marks is: " + number);
        }
        else if((number>=55) && (number<=59))
        {
            System.out.println("You got D- " + "and Your Marks is: " + number);
        }
        else
        {
            System.out.println("You got F " + "and Your Marks is: " + number);
        }
    }
}