package Faris;
/*
 Swap two integer variable values (including both ways; with using a third variable and without it) 😎

 */
public class SwapNumbers {
    public static void main(String[] args) {

       //  using a third variable
        int num1 = 4;
        int num2 = 6;
        int temp =num1;
        num1=num2;
        num2 = temp;

        System.out.println("num1 = "+ num1);
        System.out.println("num2 = " + num2);

        int num11= 3;
        int num22 =8;
         num11 = num11 + num22; // 3 + 8= 11
         num22 = num11 - num22; // 11 - 8 =3
        num11  = num11 - num22; // 11- 3 = 8


        System.out.println("num11= " + num11);
        System.out.println("num22 = " + num22);


    }
}
