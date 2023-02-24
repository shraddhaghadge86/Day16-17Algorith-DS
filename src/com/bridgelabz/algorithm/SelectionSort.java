package com.bridgelabz.algorithm;

import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallestNumber] > array[j]) {
                    smallestNumber = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallestNumber];
            array[smallestNumber] = temp;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arraySize = scanner.nextInt();
        System.out.println("Enter the values in array");
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        printArray(selectionSort(array));
    }
}
