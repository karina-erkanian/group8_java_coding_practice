package isf;

public class Week02_FINRA {

    public static void main(String[] args) {

        int num = 30;
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }


        FINRA(30);
        System.out.println("-----------------------");
        FINRA(56);

    }

    public static void FINRA(int num) {

        for (int k = 1; k <= num; k++) {

            if (k % 15 == 0) {
                System.out.println("FINRA");
            } else if (k % 3 == 0) {
                System.out.println("FIN");
            } else if (k % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(k);
            }

        }
    }
}
