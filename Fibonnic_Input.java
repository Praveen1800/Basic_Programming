package Practics_Basic_program;

import java.util.Scanner;

public class Fibonnic_Input {
    public static void main(String[] args) {

        int a = 0, b = 1, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int d = sc.nextInt();

        for (int i = 1; i <= d; i++) {

            System.out.println(a + " ");

            c = a + b;
            a = b;
            b = c;

          // without using intput ;

       /* for(int i=1; i<=30; i++){

            System.out.println(a+ " ");

            c = a+b;
            a=b;
            b=c;
        }*/
        }
    }
}
