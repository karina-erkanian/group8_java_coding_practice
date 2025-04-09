package Karina;

import java.util.Arrays;

/*
    Write a return method that can sort an array in Ascending order without the sort method of the Arrays class
    Ex: int[] arr = {10,9,8,7};
    arr = Sort(arr); ==>{7,8,9,10};
     */
public class SortArray {

    public static void main(String[] args) {
        int[]arr = {9,8,3,1,6,7,4,2,5};
        sort(arr);
    }

    public static void sort(int[]arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
