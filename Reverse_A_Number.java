package Practics_Basic_program;

// Write a Program in Reverse a Number take user  input

import java.util.Scanner;
public class Reverse_A_Number{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        while(a>0){

            int r = a%10;

            a= a/10;

            System.out.print(r);

        }

    }
}
