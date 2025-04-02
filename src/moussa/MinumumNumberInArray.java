package moussa;

public class MinumumNumberInArray {

    public static void main(String[] args) {


        // Defining an Array of 10 numbers
        int[]numbers={4,2,8,90,7,11,78,56,23,112};

        // return method to find the minimum number in this array
        minimumNumberOfArray(numbers);
        System.out.println("Minimum number is: "+minimumNumberOfArray(numbers));
    }

    // public method with an integer as return type finding the mininum number
    public static int minimumNumberOfArray(int[] numbers) {
       // decalaring at first iteration the number at index 0 minimum
        int min=numbers[0];

        // looping throw the array to compare with that minimum and if the condition
        // is true it replace that number as minimum, keep repeating the same condition
        // until the end of the loop
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }
}
