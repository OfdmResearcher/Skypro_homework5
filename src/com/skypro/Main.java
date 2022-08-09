package com.skypro;

public class Main {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int[] intArray = {1,2,3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        char[] charArray = {'a', 'b', 'c'};
        System.out.println("----------------------------");

        //Task 2
        System.out.println("Task 2");
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i] + " ");
            } else {
                System.out.print(intArray[i] + ",");
            }
        }
        for (int j = 0; j < doubleArray.length; j++) {
            if (j == doubleArray.length - 1) {
                System.out.print(doubleArray[j] + " ");
            } else {
                System.out.print(doubleArray[j] + ",");
            }
        }
        for (int k = 0; k < charArray.length; k++) {
            if (k == charArray.length - 1) {
                System.out.print(charArray[k] + " ");
            } else {
                System.out.print(charArray[k] + ",");
            }
        }
        System.out.println();
        System.out.println("----------------------------");


        //Task 3
        System.out.println("Task 3");
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(intArray[i]);
                System.out.println();
            } else {
                System.out.print(intArray[i] + ",");
            }
        }
        for (int j = doubleArray.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(doubleArray[j]);
                System.out.println();
            } else {
                System.out.print(doubleArray[j] + ",");
            }
        }
        for (int k = charArray.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.print(charArray[k]);
                System.out.println();
            } else {
                System.out.print(charArray[k] + ",");
            }
        }
        System.out.println("----------------------------");


        //Task 4
        System.out.println("Task 4");
        // before any changes
        System.out.println("Before changes:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();


        //after changes
        System.out.println("After changes:");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 1) {
                intArray[i] += 1;
                System.out.print(intArray[i] + " ");
            } else {
                System.out.print(intArray[i] + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }
}
