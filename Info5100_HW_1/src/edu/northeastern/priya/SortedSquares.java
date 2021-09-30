package edu.northeastern.priya;

import java.util.Arrays;

public class SortedSquares {

    public static void sortedSquares(int arr[]) {
        int n = arr.length;
        System.out.println("Initial array");

        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];

        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        sortedSquares(arr);
        System.out.println("now this is the result");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


        int arr1[] = {-7,-3,2,3,11};
        sortedSquares(arr1);
        System.out.println("now this is the result");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");


    }

}
