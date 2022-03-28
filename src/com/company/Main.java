package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //task 1
        float no1, no2, sum, sub, multiply, quotient;

        BufferedReader hm = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to my calculator where you can sum, subtract, multiply and divide two numbers");
        System.out.println("you can Choose your first number");
        no1 = Float.parseFloat(hm.readLine());
        System.out.println("you can Choose your second number");

        no2 = Float.parseFloat(hm.readLine());

        sum = no1 + no2;
        sub = no1 - no2;
        multiply = no1 * no2;
        quotient = no1 / no2;

        System.out.printf("your  two numbers is, the first was " + "%2.2f", no1);
        System.out.printf(" and the second was " + "%2.2f\n", no2);

        System.out.printf("Sum = " + "%2.2f\n", sum);
        System.out.printf("Subtraction = " + "%2.2f\n", sub);
        System.out.printf("multiply = " + "%2.2f\n", multiply);
        System.out.printf("quotient = " + "%2.2f\n\n", quotient);


//task 2
        float height, Mass, bmi;

        System.out.println("Welcome to our BMI calculator where we will know whether your weight is average or not ;)");
        System.out.println("Please enter your height");
        height = Float.parseFloat(hm.readLine()) / 100;
        System.out.println("Please enter your weight");
        Mass = Float.parseFloat(hm.readLine());

        bmi = (float) (Mass / (pow(height, 2)));
        System.out.printf("Your BMI is " + "%2.2f\n", bmi);

        if (bmi < 16.00) {
            System.out.println("Starvation\n\n");
        } else if (bmi >= 16.00 && bmi < 16.99) {
            System.out.println("Emaciation\n\n");
        } else if (bmi >= 17.00 && bmi < 18.49) {
            System.out.println("Normal, low range\n\n");
        } else if (bmi >= 18.50 && bmi < 22.99) {
            System.out.println("Normal, high range\n\n");
        } else if (bmi >= 23.00 && bmi < 27.49) {
            System.out.println("Overweight, low range\n\n");
        } else if (bmi >= 27.50 && bmi < 29.99) {
            System.out.println("Overweight, high range\n\n");
        } else if (bmi >= 30.00 && bmi < 34.9) {
            System.out.println("1st degree obesity\n\n");
        } else if (bmi >= 35.00 && bmi < 39.9) {
            System.out.println("2nd degree obesity\n\n");
        } else if (bmi >= 40.00) {
            System.out.println("3rd degree obesity\n\n");
        }


//task 3

        double coeff1, coeff2, coeff3, v1, v2, delta;
        char rootsNo = 0;

        System.out.println("This program calculates the roots of the equation Ax^2 + Bx +C = 0");
        System.out.println("Please enter value of A");
        coeff1 = Double.parseDouble(hm.readLine());

        if (coeff1 == 0) {
            System.out.println("Invalid value of A");
        } else {
            System.out.println("Please enter value of B");
            coeff2 = Double.parseDouble(hm.readLine());

            System.out.println("Please enter value of B");
            coeff3 = Double.parseDouble(hm.readLine());

            delta = pow(coeff2, 2) - 4 * coeff1 * coeff3;

            if (delta < 0) rootsNo = 0;
            if (delta == 0) rootsNo = 1;
            if (delta > 0) rootsNo = 2;

            switch (rootsNo) {
                case 0:
                    System.out.println("There are no roots\n\n");
                    break;

                case 1: {
                    v1 = -coeff2 / (2 * coeff1);
                    System.out.printf("For A = " + "%4.2f,", coeff1);
                    System.out.printf(" B = " + "%4.2f,", coeff2);
                    System.out.printf(" C = " + "%4.2f,", coeff3);
                    System.out.printf("The trinomial has one double root = ");
                    System.out.printf("%4.2f.\n\n", v1);
                    break;
                }

                case 2: {
                    v1 = (-coeff2 - sqrt(delta)) / (2 * coeff1);
                    v2 = (-coeff2 + sqrt(delta)) / (2 * coeff1);
                    System.out.printf("For A = " + "%4.2f,", coeff1);
                    System.out.printf(" B = " + "%4.2f,", coeff2);
                    System.out.printf(" C = " + "%4.2f.\n", coeff3);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f.\n", v1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f.\n\n", v2);
                    break;
                }
            }
        }


//task 4
        int add = 0;

        for (int i = 0; i < 101; i += 2) {
            add += i;
        }

        System.out.println("The sum of all even numbers from 1 - 100 = " + add + "\n\n");


//task 5
        int c = 1, rand, min = 101, max = 0;

        System.out.println("The program chooses 10 random numbers from 1 - 100 and selects the smallest and the largest numbers");

        Random rnd = new Random();
        System.out.print("Numbers choosen: ");

        while (c <= 10) {
            rand = round((rnd.nextInt(100) + 1));
            System.out.print(rand + ", ");

            if (rand < min) min = rand;
            if (rand > max) max = rand;

            c++;
        }
        System.out.println("\n" + max + " is the max");
        System.out.println(min + " is the min");
    }
}