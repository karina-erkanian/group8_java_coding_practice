package Karina;
public class FindMinimum {

    //Write a method that can find the minimum number from an int Array

    public static void main(String[] args) {

        int[] arr = {9, 4, 3, 9, 0, 7, 4, 5, 6};

        System.out.println("findMin() = " + findMin(arr));

        System.out.println("findMin2() = " + findMin2(arr));
    }

    //First method by using bubble sort
    public static int findMin(int[]arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j]>arr[j+1]){ //comparing number to the one next to it
                    temp = arr[j];
                    arr[j] = arr[j+1]; //swapping numbers
                    arr[j+1]=temp;
                }
            }
        }
        return arr[0];
    }

    //Second way by using comparison
    public static int findMin2(int[]arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){ //comparing current number to the current minimum one
                min=arr[i]; //assigning min to a new smaller number if one found
            }
        }
        return min;
    }
}
