package Practics_Basic_program;

// Write a program in Check prime Number bettwen Range :

import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
         int j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Number : ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            for ( j = 2; j <= i; j++) {

                if (i % j == 0)
                    break;
            }

            if(i==j)
                System.out.print(j + " ");
        }
    }
}
