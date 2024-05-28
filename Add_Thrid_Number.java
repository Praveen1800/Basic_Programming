package Practics_Basic_program;

import java.util.Scanner;
public class Add_Thrid_Number{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter the First Number : ");
        int b = sc.nextInt();

        System.out.println("Enter the First Number : ");
        int c = sc.nextInt();

        int d = a +  b + c;

        System.out.println( "Total = "+ d);
    }
}
