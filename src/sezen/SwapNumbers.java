package sezen;

public class SwapNumbers {
    public static void main(String[] args) {
        // Initial values
        int a = 30;
        int b = 20;

        // Print initial values
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // **Swap using a third variable**
        int temp = a;
        a = b;
        b = temp;

        // Print after swapping with a third variable
        System.out.println("After Swap (Using Third Variable): a = " + a + ", b = " + b);

        // Reinitialize values for the second method
        a = 30;
        b = 20;

        // Swap without using a third variable
        a = a + b; // a becomes 50
        b = a - b; // b becomes 30 (original value of a)
        a = a - b; // a becomes 20 (original value of b)

        // Print after swapping without a third variable
        System.out.println("After Swap (Without Using Third Variable): a = " + a + ", b = " + b);
    }
}

/*
     Swap two integer variable values
     (including both ways; with using a third variable and without it)
     */
