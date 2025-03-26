package Rachid;

public class Reverse {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD")); // Output: DCBA
    }
}
