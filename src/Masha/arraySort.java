package Masha;

import java.util.Arrays;

/*
Write a return method that can sort an int array in asc order
without using the sort method of the array class
Ex: int[] arr = {10,9,8,7};
arr = Sort(arr); ==> {7,8,9,10};
 */

public class arraySort {

    /*
        int[] arr = {10,9,8,7};
        int[]arrAsc = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--,j++) {
            arrAsc[j] = arr[i];
        }
        System.out.println(Arrays.toString(arrAsc));

         */

    public static int[] reverseArr(int[] arr) {

        int[]arrAsc = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--,j++) {
            arrAsc[j] = arr[i];
        }
        return arrAsc;
    }

    public static void main(String[] args) {
        int[]arr = {10,9,8,7};
        int[]arrAsc = reverseArr(arr);
        System.out.println(Arrays.toString(arrAsc));
    }


}






