package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double[] array1 = new double[10];

        double sum = 0;
        double avg = sum / array1.length;
        System.out.println("Enter values:");
        {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = key.nextInt();
            }

            for (int i = 0; i < array1.length; i++) {
                sum = sum + array1[i];
            }

            System.out.println("The total of the ten entries is " + sum);

        }

        avg = sum / array1.length;
        System.out.println("The average of the ten entries is " + avg);
    }
}

