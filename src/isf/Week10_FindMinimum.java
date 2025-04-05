package isf;

import com.sun.source.tree.YieldTree;

import java.util.Arrays;

/*
Write a method that can find the minimum number from an int Array
 */
public class Week10_FindMinimum {

    public static void main(String[] args) {

        int [] x = {10, 2, 3, 40, 20};

        int minimum = findMinimum(x);
        System.out.println("minimum = " + minimum);

        int [] y = {5, 4, 6, 22, 4, 2, 13, 1};
        //System.out.println("findMinimum(y) = " + findMinimum(y));

        int [] z = {};
       System.out.println("findMinimum(z) = " + findMinimum(z));


    }

    public static int findMinimum(int[] num){

        if (num == null || num.length == 0) { // Array should not be empty
            System.out.println("This Array is empty"); // if Array is empty display
            return 0;
        }

         //int min = 0;

        // int [] x = {10, 2, 3, 40, 20};
        int min = num [0];// min = 10 (at the moment)

        for (int each : num) { //iterate Array
            if (each < min){ // 10 < 10 (No) -> Next iter, 2 < 10 (Yes)
                min = each; // min = 2 (Assign)
            }
        }
        return min;
    }

}
