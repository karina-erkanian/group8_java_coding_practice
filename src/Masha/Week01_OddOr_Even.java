package Masha;

public class Week01_OddOr_Even {

    public static String EvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num = 7;

        System.out.println(EvenOdd(num));
    }
}

