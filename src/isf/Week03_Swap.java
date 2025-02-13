package isf;

public class Week03_Swap {

    // Swap two integer variable values
    // (including both ways; with using a third variable and without it)

    public static void main(String[] args) {

        System.out.println("=================Original Values==================");
        // Assign 2 int numbers
        int num1 = 12;
        int num2 = 4;

        // Before any action -> print out int numbers
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("===============Actions=================");

       // Change/re-assign num1 by adding num2 to it
        // Change/re-assign num2 with math calculation from num1
        num1 += num2;
        num2 = num1 - num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("=================Swapping Values===============");


        // Change/re-assign num1 by subtracting num2
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
