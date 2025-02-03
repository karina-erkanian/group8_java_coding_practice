package Rachid;

public class Finra {
    public static void main(String[] args) {
        FINRA();
    }

    public static void FINRA() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result.append("FINRA");
            else if (i % 3 == 0)
                result.append("FIN");
            else if (i % 5 == 0)
                result.append("RA");
            else
                result.append(i);

            result.append(" "); // Append space for separation
        }

        System.out.println(result.toString().trim()); // Print final result
    }
}
